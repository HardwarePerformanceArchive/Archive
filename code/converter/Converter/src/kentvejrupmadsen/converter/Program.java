    package kentvejrupmadsen.converter;

    import kentvejrupmadsen.converter.configuration.ConfigurationStore;
    import kentvejrupmadsen.converter.configuration.StoreFacade;

    import kentvejrupmadsen.converter.parameters.ParameterConfiguration;
    import kentvejrupmadsen.converter.parameters.ParameterFacade;


    /**
     *
     */
    public class Program
    {
        /**
         *
         * @param args Console Arguments
         */
        public static void main( String[] args )
        {
            Program program = new Program( args );

            program.initialise();
            program.execution();
            program.gc();
        }


        // Variables
        private ParameterFacade parameterInterpreter = null;

        private StoreFacade configurationStore = null;

        private String[] arguments = null;

        private StateController controller = null;


        // Code / Constructors
        /**
         *
         */
        public Program()
        {
            this.setController(
                    new StateController()
            );
        }

        /**
         *
         * @param arguments
         */
        public Program( String[] arguments )
        {
            super();
            this.setArguments( arguments );
        }


        // Code
        /**
         *
         */
        public void initialise()
        {
            this.initialiseConfiguration();
            this.initialiseParameters();
        }


        /**
         *
         */
        protected void initialiseConfiguration()
        {
            ConfigurationStore.getConfiguration().setStateController(
                    this.getController()
            );

            this.setConfigurationStore(
                    ConfigurationStore.getConfiguration()
            );

            this.getConfigurationStore().configure();
        }

        /**
         *
         */
        protected void initialiseParameters()
        {
            ParameterConfiguration.getInterpreter().setStateController(
                    this.getController()
            );

            this.setParameterInterpreter(
                    ParameterConfiguration.getInterpreter()
            );

            this.getParameterInterpreter().configure();
        }

        /**
         *
         */
        public void execution()
        {

        }

        /**
         *
         */
        public void gc()
        {

        }


        // Accessors
        /**
         *
         * @return
         */
        public String[] getArguments()
        {
            return arguments;
        }

        /**
         *
         * @param arguments
         */
        protected void setArguments( String[] arguments )
        {
            this.arguments = arguments;
        }

        /**
         *
         * @return
         */
        public ParameterFacade getParameterInterpreter()
        {
            return parameterInterpreter;
        }

        /**
         *
         * @return
         */
        public StoreFacade getConfigurationStore()
        {
            return configurationStore;
        }

        /**
         *
         * @param configurationStore
         */
        protected void setConfigurationStore( StoreFacade configurationStore )
        {
            this.configurationStore = configurationStore;
        }


        /**
         *
         * @param parameterInterpreter
         */
        protected void setParameterInterpreter( ParameterFacade parameterInterpreter )
        {
            this.parameterInterpreter = parameterInterpreter;
        }

        public StateController getController()
        {
            return controller;
        }

        public void setController( StateController controller )
        {
            this.controller = controller;
        }
    }

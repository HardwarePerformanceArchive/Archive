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

        private ParameterFacade parameterInterpreter = null;

        private StoreFacade configurationStore = null;


        // Code / Constructors
        /**
         *
         */
        public Program()
        {

        }

        /**
         *
         * @param arguments
         */
        public Program( String[] arguments )
        {
            super();

        }


        // Code
        /**
         *
         */
        public void initialise()
        {
            this.setParameterInterpreter(
                    ParameterConfiguration.getInterpreter()
            );

            this.setConfigurationStore(
                    ConfigurationStore.getConfiguration()
            );
        }

        public void execution()
        {

        }

        public void gc()
        {

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
    }

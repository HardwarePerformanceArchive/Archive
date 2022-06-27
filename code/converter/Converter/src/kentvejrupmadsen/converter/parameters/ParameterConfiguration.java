    package kentvejrupmadsen.converter.parameters;


    import kentvejrupmadsen.converter.StateController;


    /**
     *
     */
    public class ParameterConfiguration
            implements ParameterFacade
    {

        // Variables
        private static ParameterConfiguration interpreter = null;
        private StateController state = null;

        // Code
        @Override
        public boolean configure()
        {
            return false;
        }


        // Accessors
        @Override
        public void setStateController( StateController controller )
        {
            this.state = controller;
        }

        public StateController getState()
        {
            return state;
        }

        /**
         *
         * @return Parameter Facade
         */
        public static ParameterFacade getInterpreter()
        {
            if( ParameterConfiguration.interpreter == null )
            {
                ParameterConfiguration.setInterpreter(
                        new ParameterConfiguration() );
            }

            return interpreter;
        }

        /**
         *
         * @param interpreter
         */
        public static void setInterpreter( ParameterConfiguration interpreter )
        {
            ParameterConfiguration.interpreter = interpreter;
        }
    }

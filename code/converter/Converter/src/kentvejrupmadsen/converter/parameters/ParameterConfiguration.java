    package kentvejrupmadsen.converter.parameters;


    /**
     *
     */
    public class ParameterConfiguration
            implements ParameterFacade
    {

        // Variables
        private static ParameterConfiguration interpreter = null;

        //
        /**
         *
         * @return Parameter Facade
         */
        public static ParameterFacade getInterpreter()
        {
            if( ParameterConfiguration.interpreter == null )
            {
                ParameterConfiguration.setInterpreter( new ParameterConfiguration() );
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

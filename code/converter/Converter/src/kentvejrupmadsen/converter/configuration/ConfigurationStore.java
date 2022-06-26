    package kentvejrupmadsen.converter.configuration;


    /**
     *
     */
    public class ConfigurationStore
            implements StoreFacade
    {
        // Code / Constructors
        /**
         *
         */
        public ConfigurationStore()
        {

        }

        // Variables
        private static StoreFacade configuration = null;

        // Code


        // Accessors

        /**
         *
         * @return Configuration Store
         */
        public static StoreFacade getConfiguration()
        {
            if( ConfigurationStore.configuration == null )
            {
                ConfigurationStore.setConfiguration(
                        new ConfigurationStore() );
            }

            return configuration;
        }

        /**
         *
         * @param configuration
         */
        protected static void setConfiguration( ConfigurationStore configuration )
        {
             ConfigurationStore.configuration = configuration;
        }
    }

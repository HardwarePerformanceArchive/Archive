    package kentvejrupmadsen.converter.configuration;


    import kentvejrupmadsen.converter.StateController;

    /**
     *
     */
    public interface StoreFacade
    {
        void setStateController( StateController controller );
        boolean configure();
    }

    package kentvejrupmadsen.converter.parameters;

    import kentvejrupmadsen.converter.StateController;

    public interface ParameterFacade
    {
        void setStateController( StateController controller );
        boolean configure();
    }

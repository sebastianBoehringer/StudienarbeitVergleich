package ShoppingCenter;

import ShoppingCenter.AbstractAufzugState;


 class AufzugFaehrtHochState extends AbstractAufzugState {


    public void entry(){

 
    };
    public void doActivity(){

 
    };
    public void exit(){

 
    };
    public void targetIsReached(){

        exit();

        state_context.transit(state_context.aufzugFaehrtHochState);
    };
}
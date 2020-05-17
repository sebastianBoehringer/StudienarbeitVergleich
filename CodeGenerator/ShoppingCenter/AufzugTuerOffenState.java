package ShoppingCenter;

import ShoppingCenter.AbstractAufzugState;


 class AufzugTuerOffenState extends AbstractAufzugState {


    public void entry(){

 
    };
    public void doActivity(){

 
    };
    public void exit(){

 
    };
    public void closeTheDoors(){

        exit();

        state_context.transit(state_context.aufzugTuerOffenState);
    };
}
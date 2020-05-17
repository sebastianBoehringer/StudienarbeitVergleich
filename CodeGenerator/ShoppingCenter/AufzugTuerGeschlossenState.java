package ShoppingCenter;

import ShoppingCenter.AbstractAufzugState;


 class AufzugTuerGeschlossenState extends AbstractAufzugState {


    public void entry(){

 
    };
    public void doActivity(){

 
    };
    public void exit(){

 
    };
    public void openTheDoors(){

        exit();

        state_context.transit(state_context.aufzugTuerGeschlossenState);
    };
    public void moveFloorsUp(){

        exit();

        state_context.transit(state_context.aufzugTuerGeschlossenState);
    };
    public void moveFloorsDown(){

        exit();

        state_context.transit(state_context.aufzugTuerGeschlossenState);
    };
}
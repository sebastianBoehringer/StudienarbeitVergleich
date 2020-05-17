package ShoppingCenter;

import ShoppingCenter.Aufzug;


 abstract class AbstractAufzugState {
    protected Aufzug state_context;

    public abstract void entry();
    public abstract void doActivity();
    public abstract void exit();
    public void moveFloorsDown(){

 
    };
    public void openTheDoors(){

 
    };
    public void closeTheDoors(){

 
    };
    public void targetIsReached(){

 
    };
    public void moveFloorsUp(){

 
    };
}
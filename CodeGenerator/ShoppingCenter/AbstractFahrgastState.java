package ShoppingCenter;

import ShoppingCenter.Fahrgast;


 abstract class AbstractFahrgastState {
    protected Fahrgast state_context;

    public abstract void entry();
    public abstract void doActivity();
    public abstract void exit();
    public void aufzugDa(){

 
    };
    public void zielErreicht(){

 
    };
}
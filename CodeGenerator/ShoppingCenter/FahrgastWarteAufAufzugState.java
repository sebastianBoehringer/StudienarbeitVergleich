package ShoppingCenter;

import ShoppingCenter.AbstractFahrgastState;


 class FahrgastWarteAufAufzugState extends AbstractFahrgastState {


    public void entry(){

 
    };
    public void doActivity(){

 
    };
    public void exit(){

 
    };
    public void aufzugDa(){

        exit();
System.out.println("Fahrgast betritt Aufzug");
        state_context.transit(state_context.fahrgastWarteAufAufzugState);
    };
}
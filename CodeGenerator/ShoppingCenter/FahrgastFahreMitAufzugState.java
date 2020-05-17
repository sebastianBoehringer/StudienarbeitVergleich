package ShoppingCenter;

import ShoppingCenter.AbstractFahrgastState;


 class FahrgastFahreMitAufzugState extends AbstractFahrgastState {


    public void entry(){

System.out.println("Fahrgast wählt Stockwerk"); 
    };
    public void doActivity(){

 
    };
    public void exit(){

 
    };
    public void zielErreicht(){

        exit();
System.out.println("Fahrgast verlässt Aufzug");
        state_context.transit(state_context.fahrgastFahreMitAufzugState);
    };
}
package ShoppingCenter;

import ShoppingCenter.Etage;
import ShoppingCenter.AbstractFahrgastState;
import ShoppingCenter.Aufzug;


public class Fahrgast {
    public Double Weight;
    public Etage Destination;
    public Aufzug Aufzug;
     AbstractFahrgastState fahrgastFahreMitAufzugState = new FahrgastFahreMitAufzugState();
     AbstractFahrgastState fahrgastEndState = new FahrgastEndState();
     AbstractFahrgastState fahrgastWarteAufAufzugState = new FahrgastWarteAufAufzugState();
    private AbstractFahrgastState current_state = fahrgastWarteAufAufzugState;

    public void aufzugDa(){

        current_state.aufzugDa();

    };
    public void zielErreicht(){

        current_state.zielErreicht();

    };
     void transit(AbstractFahrgastState state){

        current_state = state;
        current_state.entry();
        current_state.doActivity();

    };
}
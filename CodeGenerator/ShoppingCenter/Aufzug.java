package ShoppingCenter;

import java.util.HashSet;
import ShoppingCenter.DoorState;
import ShoppingCenter.Etage;
import ShoppingCenter.AbstractAufzugState;
import ShoppingCenter.Fahrgast;
import java.util.Set;


public class Aufzug {
    public Integer WeightLimit;
    public Double NumberOfPassengers;
    public DoorState Door;
    public Etage CurrentFloor;
     AbstractAufzugState aufzugFaehrtHochState = new AufzugFaehrtHochState();
     AbstractAufzugState aufzugFaehrtRunterState = new AufzugFaehrtRunterState();
     AbstractAufzugState aufzugTuerOffenState = new AufzugTuerOffenState();
     AbstractAufzugState aufzugTuerGeschlossenState = new AufzugTuerGeschlossenState();
    private AbstractAufzugState current_state = aufzugTuerOffenState;

    public void closeDoors(){

Door = DoorState.Closing;
Door = DoorState.Closed;
    };
    public Set<Fahrgast> moveUp(Double numberOfFloors){
        throw new UnsupportedOperationException();

    };
    public Set<Fahrgast> moveDown(Double numberOfFloors){
        throw new UnsupportedOperationException();

    };
    public void openDoors(){

Door = DoorState.Opening;
Door = DoorState.Open;
    };
    public void moveFloorsDown(){

        current_state.moveFloorsDown();

    };
    public void openTheDoors(){

        current_state.openTheDoors();

    };
    public void closeTheDoors(){

        current_state.closeTheDoors();

    };
    public void targetIsReached(){

        current_state.targetIsReached();

    };
    public void moveFloorsUp(){

        current_state.moveFloorsUp();

    };
     void transit(AbstractAufzugState state){

        current_state = state;
        current_state.entry();
        current_state.doActivity();

    };
}
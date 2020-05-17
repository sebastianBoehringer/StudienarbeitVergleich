package ShoppingCenter;

import java.util.HashSet;
import ShoppingCenter.DoorState;
import ShoppingCenter.Etage;
import ShoppingCenter.AbstractAufzugState;
import ShoppingCenter.Fahrgast;
import java.util.Set;


public class Aufzug {
    public Integer WeightLimit;
    public Long NumberOfPassengers;
    public Set<Fahrgast> Passengers;
    public DoorState Door;
    public Etage CurrentFloor;
     AbstractAufzugState aufzugFaehrtHochState = new AufzugFaehrtHochState();
     AbstractAufzugState aufzugFaehrtRunterState = new AufzugFaehrtRunterState();
     AbstractAufzugState aufzugTuerOffenState = new AufzugTuerOffenState();
     AbstractAufzugState aufzugTuerGeschlossenState = new AufzugTuerGeschlossenState();
    private AbstractAufzugState current_state = aufzugTuerOffenState;

    public void openDoors(){

Door = DoorState.Opening;
Door = DoorState.Open;
    };
    public Set<Fahrgast> moveUp(Long numberOfFloors){
        throw new UnsupportedOperationException();

    };
    public void closeDoors(){

Door = DoorState.Closing;
Door = DoorState.Closed;
    };
    public Set<Fahrgast> moveDown(Long numberOfFloors){
        throw new UnsupportedOperationException();

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
package ShoppingCenter;

import java.util.HashSet;
import ShoppingCenter.Etage;
import ShoppingCenter.DoorState;
import ShoppingCenter.Fahrgast;
import java.util.Set;


public class Aufzug {
    public Etage CurrentFloor;
    public Integer WeightLimit;
    public Double NumberOfPassengers;
    public Set<Fahrgast> Passengers;
    public DoorState Door;

    public Set<Fahrgast> moveDown(Double numberOfFloors){
        closeDoors();
        while( numberOfFloors > 0){
            CurrentFloor = CurrentFloor.Previous;
            numberOfFloors--;

        }
        openDoors();
    throw new UnsupportedOperationException();};
    public Set<Fahrgast> moveUp(Double numberOfFloors){
        closeDoors();
        while( numberOfFloors > 0){
            CurrentFloor = CurrentFloor.Next;
            numberOfFloors--;

        }
        openDoors();
    throw new UnsupportedOperationException();};
    public void closeDoors(){
        if (Door == DoorState.Opening){
            Door = DoorState.Closing;
            Door = DoorState.Closed;

        }
        else if (Door == DoorState.Open){

        }
        else if (Door == DoorState.Closing || Door == DoorState.Closed){

        }

    throw new UnsupportedOperationException();};
    public void openDoors(){
        if (Door == DoorState.Opening || Door == DoorState.Open){
            Door = DoorState.Opening;
            Door = DoorState.Open;

        }
        else if (Door == DoorState.Closed || Door == DoorState.Closing){

        }

    throw new UnsupportedOperationException();};
}
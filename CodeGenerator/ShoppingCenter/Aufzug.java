package ShoppingCenter;

import ShoppingCenter.DoorState;
import ShoppingCenter.Etage;
import ShoppingCenter.Fahrgast;


public class Aufzug {
    public Fahrgast Passengers;
    public Double NumberOfPassengers;
    public DoorState Door;
    public Etage CurrentFloor;
    public Integer WeightLimit;

    public void closeDoors(){
        if (Door == DoorState.Open){
            Door = DoorState.Closing;
            Door = DoorState.Closed;

        }
        else if (Door == DoorState.Opening){

        }
        else if (Door == DoorState.Closing || Door == DoorState.Closed){

        }

    throw new UnsupportedOperationException();};
    public Fahrgast moveUp(Double numberOfFloors){
        closeDoors();
        while( numberOfFloors > 0){
            CurrentFloor = CurrentFloor.Next;
            numberOfFloors--;

        }
        openDoors();
    throw new UnsupportedOperationException();};
    public Fahrgast moveDown(Double numberOfFloors){
        closeDoors();
        while( numberOfFloors > 0){
            CurrentFloor = CurrentFloor.Previous;
            numberOfFloors--;

        }
        openDoors();
    throw new UnsupportedOperationException();};
    public void openDoors(){
        if (Door == DoorState.Closed || Door == DoorState.Closing){
            Door = DoorState.Opening;
            Door = DoorState.Open;

        }
        else if (Door == DoorState.Opening || Door == DoorState.Open){

        }

    throw new UnsupportedOperationException();};
}
package aufzug.ShoppingCenter;

import aufzug.exception.InvalidDoorState;

public class Aufzug {
	public UnlimitedNatural NumberOfPassengers;
	public java.util.Vector<Fahrgast> Passengers;
	public int WeightLimit = 2400;
	public Etage CurrentFloor;
	public DoorState Door;

	public Fahrgast moveUp(UnlimitedNatural numberOfFloors) throws InvalidDoorState {
		throw new UnsupportedOperationException();
	}

	public Fahrgast moveDown(UnlimitedNatural numberOfFloors) throws InvalidDoorState {
		throw new UnsupportedOperationException();
	}

	public void openDoors() {
		throw new UnsupportedOperationException();
	}

	public void closeDoors() {
		throw new UnsupportedOperationException();
	}
}
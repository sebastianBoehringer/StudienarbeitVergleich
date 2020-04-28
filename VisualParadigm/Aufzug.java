public class Aufzug implements  {
	public UnlimitedNatural numberOfPassengers;
	public java.util.Vector<Fahrgast> passengers;
	public int weightLimit = 2400;
	public Etage currentFloor;
	public DoorState door;

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
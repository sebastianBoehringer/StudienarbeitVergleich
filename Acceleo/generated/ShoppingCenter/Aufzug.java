package ShoppingCenter;
public class Aufzug {

	private UnlimitedNatural NumberOfPassengers;

	private Integer WeightLimit;

	private Etage CurrentFloor;

	private DoorState Door;

	private Fahrgast Passengers;
 
	public UnlimitedNatural getNumberOfPassengers(){
		return this.NumberOfPassengers;
	}

	public Integer getWeightLimit(){
		return this.WeightLimit;
	}

	public Etage getCurrentFloor(){
		return this.CurrentFloor;
	}

	public DoorState getDoor(){
		return this.Door;
	}

	public Fahrgast getPassengers(){
		return this.Passengers;
	}

	public void setNumberOfPassengers(UnlimitedNatural NumberOfPassengers){
		this.NumberOfPassengers = NumberOfPassengers;
	}

	public void setWeightLimit(Integer WeightLimit){
		this.WeightLimit = WeightLimit;
	}

	public void setCurrentFloor(Etage CurrentFloor){
		this.CurrentFloor = CurrentFloor;
	}

	public void setDoor(DoorState Door){
		this.Door = Door;
	}

	public void setPassengers(Fahrgast Passengers){
		this.Passengers = Passengers;
	}

	public Fahrgast moveUp(UnlimitedNatural numberOfFloors, Fahrgast passengers){
		throw new UnsupportedOperationException();
	}

	public Fahrgast moveDown(UnlimitedNatural numberOfFloors, Fahrgast passengers){
		throw new UnsupportedOperationException();
	}

	public void openDoors(){
		throw new UnsupportedOperationException();
	}

	public void closeDoors(){
		throw new UnsupportedOperationException();
	}
}

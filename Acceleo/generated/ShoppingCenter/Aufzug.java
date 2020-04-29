package ShoppingCenter
public class Aufzug {

	private UnlimitedNatural NumberOfPassengers;

	private Fahrgast Passengers;

	private Integer WeightLimit;

	private Etage CurrentFloor;

	private DoorState Door;
 
	public UnlimitedNatural getNumberOfPassengers(){
		return this.NumberOfPassengers;

	public Fahrgast getPassengers(){
		return this.Passengers;

	public Integer getWeightLimit(){
		return this.WeightLimit;

	public Etage getCurrentFloor(){
		return this.CurrentFloor;

	public DoorState getDoor(){
		return this.Door;

	public void setNumberOfPassengers(UnlimitedNatural NumberOfPassengers){
		this.NumberOfPassengers = NumberOfPassengers;
	}

	public void setPassengers(Fahrgast Passengers){
		this.Passengers = Passengers;
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

	public Fahrgast moveUp(UnlimitedNatural numberOfFloors, Fahrgast passengers){
		throw new UnsupportedOperationException();
	}

	public Fahrgast moveDown(UnlimitedNatural numberOfFloors, Fahrgast passengers){
		throw new UnsupportedOperationException();
	}

	public invalid openDoors(){
		throw new UnsupportedOperationException();
	}

	public invalid closeDoors(){
		throw new UnsupportedOperationException();
	}
}

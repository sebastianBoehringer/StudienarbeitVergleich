package ShoppingCenter;
public class Fahrgast {

	private Real Weight;

	private Etage Destination;

	private Aufzug Aufzug;
 
	public Real getWeight(){
		return this.Weight;
	}

	public Etage getDestination(){
		return this.Destination;
	}

	public Aufzug getAufzug(){
		return this.Aufzug;
	}

	public void setWeight(Real Weight){
		this.Weight = Weight;
	}

	public void setDestination(Etage Destination){
		this.Destination = Destination;
	}

	public void setAufzug(Aufzug Aufzug){
		this.Aufzug = Aufzug;
	}

}

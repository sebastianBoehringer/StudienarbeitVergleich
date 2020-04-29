package ShoppingCenter
public class Etage {

	private Integer Number;

	private String Name;

	private Etage Next;

	private Etage Previous;
 
	public Integer getNumber(){
		return this.Number;

	public String getName(){
		return this.Name;

	public Etage getNext(){
		return this.Next;

	public Etage getPrevious(){
		return this.Previous;

	public void setNumber(Integer Number){
		this.Number = Number;
	}

	public void setName(String Name){
		this.Name = Name;
	}

	public void setNext(Etage Next){
		this.Next = Next;
	}

	public void setPrevious(Etage Previous){
		this.Previous = Previous;
	}

}


public abstract class Carnivore extends Animal{

	public Carnivore(String name, double poids){
		super(name,poids);
	}
	
	public Ration calculRation(){
		return new Ration(0,this.poids/4);
		
	}
}

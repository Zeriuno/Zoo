
public abstract class Herbivore extends Animal{

	private double cerealeQuotidien;

	public Herbivore(String name, double poids, double cerealeQuotidien){
		super(name,poids);
		this.cerealeQuotidien=cerealeQuotidien;
	}
	
	public Ration calculRation(){
		return new Ration(this.cerealeQuotidien,0);
	}

}

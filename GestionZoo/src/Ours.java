
public class Ours extends Carnivore implements Hibernant{
	private boolean enHib=false;
	
	public Ours(String nom, double poids){
		super(nom,poids);
	}
	public void debutHibernation() {
		this.enHib=true;
	}
	public void finHibernation() {
		this.enHib=false;
	}
	public boolean enHibernation() {
		return this.enHib;
	}
	
	public Ration calculRation(){
	 if (this.enHibernation())
		 return new Ration(0,0);
	 else return super.calculRation();
	}
	
	
	
}

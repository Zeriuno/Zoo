
public class Marmotte extends Herbivore implements Hibernant{
	private boolean enHib=false;
	
	public Marmotte(String nom, double poids, double cereale){
		super(nom,poids,cereale);
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
}

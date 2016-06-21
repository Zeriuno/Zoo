
public class Ration {
	private double pdsCereale;
	private double pdsViande;
	
	public Ration(){
		pdsCereale = 0;
		pdsViande = 0;
	}
	public Ration(double pdsCereale, double pdsViande){
		this.pdsCereale=pdsCereale;
		this.pdsViande=pdsViande;
	}
	
	
	public String toString(){
		return "viande : "+pdsViande+", cereale : "+pdsCereale;
	}
	
	public Ration somme(Ration that){
		return new Ration(this.pdsCereale+that.pdsCereale, 
				this.pdsViande+that.pdsViande);
	}
}

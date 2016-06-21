import java.util.ArrayList;


public class Zoo {
	private ArrayList<Animal> animaux=new ArrayList<Animal>();
	
	public void ajoutAnimal(Animal a){
		animaux.add(a);
	}
	
	public Ration calculRationTotale(){
		Ration r = new Ration();
		for(Animal a : animaux )
		{
			if(a instanceof Hibernant)
			{
				if(((Hibernant) a).enHibernation())
				{
					break;
				}
			}
			else
				r= r.somme(a.calculRation());
		}
		return r;
	}
	
	
	public String quiHiberne(){
		StringBuilder liste = new StringBuilder();
		
		for (Animal a : animaux)
		{
			if(a instanceof Hibernant)
			{
				if(((Hibernant) a).enHibernation())
				{
					liste = liste.append(a.toString());
				}
			}
		}
		return liste.toString() ;
	}
	
	
	
}

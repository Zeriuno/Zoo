
public class testZoo {

	public static void main(String[] args) {
		Giraffe g = new Giraffe("Sophie", 500,30);
		Lion l = new Lion("Simba", 250);
		Ours o = new Ours("Winnie",500);
		
		Zoo z = new Zoo();
		z.ajoutAnimal(l);
		z.ajoutAnimal(g);
		z.ajoutAnimal(o);
		System.out.println(z.calculRationTotale());
		o.debutHibernation();
		System.out.println(z.calculRationTotale());
			
	}

}


public class Animal {
	
	private int identifiant  ;
	private String nomAnimal ;
	private double poids     ;
	
	private static int compteur = 1 ;
	
	public Animal(String nomAnimal, double poids)
	{
		this.identifiant = compteur ;
		Animal.compteur++           ;
		
		this.nomAnimal = nomAnimal  ;
		this.poids = poids          ;
	}
	
	public String toString()
	{
		StringBuilder s = new StringBuilder() ;
		s.append(identifiant)               ;
		s.append(", ")                      ;
		s.append(nomAnimal)                 ;
		s.append(", ")                      ;
		s.append(poids)                     ;
		s.append(" Kg\n")                   ;
		return s.toString()                 ;
	}
}

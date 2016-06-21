
public abstract class Animal {
private int id;
private String name;
protected double poids;
private static int cpt=0;

public Animal(String name, double poids){
	this.name=name;
	this.poids=poids;
	this.id=cpt++;
}

public String toString(){
	return name+", n°"+id+", "+poids+"kg";
}

public abstract Ration calculRation();

}

package jobs;

class Medecin extends Personne {
	
public Medecin(String nom,int age) {
	super(nom,age);
	this.nom=nom;
	this.age=age;
}
 void afficher() {
	System.out.println("je suis "+this.nom+",j'ai "+this.age+"et je travail en tant que medcin!");
}
}

package jobs;

class Opticiennne extends Personne {
	public Opticiennne(String nom,int age) {
		super(nom,age);
		this.nom=nom;
		this.age=age;
	}
	public  void afficher() {
		System.out.println("je suis "+this.nom+",j'ai "+this.age+"et je travail en tant que Opticinnne!");
	}
}

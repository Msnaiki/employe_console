package jobs;

abstract class Personne {
	protected String nom;
	protected int age;
	public Personne(String nom, int age) {
		this.nom=nom;
		this.age=age;
	}
	abstract void afficher();

}

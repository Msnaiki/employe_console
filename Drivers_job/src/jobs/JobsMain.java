package jobs;
//mehdi snaiki
public class JobsMain {

	public static void main(String[] args) {
		Personne[] personne =new Personne[2];
		personne[0] = new Medecin("Maher",31);
		personne [1] = new Opticiennne("Iman",33);
		for(int i =0; i< personne.length;i++) {
			personne[i].afficher();
		}
	}

}

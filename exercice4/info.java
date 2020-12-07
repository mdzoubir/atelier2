package exercice4;

public class info {
	private String nom;
	private String adresse;
	private double solde;

	public void afficherInfosSolde(String nom, String adrese, double solde) {
		this.nom = nom;
		this.adresse = adrese;
		this.solde = solde;
		System.out.println(nom + " à " + "(" + adresse + ")"
				+ " - infos solde " + solde + "dh");
	}

	public void calculerInterer(double tauxInteret) {
		double res = this.solde * tauxInteret;
		System.out.println("intérêts=" + res);
	}

}

package Exercice6;

public class retirer {
	private String nom;
	private String adresse;
	private double solde;

	public void info(String nom, String adresse, double solde) {
		this.nom = nom;
		this.adresse = adresse;
		this.solde = solde;
	}

	public void retirer(double m) {
		if (this.solde > m) {
			System.out.println("l'op�ration r�ussie('-')");
			double v = this.solde - m;
			System.out.println("votre nouveau solde : " + v);
		} else {
			System.out.println("L'op�ration a �chou� !!!");
			System.out.println("Vous n'avez pas ce montant");
		}
	}
}

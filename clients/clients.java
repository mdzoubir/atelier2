package clients;

public class clients {
	String nom;
	String adresse;
	double solde;

	public clients(String nomCleint, String adresseCleint, double soldeCleint) {
		nom = nomCleint;
		adresse = adresseCleint;
		solde = soldeCleint;
		System.out.println(nom + " à " + "(" + adresse + ")"
				+ " - infos solde " + solde + "dh");
	}
}

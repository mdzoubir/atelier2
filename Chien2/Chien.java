package Chien2;

public class Chien {
	String nom;

	public String aboyer() {
		if (nom == "Rex") {
			System.out
					.println("Je suis en col�re. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! - Je mange de la viande");
		} else if (nom == "Max") {
			System.out
					.println("Je ne suis pas du tout en col�re. Iwiw !! awaw !! - Je mange du poisson");
		}
		return nom;

	}

	public String manger() {
		if (nom == "Rex") {
			System.out
					.println("Je suis en col�re. Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! - Je mange de la viande");
		} else if (nom == "Max") {
			System.out
					.println("Je ne suis pas du tout en col�re. Iwiw !! awaw !! - Je mange du poisson");
		}
		return nom;
	}
}

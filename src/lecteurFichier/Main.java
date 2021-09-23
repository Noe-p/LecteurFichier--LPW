package lecteurFichier;

public class Main {

	public static void main(String[] args) {
		
		String file = "src/lecteurFichier/test.txt";
		
		AffichageFichier fichier = new AffichageFichier(file); 
		fichier.lireFichierTexte();
		fichier.affichFichier();
		
		AffichageInverse fichierInv = new AffichageInverse(file);
		fichierInv.lireFichierTexte();
		fichierInv.affichFichier();
		
		AffichagePalindromique fichierPal = new AffichagePalindromique(file);
		fichierPal.lireFichierTexte();
		fichierPal.affichFichier();

	}

}

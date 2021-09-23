package lecteurFichier;import java.util.*;


public class AffichageInverse extends LecteurFichierTexte {
	private String file; 
	
	public AffichageInverse(String file) {
		this.file = file;
	}
	
	@Override
	public void lireFichierTexte() {
		super.lireFichierTexte(file);
	}
	
	public void affichFichier() {
		Collections.reverse(super.texte);
		System.out.println("\n***Affichage du fichier en affichage inversée :***");
		for(int i=0; i< super.texte.size(); i++) {
			System.out.println(super.texte.get(i));
		}
	}

	
}

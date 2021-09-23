package lecteurFichier;

public class AffichageFichier extends LecteurFichierTexte {
	private String file; 
	
	public AffichageFichier(String file) {
		this.file = file; 
	}
	
	@Override
	public void lireFichierTexte() {
		super.lireFichierTexte(file);
	}
	
	public void affichFichier() {
		System.out.println("***\nAffichage du fichier :***");
		for(int i=0; i< super.texte.size(); i++) {
			System.out.println(super.texte.get(i));
		}
	}
	
}

package lecteurFichier;

public class AffichagePalindromique extends LecteurFichierTexte {
	private String file; 
	
	public AffichagePalindromique(String file) {
		this.file = file; 
	}
	
	@Override
	public void lireFichierTexte() {
		super.lireFichierTexte(file);
	}
	
	public void affichFichier() {
		System.out.println("\n***Affichage du fichier en affichage Palindromique :***");
		String texteStr=""; 
		String texteReverse = "";
		
		for(int i=0; i<super.texte.size(); i++) {
			texteStr = texteStr+super.texte.get(i);
			texteStr = texteStr+"\n";
		}
		
		for(int i=texteStr.length()-1; i>=0;i--) {
			texteReverse = texteReverse+texteStr.charAt(i);
		}
		
		System.out.println(texteStr);
		System.out.println(texteReverse);
	}
}

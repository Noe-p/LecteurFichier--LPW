package lecteurFichier;

import java.io.*;
import java.util.ArrayList;

public abstract class LecteurFichierTexte implements LecteurInterface{
	
	private FileInputStream fileIn; 
	private BufferedReader br;
	protected ArrayList<String> texte; 
	
	public LecteurFichierTexte() {
		this.fileIn = null; 
		this.br = null; 
		this.texte = new ArrayList<String>();
	}

	public void lireFichierTexte(String file) {
		try {
			this.fileIn = new FileInputStream(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		InputStreamReader isr = new InputStreamReader(fileIn);
		this.br = new BufferedReader(isr);
		
		try {
			String line; 
			while((line = this.br.readLine()) != null) {
				this.texte.add(line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if ( this.fileIn != null ) {
				try {
					this.fileIn.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}

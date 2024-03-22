package file;

import java.io.File;
import java.io.IOException;

public class ManipolazioneFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creaFile();
		verificaEsistenzaFile();
		}

	public static void creaFile() {
		File fileDiTesto = new File("testo.txt");
		
		try {
			boolean riuscito = fileDiTesto.createNewFile();
			if (riuscito == true) {
				System.out.println("Creazione file riuscita");
			} else {
				System.out.println("Creazione file fallita");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Errore durante la creazione");
		}
	}
	
	public static void verificaEsistenzaFile() {
		File f = new File("testo.txt");
		
		if (f.exists()) {
			System.out.println("File esiste");
		} else {
			System.out.println("File non esiste");
		}
	}
	
	
	
	
	
	
	
	
	
	
}

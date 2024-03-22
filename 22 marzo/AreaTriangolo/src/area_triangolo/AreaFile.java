package area_triangolo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AreaFile implements AreaInterface {

	@Override
	public int calcolaArea() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("testo.txt"));
		
			String linea;
			
			
				String line = reader.readLine();
	            int numero1 = Integer.parseInt(line);
	            

	            line = reader.readLine();
	            int numero2 = Integer.parseInt(line);
				
	            
	            reader.close();
	            System.out.println("Area calcolata da file");
			return (numero1 * numero2)/2;
		}catch(IOException e) {
			System.out.println("Errore nella lettura");
		}
		return 0;
		
	} 
	

}

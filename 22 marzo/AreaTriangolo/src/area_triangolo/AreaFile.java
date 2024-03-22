package area_triangolo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AreaFile implements AreaInterface {

	@Override
	public double calcolaArea() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("testo.txt"));
		
			
			
				String line = reader.readLine();
	            double numero1 = Double.parseDouble(line);
	            

	            line = reader.readLine();
	            double numero2 = Double.parseDouble(line);
				
	            
	            reader.close();
	            System.out.println("Area calcolata da file");
			return (numero1 * numero2)/2;
		}catch(IOException e) {
			System.out.println("Errore nella lettura");
		}
		return 0;
		
	} 
	

}

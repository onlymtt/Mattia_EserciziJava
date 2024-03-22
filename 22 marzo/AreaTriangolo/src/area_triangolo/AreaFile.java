package area_triangolo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AreaFile implements AreaInterface {

	@Override
	public double calcolaArea() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("testo.txt"));
				double[] baseAltezza = new double[2];
				int i = 0;
				String line;
				
				while((line = reader.readLine()) != null && i < 2) {
					
					baseAltezza[i] = Double.parseDouble(line);
					i++;
				}
	            
	            reader.close();
	            System.out.println("Area calcolata da file");
			return (baseAltezza[0] * baseAltezza[1])/2;
		}catch(IOException e) {
			System.out.println("Errore nella lettura");
		}
		return 0;
		
	} 
	

}

package area_triangolo;

/**
 * classe per l'oggetto triangolo*/
public class Triangolo {
	
	
	private AreaInterface area;
	
	//dependency injection
	/**
	 * costruttore della classe
	 * @param area variabile del tipo interfaccia per fare la dependency injection*/
	public Triangolo( AreaInterface area) {
		this.area = area;
	}

	/**
	 * metodo che richiama il metodo dell'interfaccia, si specializzerà dopo
	 * @return calcola l'area come double*/
	public double calcola() {
		
		return this.area.calcolaArea();
	}

	
	
	
}

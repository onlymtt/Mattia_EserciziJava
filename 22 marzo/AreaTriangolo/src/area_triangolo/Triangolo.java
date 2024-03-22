package area_triangolo;

public class Triangolo {
	
	
	private AreaInterface area;
	
	//dependency injection
	public Triangolo( AreaInterface area) {
		super();
		this.area = area;
	}


	public double calcola() {
		
		return this.area.calcolaArea();
	}

	
	
	
}

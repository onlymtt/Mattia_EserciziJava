package area_triangolo;

public class Triangolo {
	private int base;
	private int altezza;
	
	
	private AreaInterface area;
	
	public Triangolo( AreaInterface area) {
		super();
		this.area = area;
	}


	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public int getAltezza() {
		return altezza;
	}


	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}


	public int calcola() {
		
		return this.area.calcolaArea();
	}

	
	
	
}

package area_triangolo;

/**
 * classe che implementa il metodo calcoloArea da un array*/
public class AreaArray implements AreaInterface{

	private double[] array = {5, 6};
	@Override
	/**
	 * metodo ereditato, calcola l'area da un array
	 * @return ritorna l'area come double*/
	public double calcolaArea() {
		System.out.println("Area calcolata da array");
		return (array[0] * array[1])/2;
		
	}
	
}

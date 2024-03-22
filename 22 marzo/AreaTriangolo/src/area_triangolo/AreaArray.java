package area_triangolo;

public class AreaArray implements AreaInterface{

	private double[] array = {5, 6};
	@Override
	public double calcolaArea() {
		System.out.println("Area calcolata da array");
		return (array[0] * array[1])/2;
		
	}
	
}

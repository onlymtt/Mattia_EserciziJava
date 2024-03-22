package area_triangolo;

public class AreaArray implements AreaInterface{

	private int[] array = {5, 6};
	@Override
	public int calcolaArea() {
		System.out.println("Area calcolata da array");
		return (array[0] * array[1])/2;
		
	}
	
}

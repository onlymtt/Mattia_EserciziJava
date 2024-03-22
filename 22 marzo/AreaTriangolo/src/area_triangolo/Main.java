package area_triangolo;

public class Main {

	public static void main(String[] args) {
		
		AreaInterface areaArray = new AreaArray();
		AreaInterface areaFile = new AreaFile();
		
		//calcolo da array
;		Triangolo triangolo = new Triangolo(areaArray);
		double area = triangolo.calcola();
		System.out.println(area);
		
		
		//calcolo da file
		triangolo = new Triangolo(areaFile);
		area = triangolo.calcola();
		System.out.println(area);
	}

}

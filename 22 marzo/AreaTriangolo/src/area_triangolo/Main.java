package area_triangolo;

import java.sql.SQLException;
/**
 * Entrypoint del software 
 * @param args argomenti del main*/
public class Main {

	public static void main(String[] args) {
		
		try {
			AreaInterface areaArray = new AreaArray();
			AreaInterface areaFile = new AreaFile();
			AreaInterface areaDb = new AreaDb();
			 
			
			//calcolo da array
;		Triangolo triangolo = new Triangolo(areaArray);
			double area = triangolo.calcola();
			System.out.println(area);
			
			
			//calcolo da file
			triangolo = new Triangolo(areaFile);
			area = triangolo.calcola();
			System.out.println(area);
			
			//calcolo da db
			triangolo = new Triangolo(areaDb);
			area = triangolo.calcola();
			System.out.println(area);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

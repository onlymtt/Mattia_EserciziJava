package database;

import java.sql.SQLException;
/**
 * Classe main*/
public class Main {
	/**
	 * entrypoint
	 * @param args argomenti per il main
	 * @throws SQLException eccezione sql*/
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Database db = new Database();
		db.test();
	}

}

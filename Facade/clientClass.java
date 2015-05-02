package Facade;


public class clientClass {

public static void main (String[] args) {
	JDBC jdbc = new JDBCFacade();
	jdbc.executeQuery();
}
}

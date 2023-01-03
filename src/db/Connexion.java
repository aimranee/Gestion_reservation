package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	private static Connection con;
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drive OK");
            con = DriverManager.getConnection("jdbc:mysql://localhost/java_db","root","");
            System.out.println("connection DB OK");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getCon() {
        return con;
    }
}

package GK;
import java.sql.Connection;
import java.sql.DriverManager;
public class Database {
public  static Connection getCon() {
String DB_URL = "jdbc:mysql://localhost:3306/hotel";
String USER_NAME = "root";
String PASSWORD = "";
Connection con = null;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	System.out.println("connect successfully!");
} catch (Exception ex) {
	System.out.println("connect failure!");
	ex.printStackTrace();
}
return con;

}
    
}

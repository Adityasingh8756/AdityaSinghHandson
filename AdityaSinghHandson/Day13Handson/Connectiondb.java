package Day13Handson;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connectiondb {
	public static Connection getconnection() throws Exception
	{
		Connection conn = null;
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 //create connection
	 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagemnt", "root", "root");
	 return conn;
	}

}

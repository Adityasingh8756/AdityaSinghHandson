package Day13Handson;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDemo2 {

 public static void main(String[] args) throws Exception

 {

 Class.forName("com.mysql.cj.jdbc.Driver");

 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/glpractice", "root", "root");
//String query="insert into employee values(?,?,?,?,?)";
// //Statement st=con.createStatement();
//PreparedStatement ps =con.prepareStatement(query);
// //String query="select * from employee ";
//ps.setInt(1,199);
//ps.setNString(2, "ADitya");
//ps.setNString(3, "Singh");
//ps.setInt(4, 300);
//ps.setFloat(5,55000f);
 /*String query ="update employee set salary=? where employee_id=?";
 PreparedStatement ps =con.prepareStatement(query);
 ps.setFloat(1,5000f);
 ps.setInt(2,199);
 int i=ps.executeUpdate();*/
 String query ="update employee set salary=? where employee_id=?";
 PreparedStatement ps =con.prepareStatement(query);
 ps.setFloat(1,5000f);
 ps.setInt(2,199);
 int i=ps.executeUpdate();
if(i>0) {
	
	System.out.println("suceess");
	
        }
 

 }

}

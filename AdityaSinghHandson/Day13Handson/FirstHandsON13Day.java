package Day13Handson;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstHandsON13Day {

 public static void main(String[] args) throws Exception

 {

//register driver
 Class.forName("com.mysql.cj.jdbc.Driver");
 //create connection
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/glpractice", "root", "root");

 Statement st = con.createStatement();
 
 //Displaying employee_id and name from employee database
 String query = "select employee_id,first_name,Last_name from employee";
 ResultSet  i = st.executeQuery(query);
  while(i.next())
  {
	
	  System.out.println(i.getInt(1)+"  "+i.getString(2));
  }
  
  System.out.println("\n\n");
  System.out.println("Details whoes salary is between 1000 and 20000\n\n");
  String query2="select * from employee where salary>1000 and salary<20000";
  ResultSet  rs = st.executeQuery(query2);
  while(rs.next())
  {
	
	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getFloat(5));
  }
  
  

 
 
 }

}
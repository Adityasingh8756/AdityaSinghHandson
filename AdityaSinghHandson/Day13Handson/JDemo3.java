package Day13Handson;

import java.sql.CallableStatement;

import java.sql.Connection;

import java.sql.DriverManager;

public class JDemo3 {

 public static void main(String[] args) throws Exception

 {

 Class.forName("com.mysql.cj.jdbc.Driver");

 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/glpractice", "root", "root");

 CallableStatement cs=con.prepareCall("call simple(?,?,?,?,?)");

 cs.setInt(1, 555);

 cs.setString(2, "dinesh");
 cs.setString(3, "Singh");
 cs.setInt(4, 89);

 cs.setFloat(5, 28000);

 cs.execute();

 System.out.println("success");

 }

}
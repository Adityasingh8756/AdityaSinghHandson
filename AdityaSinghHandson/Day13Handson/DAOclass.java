package Day13Handson;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOclass {
	//connection

	private Connection conn = null;
	PreparedStatement ps = null;
	
	public DAOclass()  {
		try {
			conn = Connectiondb.getconnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Inserting the data into database;
	
	public boolean insert(int rollno,String name,String grade,String dob,double fee)
	{
		String query="insert into studentinfo values(?,?,?,?,?)";
		 try {
			ps=conn.prepareStatement(query);
			ps.setInt(1, rollno);
			ps.setString(2, name);
			ps.setString(3,grade);
			ps.setNString(4,dob );
			ps.setDouble(5, fee);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	public boolean delete(int rollno)
	{
		try
		{
			String query="delete from studentinfo where rollno=?";
			ps=conn.prepareStatement(query);
			ps.setInt(1, rollno);
			ps.executeUpdate();	
			return true;
		}
		 catch (SQLException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
		}	
	}
	public boolean modify(int rollno,double fee)
	{
		try
		{
			String query="update studentinfo set fee=? where rollno=?";
			ps=conn.prepareStatement(query);
			ps.setDouble(1, fee);
			ps.setInt(2,rollno);
			ps.executeUpdate();
			return true;
		}
		 catch (SQLException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
		}
	}
	public boolean display(int rollno)
	{
		try
		{
			String query="select * from studentinfo where rollno=?";
			ps=conn.prepareStatement(query);
			ps.setInt(1,rollno);
			ResultSet rs=ps.executeQuery();
			 while(rs.next())
			  {
				
				  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getFloat(5));
			  }
			return true;
		}
		 catch (SQLException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
		}
	}
	public boolean display() {
		String query = "SELECT * FROM stdentinfo";
		
		try {
			ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			 while(rs.next())
			  {
				
				  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getFloat(5));
			  }
			return true;
		}
		 catch (SQLException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
		}
	}
}

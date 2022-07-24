package Ninth_DayHandson;

public class TestContact {
	public static void main(String[] args) {
		Contact con = new Contact();
		
		con.addContact("Aditya", 245365);
		con.addContact("Abhigyan", 6342178);
		con.addContact("Shivam", 9854887);
				
        System.out.println( "Aditya  "+con.CheakContactName("Aditya"));
	System.out.println("6342178  "+con.CheakContactNumber(6342178));
		
		System.out.println();
		con.ShowHash();
      }
}

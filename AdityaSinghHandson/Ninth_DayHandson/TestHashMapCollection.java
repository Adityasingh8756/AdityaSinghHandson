// Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
//
//The program should use appropriate generics (String, Integer) and have the following abilities:
//
//a) Check if a particular key exists or not.
//
//b) Check if a particular value exists or not.
//
//c) Use Iterator to loop through the map.
//




package Ninth_DayHandson;

public class TestHashMapCollection {
	public static void main(String[] args) {
		HashMapCollection h2 = new HashMapCollection();
		
		h2.addName("Aditya", "Singh");
		h2.addName("Abhigyan", "Ranjan");
		h2.addName("Shivam", "Tiwari");
				
        System.out.println( h2.CheakName("Aditya"));
	System.out.println(h2.CheakSurName("Singh"));
		
		System.out.println();
		h2.ShowHash();

}
}

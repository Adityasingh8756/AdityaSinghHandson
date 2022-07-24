package Eighth_DayHandson;

import java.util.TreeSet;
import java.util.Iterator;

class Country2 {
	TreeSet<String> T1 = new TreeSet<>();
	
public	TreeSet<String> saveCountry(String CountryName)
	{
		T1.add(CountryName);
		return T1;
	}


public String getCountry(String CountryName) {
	Iterator<String> it = T1.iterator();
	
	while (it.hasNext()) {
		if (it.next().equals(CountryName))
			return CountryName;
	}
	
	return null;
}
}

public class TreeSetCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Country2 co=new Country2();
		co.saveCountry("India");
		co.saveCountry("USA");
		co.saveCountry("Sri Lanka");
		System.out.println(co.getCountry("India"));
		System.out.println(co.getCountry("China"));

	}

}

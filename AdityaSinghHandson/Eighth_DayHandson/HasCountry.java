package Eighth_DayHandson;

import java.util.HashSet;
import java.util.Iterator;
class Country1 {
	HashSet<String> H1 = new HashSet<>();
	
public	HashSet<String> saveCountry(String CountryName)
	{
		H1.add(CountryName);
		return H1;
	}


public String getCountry(String CountryName) {
	Iterator<String> it = H1.iterator();
	
	while (it.hasNext()) {
		if (it.next().equals(CountryName))
			return CountryName;
	}
	
	return null;
}
}

public class HasCountry {
	public  static void  main(String args[])
	{
		Country1 co=new Country1();
		co.saveCountry("India");
		co.saveCountry("USA");
		co.saveCountry("Sri Lanka");
		System.out.println(co.getCountry("India"));
		System.out.println(co.getCountry("China"));
		
	}

}

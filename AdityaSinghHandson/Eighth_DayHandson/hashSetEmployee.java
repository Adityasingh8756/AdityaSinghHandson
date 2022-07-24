package Eighth_DayHandson;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSetEmployee {

	public static void main(String[] args) {
	Set<String> s1=new HashSet<>();
	s1.add("aditya");
	s1.add("Himanshu");
	s1.add("Harsit");
	s1.add("Anurag");
	s1.add("Chirag");
	s1.add("Kartik");
 //    Collections.sort(s1);
	Iterator<String> it=s1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}

}

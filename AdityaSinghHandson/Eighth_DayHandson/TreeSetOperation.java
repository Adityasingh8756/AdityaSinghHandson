package Eighth_DayHandson;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetOperation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	TreeSet<String> s1=new TreeSet<>(); 
	s1.add("Aditya");
	s1.add("Himanshu");
	s1.add("Harsit");
	s1.add("Anurag");
	s1.add("Chirag");
	s1.add("Kartik");
	
	
	TreeSet<String> s1reverse=(TreeSet<String>) s1.descendingSet();
	Iterator<String> it=s1reverse.iterator();
	
	
	//Iterator<String> it=s1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("Please Enter Employee Name : ");
	String name=sc.nextLine();
	//String name=sc.nextLine();
	if(s1.contains(name))
	{
		System.out.println("Employee Name In Employee List");
	}
	else
	{
		System.out.println("Employee Name is Not In Employee List");
	}
		
//	while(it.hasNext())
//	{
//		if(it.next().equals(name))
//		{
//		System.out.println("Employee Name In Employee List");
//		}
//	}
	sc.close();
	}

}

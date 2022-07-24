package Eighth_DayHandson;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
class Employee
{
	private int id;
	private String Ename;
	private double Esalary;
	Employee(int id,String Ename,double Esalary)
	{
		this.id=id;
		this.Ename=Ename;
		this.Esalary=Esalary;
	}
	public String toString()
	{
		return " [" + id +"  "+ Ename +"  "+Esalary +"  "+ "]";
	}
	
	
}
public class VectorEmployee {

	public static void main(String[] args) {
	List al= new Vector<>();
	al.add(new Employee(10,"Aditya",40000));
	al.add(new Employee(11,"Singh",41000));
	al.add(new Employee(12,"Anshika",50000));
	
	System.out.println("By Iterator  :");
	System.out.println();
	
	Iterator it = al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	System.out.println("By Enumeration  :");
	System.out.println();
	
	Enumeration e= Collections.enumeration(al);
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}

	}

}

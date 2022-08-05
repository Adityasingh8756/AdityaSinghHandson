//Write a program in Java to demonstrate Java 8 Functional Interface Predicate(if condition as a argument And test method of this interface return true or false ) feature.The class will print all numbers , even numberrs and number greater than 3 of the numbers in the array list
//
//Step1: create Java main class Java8 Tester
//
//Step2: create a method eval which will take 2 parameters (list of numbers from 1 to 9 and predicate condition)
//
//Step3: call the eval method from main method to print all the even numbers by passing appropriate parameters
//
//Step4: call the eval method from main method to print all the numbers greater than 3 by passing appropriate parameters

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Java8Tester {
	public static void main(String args[])
	{
		List <Integer> list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.print("All Number :");
	eval(list, (num)->true);
	
	System.out.println("\n");
	System.out.print("Even Number :");
	eval(list,(num)->num%2==0);
	System.out.println("\n");
	System.out.print("Number Greater Then 3 :");
	eval(list,(num)->num>3);
		
	}
	public static void eval(List<Integer> list, Predicate<Integer> pre)
	{
		for(int i=1;i<=list.size();i++) 
		{
			if(pre.test(i))
			{
			System.out.print(i + " ");
			}
		}
	}

}

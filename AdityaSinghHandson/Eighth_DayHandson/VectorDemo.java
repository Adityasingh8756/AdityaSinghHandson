package Eighth_DayHandson;

import java.util.Vector;

public class VectorDemo {
	public static void main (String args[])
	 {
		 Vector<String > alll=new Vector<>();
			alll.add("january");
			alll.add("february");
			alll.add("March");
			alll.add("april");
			alll.add("May");
			alll.add("june");
			alll.add("july");
			alll.add("august");
			alll.add("september");
			alll.add("october");
			alll.add("november");
			alll.add("December");
			System.out.println(alll);
			for(int i=0;i<alll.size();i++)
				System.out.println(alll.get(i));
	 }
}

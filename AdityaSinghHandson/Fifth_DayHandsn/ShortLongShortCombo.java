package Fifth_DayHandsn;

import java.util.Scanner;
public class ShortLongShortCombo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st String : ");
		String s1 = sc.next();
		System.out.println("Enter the 2nd String : ");
		String s2 = sc.next();
		
		 if(s1.length()>s2.length()) {
			String res = s2 + s1 + s2;
			System.out.println("After Combining : "+res);
		}
		 
		 else if(s1.length()==s2.length())
		 {
			 System.out.println("Both the String length are same  ");
		 }
		 else 
		 {
			 String res = s1 + s2 + s1;
			 System.out.println("After Combining : "+res);
		 }
		 
		 sc.close();
	}
}


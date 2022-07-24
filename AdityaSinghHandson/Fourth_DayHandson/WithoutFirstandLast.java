package Fourth_DayHandson;

import java.util.Scanner;

public class WithoutFirstandLast{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		String s2=str.substring(1, str.length()-1);
		System.out.println("String  Without First and Last=="+s2);
//		String str2="";
//		System.out.println("String  Without First and Last=="+(str2=str.substring(1, str.length()-1)));
		sc.close();
	}

}

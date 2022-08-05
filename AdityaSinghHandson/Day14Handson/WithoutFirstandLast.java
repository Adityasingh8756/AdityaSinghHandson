package pack3;

import java.util.Scanner;

public class WithoutFirstandLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		String str2="";
		System.out.println("String  Without First and Last=="+(str2=str.substring(1, str.length()-1)));

	}

}

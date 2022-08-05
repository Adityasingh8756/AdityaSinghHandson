package pack3;

import java.util.Scanner;

public class WithoutX {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		String str2="";
		if(str.startsWith("x")&&str.endsWith("x"))
		{
		System.out.println((str2=str.substring(1, str.length()-1)));
		}
		else
		{
			System.out.println(str);
		}
	}

}




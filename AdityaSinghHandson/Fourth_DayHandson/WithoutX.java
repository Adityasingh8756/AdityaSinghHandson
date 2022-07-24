package Fourth_DayHandson;

import java.util.Scanner;

public class WithoutX {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string : ");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		String str2="";
		if(str.startsWith("x")&&str.endsWith("x"))
		{
			str2=(str2=str.substring(1, str.length()-1));
		System.out.println("Output : "+str2);
		}
		else
		{
			System.out.println(str);
		}
		sc.close();
	}

}




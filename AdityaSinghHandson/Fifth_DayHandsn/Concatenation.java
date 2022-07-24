package Fifth_DayHandsn;


import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String1 : ");
		String s1 = sc.nextLine();
		System.out.println("Enter the String2 : ");
		String s2 = sc.nextLine();
		String s3="";
		if(s1.charAt(s1.length()-1)==(s2.charAt(0)))
		{
			s3=(s1.substring(0,(s1.length()-1)))+(s2.substring(0,s2.length()));
		}
		else
		{
		 s3=s1.concat(s2);
		}
			System.out.println("After Concatenation : "+s3.toLowerCase());
	
		sc.close();
	}

}

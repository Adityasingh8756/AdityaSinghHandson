package First_DayHandson;

import java.util.Scanner;
public class UpperToLowerViceVersa {

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of Character variable");
			char ch = sc.next().charAt(0);
			int value;
			if(ch>='A'&&ch<='Z')
			{
				value=(int)ch;
				ch=(char) (value+32);
				System.out.println(ch);
				//System.out.println(value=ch);
		}
			else
			{
				value=(int)ch;
				ch=(char)(value-32);
				System.out.println(ch);
			}
			sc.close();
		}
	

	}



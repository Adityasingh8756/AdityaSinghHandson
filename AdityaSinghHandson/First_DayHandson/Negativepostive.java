package First_DayHandson;

import java.util.Scanner;
public class Negativepostive {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int i = sc.nextInt();
			if(i>0)
			{
				System.out.println("Number is postive");
			}
			else if(i<0)
			{
				System.out.println("Number is negative");
			}
			else
			{
				System.out.println("Number is zero");
			}
			sc.close();

		}

	}



package Second_DayHandson;
import java.util.Scanner;

public class PrimeNum {



		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int number= sc.nextInt();
			int x=0;
			if(number==0 || number==1)
			{
				System.out.println("number is not prime");
			}
			for(int i=2;i<=number-1;i++)
			{
				if(number%i==0)
				{
					System.out.println("number is not prime");
					x=1;
					break;
				}
			}
			if (x==0)
			{
				System.out.println("number is  prime number");
			}
			sc.close();

		}

	}


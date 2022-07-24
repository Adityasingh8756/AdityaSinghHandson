package First_DayHandson;
import java.util.Scanner;
public class CharSort {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first character");
			char first_char = sc.next().charAt(0);
			System.out.println("Enter the first character");
			char sec_char = sc.next().charAt(0);
			
			if(first_char>sec_char)
			{
				System.out.println(sec_char+","+first_char);
			}
			else
			{
				System.out.println(first_char+","+sec_char);
			}
			sc.close();

		}

	}




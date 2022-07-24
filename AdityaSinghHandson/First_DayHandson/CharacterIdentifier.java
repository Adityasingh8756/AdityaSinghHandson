package First_DayHandson;
import java.util.Scanner;

public class CharacterIdentifier {

		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the  Character :");
		char ch = sc.next().charAt(0);
		if(Character.isAlphabetic(ch))
		{
			System.out.println("Alphabhet");
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("Digit");
		}

		else
		{
		     System.out.println("Special Symbol");

		}
		sc.close();
		}

	}
	



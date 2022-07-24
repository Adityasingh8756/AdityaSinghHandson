package First_DayHandson;
import java.util.Scanner;
public class ColourCode {

	public static void main(String argd[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the color code");
			char ch =sc.next().charAt(0);
			switch(ch)
			{
			case 'R':
				System.out.println("R->Red");
				break;
			case 'B':
				System.out.println("B->Blue");
				break;
			case 'G':
				System.out.println("G->Green");
				break;
			case 'O':
				System.out.println("O->Orange");
				break;
			case 'Y':
				System.out.println("Y->Yellow");
				break;
			case 'W':
				System.out.println("W->white");
				break;
				default:
				System.out.println("Invalid Code");
			}
			sc.close();
			
		}
	}


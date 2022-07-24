package First_DayHandson;
import java.util.Scanner;
public class GenderInterest {

			public static void main(String[] args)
			{
				Scanner sc = new  Scanner (System.in);
				System.out.println("Enter the Gender");
				String gender=sc.nextLine();
				
				System.out.println("Enter the Age");
				int age=sc.nextInt();

				if(gender.equalsIgnoreCase("Female")) {

				   if(age>=1&&age<=58) {
				        System.out.println("Interest=8.2%");
				   }

					else if(age>58&&age<=100)
					{
					    System.out.println("Interest=9.2%");
					}

					else
					{
						System.out.println("No result");
					}

				}
				
				else {

				       if(age>=1&&age<=58)
				       {
					      System.out.println("Interest=8.4%");
				       }

				       else if(age>58&&age<=100)
				       {
					       System.out.println("Interest=10.5%");
				       }

					   else 
					   {
						   System.out.println("No result");
					   }

				}
				sc.close();

			}

		}
				








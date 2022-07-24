package Sixth_DayHandson;
import java.util.*;
public class PrintLeftRightOfString {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the String1 : ");
			String s1 = sc.next();
			System.out.println("Enter the String2 : ");
			String s2 = sc.next();
			if(s1.startsWith(s2)&& s1.endsWith(s2))
			{
			
				String res=String.valueOf(s1.charAt(s2.length()))+String.valueOf(s1.charAt(s1.length()-3));
				System.out.println(res);
			}
			else if(s1.startsWith(s2))
			{
				String s4=s1.substring(s2.length(), s1.length());
				int index3=s4.indexOf(s2);
				
				String res=String.valueOf(s1.charAt(s2.length()))+String.valueOf(s4.charAt(index3-1))+String.valueOf(s4.charAt(index3+2));
				System.out.println(res);
			}
			else if(s1.endsWith(s2))
			{
				String s5=s1.substring(s2.length(), s1.length());
				int index3=s5.indexOf(s2);
				
				String res= String.valueOf(s5.charAt(index3-1))+String.valueOf(s5.charAt(index3+2))+String.valueOf(s1.charAt(s1.length()-3));
				System.out.println(res);
				
			}
			
			else if(s1.contains(s2))
			{	
			int	index=s1.indexOf(s2);		
			String output=String.valueOf(s1.charAt(index-1))+String.valueOf(s1.charAt(index+2));
					//System.out.println(output);
					String s3=s1.substring(index+s2.length(),s1.length());
					if(s3.contains(s2))
					{
					int	index2=s3.indexOf(s2);
					String output2=String.valueOf(s3.charAt(index2-1))+String.valueOf(s3.charAt(index2+2));
					System.out.println(output+output2);
					}
					else
					{
						System.out.println(output);
					}
			
			}
				sc.close();
			}
			

		}
	


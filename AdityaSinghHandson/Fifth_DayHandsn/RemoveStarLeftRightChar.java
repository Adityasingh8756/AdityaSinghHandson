package Fifth_DayHandsn;


import java.util.Scanner;
public class RemoveStarLeftRightChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.next();
		int index=0;
		
		if(s.charAt(0)=='*') {
			String res = s.substring(2,s.length());
			System.out.println(res);
		}
		
		else if(s.charAt(s.length()-1)=='*') {
			String res = s.substring(0,s.length()-2);
			System.out.println(res);
		}
		else {
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='*') {
					index = i;
				}
			}
			
			String output = s.substring(0,index-1) +  s.substring(index+2,s.length());
			System.out.println(output);
		}
		
		sc.close();
	}
}

package Fourth_DayHandson;

import java.util.Scanner;

public class Removechar {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String str = sc.nextLine();
			//String str2="*";
			int index=0;
			String res="";
			System.out.println(str.length());
		for(int i=0;i<str.length();i++ )
		{
			if(str.charAt(i)=='*')
			{
				index=i;
				break;
			}

		}
		String s1="";
		s1=str.substring(0,index-1);
		String s2=str.substring(index+1+1, str.length());
		 res=s1.concat(s2);
		System.out.println(res);
		sc.close();
	}

}

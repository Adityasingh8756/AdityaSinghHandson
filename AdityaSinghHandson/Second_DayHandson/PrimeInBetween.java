package Second_DayHandson;

public class PrimeInBetween {

public static void main (String args[])
	
	{

		for(int i=10;i<=99;i++)
		{
			if(knowprime(i))
			{
				System.out.print(i+"  ");
			}
		}
		
	}
	 public static boolean knowprime(int n)
	{
		if(n==0 || n==1)
		{
			return false;
		}
		for(int j=2;j<=n-1;j++)
		{
			if(n%j==0)
			{
				return false;
			}
		}
		return true;
	
	}

}

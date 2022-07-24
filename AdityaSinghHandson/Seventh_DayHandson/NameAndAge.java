package Seventh_DayHandson;


public class NameAndAge {

	public static void main(String[] args) throws MyException3
	{
		try
		{
		String str=args[0];
		int age=Integer.valueOf(args[1]);
		if(age>=18 && age<60)
		{
			System.out.println(str+"Data is Proper");
		}
		else
		{
			throw new  MyException3 ("Data is not Proper ");
		}
	}
		catch(Exception e)
		{
			System.out.println(e.fillInStackTrace());
		}
		
	}

}

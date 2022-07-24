package Third_DayHandson;

public class Calculator {
	public static int  powerint(int num1,int num2)
	{
	return (int) Math.pow(num1, num2);
	}
	public static  double  powerdouble(double a,int b)
	{
		return  Math.pow(a, b);
	}
public static void main(String dfgh[])
{
	//Calculator obj = new Calculator();
	int res_int=powerint(2,2);
	double res_double=powerdouble(3.4,4);
	System.out.println(res_int);
	System.out.println(res_double);
}

}

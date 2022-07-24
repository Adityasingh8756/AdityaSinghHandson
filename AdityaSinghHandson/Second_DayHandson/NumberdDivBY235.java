package Second_DayHandson;

public class NumberdDivBY235 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int max=0;
//int i =1;
//while(max<5)
//{
	//if(i%2==0&&i%3==0&&i%5==0)
	//{
	//	System.out.println(i+"  ");
	//	max++;
	//}
	//i++;
//}
for(int i=1;i<=1000;i++)
{
	if(i%2==0&&i%3==0&&i%5==0)
	{
		System.out.println(i+"  ");
		max++;
		if(max>=5)
		{
			break;
		}
	}
}

	}

}

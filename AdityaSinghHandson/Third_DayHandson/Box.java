package Third_DayHandson;

public class Box {
	int Width,Height,Depth;
	Box(int a,int b,int c)
	{
		Width=a;
		Height=b;
		Depth=c;
	}
	void Volume_Of_Box()
	{
		System.out.println("Volume_Of_Box-->"+( Width*Height*Depth));
	}
	public static void main(String args[])
	{
		Box obj = new Box(5,7,2);
		obj.Volume_Of_Box();
		
	}

}

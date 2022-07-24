package Third_DayHandson;


class Animals
{
	void Eat()
	{
		System.out.println(" Eat");
	}
	void Sleep()
	{
		System.out.println(" Sleep");
	}
}
class Bird extends Animals
{
		void Fly()
		{
			System.out.println(" Fly");
		}
		void Eat()
		{
			super.Eat();
		}
		void Sleep()
		{
			super.Sleep();
		}
}

public class Animal {
	public static void main(String[] args) {
		Animals a=new Animals();
		Bird b =new Bird();
		a.Eat();
		a.Sleep();

		b.Fly();
		b.Eat();
		b.Sleep();
	}

}
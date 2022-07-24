package Third_DayHandson;

class Fruit {
	String name;
	String taste;
	
	void eat()
	{
		  System.out.println("Eating Fruits...");  
		
	}
}
class Apple extends Fruit
{

	Apple(){
		name="apple";
		taste=" little sweet and little sart";
		
	}
	
	void eat()
	{
		System.out.println(name+" is "+taste);
	}
	
}
class Orange extends Fruit
{

	Orange(){
		name="Orange";
		taste=" sweet-tert";
		
	}
	
	void eat()
	{
		System.out.println(name+" is "+taste);
	}
	
}
public class TestFruit
{
	public static void main(String ghj[])
	{
		 Fruit fruit = new Fruit();  
		             Apple apple = new Apple();  
		             Orange orange = new Orange();  
		             fruit.eat();  
		             apple.eat();  
		             orange.eat();
	}
}

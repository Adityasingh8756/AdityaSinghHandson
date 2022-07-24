package Sixth_DayHandson;

import java.util.Random;

abstract class Compartment
{
	public abstract String notice();
}
class Firstclass extends Compartment
{
	public String notice() {
		return "This Compartment is For FirstClass" ;
	}
}
class Ladies extends Compartment
{
	public String notice() {
		return "This Compartment is For Ladies";
	}
}
class  General extends Compartment
{
	public String notice() {
		return "This Compartment is For General";
	}
}
class Luggage extends Compartment
{
	public String notice() {
		return "This Compartment is For Luggage";
	}
}

public class TestCompartment {

	public static void main(String[] args) {
	
		Compartment[] Com=new Compartment[10];
		Random random = new Random();
		
    	for (int i = 0; i < 10; i++) 
    	{
    		int randomNum = random.nextInt(4) + 1;
    	
    		if (randomNum == 1)
    			Com[i] = new Luggage();
    		else if (randomNum == 2)
    			Com[i] = new Ladies();
    		else if (randomNum == 3)
    			Com[i] = new Firstclass();
    		else if (randomNum == 4)
    			Com[i] = new General();
    	
    		System.out.println(Com[i].notice());
    	}
	}

}

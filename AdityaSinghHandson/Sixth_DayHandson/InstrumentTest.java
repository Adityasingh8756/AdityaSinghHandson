package Sixth_DayHandson;

abstract class Instrument{
	
	public abstract String play();
	
}

class Piano extends Instrument{
	
	public String play() {
		return "Piano is playing tan tan tan tan";
	}
}

class Flute extends Instrument{
	
	public String play() {
		return "Flute is playing toot toot toot toot";
	}
}

class Guitar extends Instrument{
	
	public String play() {
		return "Guitar is playing tin tin tin";
	}
}

public class InstrumentTest {

	public static void main(String[] args) {
		
		Piano p = new Piano();
		Flute f = new Flute();
		Guitar g = new Guitar();
		
		System.out.println(p.play());
		System.out.println(f.play());
		System.out.println(g.play());
		System.out.println();
		
		Instrument in;
		
			in = new Piano();
			System.out.println(in.play());
			in = new Flute();
			System.out.println(in.play());
			in = new Guitar();
			System.out.println(in.play());
		
			
			
		Instrument[] inst = new Instrument[10];
		
		inst[0] = new Piano();
		inst[1] = new Flute();
		inst[2] = new Guitar();
		inst[3] = new Flute();
		inst[4] = new Flute();
		inst[5] = new Guitar();
		inst[6] = new Guitar();
		inst[7] = new Piano();
		inst[8] = new Flute();
		inst[9] = new Piano();
		
		System.out.println();
		for(int i=0;i<inst.length;i++) {
			System.out.println("At index "+i+" "+inst[i].getClass().getSimpleName()+ " class object is stored.");
		}
	}
}
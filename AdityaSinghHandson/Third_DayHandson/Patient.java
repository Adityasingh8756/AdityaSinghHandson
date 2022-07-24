package Third_DayHandson;

public class Patient {
	String  patientName;
	double Height;
	double Weigth;
Patient(String name,double h,double w)
{
	patientName=name;
	Height=h;
	Weigth=w;	
}
double computeBMI()
{
	return (Weigth/(Height*Height));
}
	public static void main(String[] args) 
	{
	Patient p = new Patient("Raju",2,85);
	double patientBMI=p.computeBMI();
	System.out.println("Patient "+p.patientName+" BMI--->"+patientBMI);
	}

}

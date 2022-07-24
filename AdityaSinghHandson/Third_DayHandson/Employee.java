package Third_DayHandson;

public class Employee extends Person
{
	double Salary;
	 int Start_Year;
	 String InsuranceNo;
	public Employee(String name, double s, int Start_y, String Ins_No) {
		super(name);
		Salary = s;
		Start_Year = Start_y;
		InsuranceNo= Ins_No;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public int getStart_Year() {
		return Start_Year;
	}
	public void setStart_Year(int start_Year) {
		Start_Year = start_Year;
	}
	public String getInsuranceNo() {
		return InsuranceNo;
	}
	public void setInsuranceNo(String insuranceNo) {
		InsuranceNo = insuranceNo;
	}
	void display()
	{
		System.out.println("Name-->"+name);
		System.out.println("Salary-->"+Salary);
		System.out.println("Starting Year-->"+Start_Year);
		System.out.println("InsuranceNo-->"+InsuranceNo);
	}
}

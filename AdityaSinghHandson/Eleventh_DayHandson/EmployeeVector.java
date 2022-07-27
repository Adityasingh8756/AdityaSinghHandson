package Eleventh_DayHandson;

public class EmployeeVector {
	private int empid;
	private String empName;
	private String email;
	private String gender;
	private float salary;
	
	EmployeeVector(int empid,String empName,String email,String gender,float salary)
	{
		this.empid=empid;
		this.empName=empName;
		this.email=email;
		this.gender=gender;
		this.salary=salary;
		
	}
	void GetEmployeeDetails() 
	{
		System.out.println("empid :"+empid);
		System.out.println("empName :"+empName);
		System.out.println("email :"+email);
		System.out.println("gender :"+gender);
		System.out.println("salary :"+salary);
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}


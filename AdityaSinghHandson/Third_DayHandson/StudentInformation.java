package Third_DayHandson;
class Persons {

	private String name;
	private int DateOfBirth;
	 Persons()
	 {
	 	this.name=name;
	 	this.DateOfBirth=DateOfBirth;
	 }
	 public String getName() {
	 	return name;
	 }
	 public void setName(String name) {
	 	this.name = name;
	 }
	 public int getDateOfBirth() {
	 	return DateOfBirth;
	 }
	 public void setDateOfBirth(int dateOfBirth) {
	 	DateOfBirth = dateOfBirth;
	 }	

	 	}

class Student extends Persons
{
	private int StudentId;
	Student() 
	{
		
		this.StudentId=StudentId;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

}


class Teacher extends Persons
{
	private	double Salary;
	private String SubjectOFTeacher;
	Teacher()
	{
		
		this.Salary=Salary;
		this.SubjectOFTeacher=SubjectOFTeacher;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getSubjectOFTeacher() {
		return SubjectOFTeacher;
	}
	public void setSubjectOFTeacher(String subjectOFTeacher) {
		SubjectOFTeacher = subjectOFTeacher;
	}
	
}


 class CollegeStudent extends Student {
	 private String collegeName;
	 private int StudentYear;
	CollegeStudent()
	{
		
	this.collegeName=collegeName;
	this.StudentYear=StudentYear;
	
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getStudentYear() {
		return StudentYear;
	}
	public void setStudentYear(int studentYear) {
		StudentYear = studentYear;
	}
}
 


 

 


public class StudentInformation {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		Persons p = new Persons();
		Student s= new Student();
		CollegeStudent cs= new CollegeStudent();
		p.setName("Aditya");
		p.setDateOfBirth(1999);
		s.setStudentId(9);
		t.setSalary(12863.96);
		t.setSubjectOFTeacher("java");
		cs.setCollegeName("mpec");
		cs.setStudentYear(2022);
	System.out.println("Name : "+p.getName());	
		System.out.println("Date Birth :"+p.getDateOfBirth());
		System.out.println("Student Id : "+s.getStudentId());
		System.out.println("TeacherSalary : "+t.getSalary());
		System.out.println("Subject of Teacher : "+t.getSubjectOFTeacher());
		System.out.println("College name : "+cs.getCollegeName());
		System.out.println("Year Of Student : "+cs.getStudentYear());
		

	}

}

//Create an application for employee management with the following classes:
//a) Create an Employee class with following attributes and behaviors :
//i) int empId
//ii)String empName
//iii)String email
//iv)String gender
//v) float salary
//vi) void GetEmployeeDetails() -> prints employee details


//b) Create one more class EmployeeDB with the following attributes and behaviors.
//(i) ArrayList list;
//ii) boolean add Employee (Employee e) -> adds the employee object to the collection
//iii) boolean delete Employee (int empId) ->delete the employee object from the collection with the given empid
//iv) String showPaySlip (int empId) -> returns the payslip of the employee with the given empId
//Provide implementation for all the methods and test your program
//


package Eleventh_DayHandson;


public class TestEmployeeDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB EDB=new EmployeeDB();
		Employee e1=new Employee(1,"Aditya","aditya@ArrayListgmail.com","male",25000);
		Employee e2=new Employee(2,"Abhi","abhi@ArrayListgmail.com","male",30000);
		Employee e3=new Employee(3,"Shivam","shivam@ArrayListgmail.com","male",35000);
		EDB.addEmployee(e1);
		EDB.addEmployee(e2);
		EDB.addEmployee(e3);	
		EDB.show();

//		e1.GetEmployeeDetails();
//		System.out.println();
//		
//		e2.GetEmployeeDetails();
//		System.out.println();
//	
//		e3.GetEmployeeDetails();
//		System.out.println();
		System.out.println();
	System.out.println("Employee Deletion "+EDB.deleteEmployee(1));
		System.out.println();
	
	//e1.GetEmployeeDetails();
		System.out.println();
		System.out.println();
		EDB.show();
		
		System.out.println(EDB.showPaySlip(2));
		
		
		
	}

}

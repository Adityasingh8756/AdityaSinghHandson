//Create an application for employee management with the following classes:
//a) Create an Employee class with following attributes and behaviors :
//i) int empId
//ii)String empName
//iii)String email
//iv)String gender
//v) float salary
//vi) void GetEmployeeDetails() -> prints employee details


//b) Create one more class EmployeeDB with the following attributes and behaviors.
//(i) Linkedlist;
//ii) boolean add Employee (Employee e) -> adds the employee object to the collection
//iii) boolean delete Employee (int empId) ->delete the employee object from the collection with the given empid
//iv) String showPaySlip (int empId) -> returns the payslip of the employee with the given empId
//Provide implementation for all the methods and test your program
//




package Eleventh_DayHandson;

public class TestEmployeeLinkDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeLinkDB EDB=new EmployeeLinkDB();
		EmployeeLink e1=new EmployeeLink(4,"Aditya","aditya@LinkedListgmail.com","male",2500);
		EmployeeLink e2=new EmployeeLink(5,"Abhi","abhi@LinkedListgmail.com","male",3000);
		EmployeeLink e3=new EmployeeLink(6,"Shivam","shivam@LinkedListgmail.com","male",3500);
		EDB.addEmployee(e1);
		EDB.addEmployee(e2);
		EDB.addEmployee(e3);
		
		EDB.show();
//
//		e1.GetEmployeeDetails();
//		System.out.println();
//		
//		e2.GetEmployeeDetails();
//		System.out.println();
//	
//		e3.GetEmployeeDetails();
//		System.out.println();
		System.out.println();
	System.out.println("Employee Deletion "+EDB.deleteEmployee(4));
		System.out.println();
	
	//e1.GetEmployeeDetails();
		System.out.println();
		
		System.out.println(EDB.showPaySlip(5));
		
		
		
	}

}

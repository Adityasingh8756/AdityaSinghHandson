//Create an application for employee management with the following classes:
//a) Create an Employee class with following attributes and behaviors :
//i) int empId
//ii)String empName
//iii)String email
//iv)String gender
//v) float salary
//vi) void GetEmployeeDetails() -> prints employee details


//b) Create one more class EmployeeDB with the following attributes and behaviors.
//(i) Using vector;
//ii) boolean add Employee (Employee e) -> adds the employee object to the collection
//iii) boolean delete Employee (int empId) ->delete the employee object from the collection with the given empid
//iv) String showPaySlip (int empId) -> returns the payslip of the employee with the given empId
//Provide implementation for all the methods and test your program
//



package Eleventh_DayHandson;

public class TestEmployeeVectorDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeVectorDB EDB=new EmployeeVectorDB();
		EmployeeVector e1=new EmployeeVector(7,"Aditya","adityaVector@gmail.com","male",50000);
		EmployeeVector e2=new EmployeeVector(8,"Abhi","abhiVector@gmail.com","male",60000);
		EmployeeVector e3=new EmployeeVector(9,"Shivam","shivamVector@gmail.com","male",90000);
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
	System.out.println("Employee Deletion "+EDB.deleteEmployee(7));
		System.out.println();
	
	//e1.GetEmployeeDetails();
		System.out.println();
		
		System.out.println(EDB.showPaySlip(9));
		
		
		
	}

}




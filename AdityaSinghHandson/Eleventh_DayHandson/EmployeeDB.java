package Eleventh_DayHandson;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {

	ArrayList<Employee> empDB=new ArrayList<>();
	
	public boolean addEmployee(Employee e)
	{
		return empDB.add(e);
	}
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = empDB.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpid() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
//	// int size=empDB.size();
//	public boolean deleteEmployee(int empId)
//	{
//	 boolean flag=false;
//	 Iterator it=empDB.iterator();
//	 while(it.hasNext())
//	 {
//		 Employee emp1= (Employee) it.next(); 
//		 if(emp1.getEmpid()==empId)
//		 {
//			 flag=true;
//			 it.remove();
//		 }
//		 
//	 }
//	 return flag;
//	}
	public String  showPaySlip(int empId) 
	{
		String slip="";
		for(Employee e: empDB)
		{
			if(e.getEmpid()==empId)
			{
				slip="Slip of EmpId"+empId+" is  "+e.getSalary();
			}
		}
		return slip;
	}
	void show()
	{
		for(Employee e:empDB)
		{
			e.GetEmployeeDetails();
			System.out.println();
		}
	}
	
	
}

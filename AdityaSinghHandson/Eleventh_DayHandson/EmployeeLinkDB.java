package Eleventh_DayHandson;


import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeLinkDB {

	
	LinkedList<EmployeeLink> empDB=new LinkedList<>();
	
	public boolean addEmployee(EmployeeLink e)
	{
		return empDB.add(e);
	}
	// int size=empDB.size();
	public boolean deleteEmployee(int empId)
	{
	 boolean flag=false;
	 Iterator<EmployeeLink> it=empDB.iterator();
	 while(it.hasNext())
	 {
		 EmployeeLink emp1=  it.next();
		 if(emp1.getEmpid()==empId)
		 {
			 flag=true;
			 it.remove();
		 }
		 
	 }
	 return flag;
	}
	public String  showPaySlip(int empId) 
	{
		String slip="";
		for(EmployeeLink e: empDB)
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
		for(EmployeeLink e:empDB)
		{
			e.GetEmployeeDetails();
			System.out.println();
		}
	}
	
	
}


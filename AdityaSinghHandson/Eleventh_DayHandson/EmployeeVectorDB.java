package Eleventh_DayHandson;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVectorDB {

	
	Vector<EmployeeVector> empDB=new Vector<>();
	
	public boolean addEmployee(EmployeeVector e)
	{
		return empDB.add(e);
	}

	public boolean deleteEmployee(int empId)
	{
	 boolean flag=false;
	 Iterator<EmployeeVector> it=empDB.iterator();
	 while(it.hasNext())
	 {
		 EmployeeVector emp1=it.next();
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
		for(EmployeeVector e: empDB)
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
		for(EmployeeVector e:empDB)
		{
			e.GetEmployeeDetails();
			System.out.println();
		}
	}
	
	
}

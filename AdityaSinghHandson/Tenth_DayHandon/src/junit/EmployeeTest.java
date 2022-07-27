package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
//import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testFindName() {
		 System.out.println("======TEST EXECUTED=======");
		ArrayList<String> Al=new ArrayList<>();
		Al.add("Aditya");
		Al.add("Abhigyan");
		Al.add("Raju");
		Employee emp=new Employee();
		String res=emp.findName(Al, "Aditya");
		assertEquals("FOUND",res);
		//assertEquals("NOT FOUND",res);
	}

}

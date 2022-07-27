package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testStringconcat() {
		 System.out.println("======TEST EXECUTED=======");
      
		Demo1 ob=new Demo1();
		String res=ob.stringconcat("Aditya ", "Singh");
		assertEquals("Aditya Singh",res);

	}

}

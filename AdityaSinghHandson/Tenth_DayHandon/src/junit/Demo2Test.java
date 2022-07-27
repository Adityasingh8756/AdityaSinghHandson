package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2Test {


	@Test
	void testCheakPalindrome() {
		 System.out.println("======TEST EXECUTED=======");
		Demo2 d=new Demo2();
		String res= d.CheakPalindrome("madam");
		String res2= d.CheakPalindrome("Aditya");
		assertEquals("String Palindrome",res);
		assertEquals("String is not Palin=drome",res2);
	}
	
}

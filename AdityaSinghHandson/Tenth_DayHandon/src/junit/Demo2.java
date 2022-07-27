//Create the following class and implement the method to check whether the given
//
//string is a palindrome and return the result.
//
//Class Name : Demo2
//
//Method : palindromeCheck(String):boolean
//
//(Hint: A String is palindrome, If the reversed string is equal to the actual string.
//
// Ex: madam, mom, dad, malayalam )
//
//ii) Create a Junit test class to test the above class.
//



package junit;

public class Demo2 {
	
	public String CheakPalindrome(String str1)
	{String res="";
	for(int i=str1.length()-1;i>=0;i--)
	{
		 res = res+str1.charAt(i);
	}

	if(res.equalsIgnoreCase(str1))
	{
		return "String Palindrome";
		
	}
	else
	{
		return "String is not Palin=drome";
	}
	}
}

package JavaFundaMentals;

public class JavaOperators {
	
//	Arithmetic Operators
//	Assignment Operators
//	Relational Operators
//	Logical Operators
//	Unary Operators
//	Bitwise Operators

//	Arithmetic Operators
	
//	Operator	Operation
	
//	+	        Addition
//	-	        Subtraction
//	*	        Multiplication
//	/	        Division
//	%	        Modulo Operation (Remainder after division)
	
	public void ArithmeticOperator() {
		// Addition
		int a=10;
		float b=10.5f;
		System.out.println(a+b);
		// Subtraction 
		System.out.println(a-b);
		// Multification 
		System.out.println(a*b);
		// Division 
		System.out.println(a/b);
		// Modulo 
		System.out.println(a%b);
	}
	
	
//	Assignment Operators
	
	/*
	 ============================================================================
	                        Java Assignment Operators Summary
	 ============================================================================

	 Operator     Example         Equivalent Expression         Description
	 --------     ---------       ----------------------         -------------------------------
	    =         a = b;          a = b;                         Assigns the value of b to a
	   +=         a += b;         a = a + b;                     Adds b to a and stores in a
	   -=         a -= b;         a = a - b;                     Subtracts b from a and stores in a
	   *=         a *= b;         a = a * b;                     Multiplies a by b and stores in a
	   /=         a /= b;         a = a / b;                     Divides a by b and stores in a
	   %=         a %= b;         a = a % b;                     Stores remainder of a / b in a

	 ============================================================================
	*/

	public void Operators() {
		int a=10;
		
		int b=20;
		a=b;
		System.out.println(a);
		
	}
	

}

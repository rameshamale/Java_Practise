package JavaFundaMentals;

public class DataType {
	// Primitive Data Type
	
//boolean type
	/*The boolean data type has two possible values, either true or false. 
	 * Defaultvalue: false. 
	 * They are usually used for true/false conditions. */	
	public static void booleanDataTypeSetTrue() {
		boolean flag=true;
		System.out.println(flag);
	}
	
	public static void booleanDataTypeSetFalse() {
		boolean flag=false;
		System.out.println(flag);
	}
	
//	byte data type
	
	/*
	 * The byte data type can have values from -128 to 127 (8-bit signed two's
	 * complement integer). If it's certain that the value of a variable will be
	 * within -128 to 127, then it is used instead of int to save memory. Default
	 * value: 0
	 */
	public static void ByteType() {
	byte range=120;
	System.out.println(range);}
	
//  short type data
	
/*
 * The short data type in Java can have values from -32768 to 32767 (16-bit
 * signed two's complement integer). If it's certain that the value of a
 * variable will be within -32768 and 32767, then it is used instead of other
 * integer data types (int, long). Default value: 0
 */
	
	public static void ShortType() {
		short temperature;
		temperature = -200;
		System.out.println(temperature); } 
		
// int data type
	
	/*
	 * The int data type can have values from -231 to 231-1 (32-bit signed two's
	 * complement integer). If you are using Java 8 or later, you can use an
	 * unsigned 32-bit integer. This will have a minimum value of 0 and a maximum
	 * value of 232-1. To learn more, visit How to use the unsigned integer in java
	 * 8? Default value: 0
	 */
	
	
	public static void intTypeData() {
		int myAge=20;
		System.out.println(myAge);
	}
	
// long type
	/*
	 * The long data type can have values from -263 to 263-1 (64-bit signed two's
	 * complement integer). If you are using Java 8 or later, you can use an
	 * unsigned 64-bit integer with a minimum value of 0 and a maximum value of
	 * 264-1. Default value: 0 Ex
	 */	
	
	  public static long getLongValue() {
		    long value = 100000L;  // the 'L' suffix denotes a long literal
		    return value;
		  }
	  
// double type of data
	/*		 
	 * * The double data type is a double-precision 64-bit floating-point. It should
	 * never be used for precise values such as currency. Default value: 0.0 (0.0d)*/
	  
	  
	  

	
	
}

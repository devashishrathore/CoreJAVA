package strings;

// -----------------------------------------------------   String Conversion Methods  -------------------------------------------------------------------

// There are 2 Types of conversion methods in a String class or a String:-

// -> Case-Conversion Methods:- Two methods exist to change the case of characters(Java is case sensitive)
// (1) toLowerCase() -> This method converts all characters of the string into a lower-case letter.

// #Syntax:- String s1.toLowerCase(); 

// (2) toUpperCase() -> This method converts all characters of the string into an upper-case letter. 

// #Syntax:- String s1.UpperCase();

// -> Type-Conversion Methods:- Two methods exist to change the types of another data type.
// (1) valueOf() -> This method takes any data type as an argument and returns a String value or converted String. This method converts 
//                  the different types of values into strings. With the help of the String.valueOf() method, we can convert int or long 
//                  or float or double or object or any other type into a string.
//                  ## This method is a static method of the String class that's why we can call the valueOf() method directly by string class.

// #Syntax:- String.valueOf(any data-type); returns String

// (2) toCharArray() -> This method converts the given string into a sequence of characters. The returned array length is equal to the length of the string.

// #Syntax:- String s1.toCharArray(); returns char array

public class StringConversionsMethods {

	public static void main(String[] args) {
		String s = "DEVASHISH";
		String s1 = "rathod";

		String s3 = s.toLowerCase(); // return devashish i.e. converted to lower-case
		System.out.println(s3);

		String s4 = s1.toUpperCase(); // return RATHOD i.e. converted to upper-case
		System.out.println(s4);

		int a = 1000;
		int[] b = { 10, 20, 30, 40, 50 };

		String sa = String.valueOf(a); // returns 10 as String, converted int into String data-type
		System.out.println(sa + " and is of type " + sa.getClass().getSimpleName()); // .getClass().getSimpleName()
																						// method syntax used to check
																						// type of variable

		String sb = String.valueOf(b); // return String Object, converted int array object into String Object data-type
		System.out.println(sb + " and is of type " + sb.getClass().getSimpleName());

		char[] c = s.toCharArray();
		System.out.println(c);
		System.out.println(c + " and is of type " + c.getClass().getSimpleName()); // return char sequence or char
																					// array, converted String to char
																					// array Object.
	}
}

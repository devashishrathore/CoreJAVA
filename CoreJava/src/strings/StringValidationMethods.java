package strings;

//--------------------------------------------------  String Class Methods  -------------------------------------------------------------------------------

// String class has many constructors and methods but we learn common methods of String :-

// Validation methods:-
// -> (1) length() Method -> The String length() method counts the number of characters in the string and returns it in an integer.
//                           This method returns the length of any string which is equal to the number of 16-bit Unicode characters in the string. 

// #Syntax :- String s1.length();

// Limitation of length method -> This method does not return the null String length i.e. it gives an Exception which is "NullPointerException".

// -> (2) isEmpty() Method -> The isEmpty() method of string class included in Java string since JDK 1.6. This method returns a boolean value
//                            that is true if the given string is empty, else it returns false, or can say that this method returns true if the length of the string is 0.

// #Syntax :- String s1.isEmpty();

// Limitation of isEmpty method -> This method does not return the null String empty status i.e. it gives an Exception which is "NullPointerException".

// -> (3) trim() Method -> This trim() method of the String class eliminates only leading and trailing spaces. The Unicode value of the space character is "\u0020".
//                         The trim method in Java checks this unicode value before and after the string, if it exists then removes the spaces and returns the omitted string.

// #Syntax :- String s1.trim();

public class StringValidationMethods {

	public static void main(String[] args) {
		String s = "Hello Welcome to my Computer";
		int a = s.length(); // return length of String
		System.out.println("String s length is: " + a);

//		String s1 = null;
//		int b = s1.length(); // show Exception due to null String
//		System.out.println(s1 + " and it's length is: " + b);

//		boolean d = s1.isEmpty(); // show Exception due to null String
//		System.out.println(d);

		boolean c = s.isEmpty();
		System.out.println("String s empty status: " + c);

		String s2 = "";
		int c1 = s2.length(); // return 0 due to initialize with no character
		boolean l = s2.isEmpty(); // return true due to String is initialize with no characters
		System.out.println("String s2 empty status: " + l + " and it's length is: " + c1);

		String s3 = "            ";
		int c2 = s3.length(); // return space length due to initialize with space characters
		boolean m = s3.isEmpty(); // return false due to String is initialized with space characters which occupy
									// memory
		System.out.println("String s3 empty status: " + m + " and it's length is: " + c2);

		String s4 = "   Dev      ";
		String trimString = s4.trim(); // return with removing extra spaces which are present in characters forward and
										// backward side.
		System.out.println("String s4 is: " + s4 + " and it's trimmed value is: " + trimString);

		String s5 = "  D  ev  ";
		String s5Trim = s5.trim(); // removing spaces only characters forward and backward side, not which are
									// present in the middle of the text.
		System.out.println("String s5 is: " + s5 + " and it's trimmed value is: " + s5Trim);
	}
}

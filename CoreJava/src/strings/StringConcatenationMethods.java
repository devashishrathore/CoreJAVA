package strings;

//-------------------------------------------------------------  String Concatenation Methods  --------------------------------------------------------------------------------

// concat() Method and + operator -> The + operator adds or concat one by one statement or data in a line. It works to follow the BODMAS theory.

// BODMAS Theory :- It stands for Bracket, of, Division, Multiplication, Addition, and Subtraction. It refers to the order of operations to solve an expression. 
//                  It tells which process to perform first to evaluate a given numerical expression.

// #Syntax:- + operator used to concat any data type with string and return String.

// While the concat method takes an argument as a string to add into a new String i.e. this method concatenates one string to the end of another string.
// This method returns a string with the value of the string passed into the method, appended to the end of the string.

// #Syntax:- String s1.concat(String s2);

// join() -> This method takes 2 arguments that are first is the CharSequence delimiter and the second is CharSequence elements... and returns the whole String by joining the passed delimiter into the middle of that passed element.
//           It is the static method that concatenates the given elements with the delimiter and returns the concatenated string. It was included in the JDK 1.8 version.
//           ## Note that if an element is null, then null is added and if delimiter is null then it will throw "java.lang.NullPointerException". 

// #Syntax:- String.join(CharSequence delimiter, CharEquence... elements) // here ...  is var arguments which means these dots allow zero to multiple arguments to be passed when the method is called.

// subSequence() -> This method takes 2 integer arguments first beginIndex and second endIndex and returns a CharSquence. This method returns a char sequence(subsequence) which starts with the char value at the specified index and 
//                  ends with the char value at(end index - 1).
//                  It throws java.lang.StringIndexOutOfBoundsException exception if any index position value is negative. i.e. if the argument passed with a negative integer or crossing the String length.

// #Syntax:- String s1.subSquence(int beginIndex, int endIndex); returns CharSquence

// substring() -> There are two substring methods of string class. first is substring(int beginIndex) i.e. it takes only one integer type argument and returns the whole remaining string starting from the argument we passed or
//                It returns a new string that is a substring of this string. The substring begins at the specified beginIndex and to the last character of the string.
//            While second is substring(int beginIndex, int endIndex). It takes 2 integer arguments that are first beginIndex and second endIndex and returns a new string that is a substring of this string.
//                The substring begins at the specified beginIndex and ends with the character at index endIndex -1.
//                Both methods throw java.lang.StringIndexOutOfBoundsException exception if any index position value is negative. i.e. if the argument passed with a negative integer or crossing the String length.

// #Syntax:- (1) String s1.substring(int beginIndex); returns String
//           (2) String s1.substring(int beginIndex, int endIndex); returns String

public class StringConcatenationMethods {

	public static void main(String[] args) {
		String s = "Dev";
		String s1 = "ashish";
		String s2 = "Rathod";

		String t = s + s1; // return Devashish
		System.out.println("String t " + t);

		String t1 = s + s1 + s2; // return DevashishRathod
		System.out.println("String t1 " + t1);

		String t2 = s + 10;
		System.out.println("String t2 " + t2); // return Dev10

		String t3 = 10 + s1;
		System.out.println("String t3 " + t3); // return 10ashish

		String t4 = 10 + 30 + s1;
		System.out.println("String t4 " + t4); // return 40ashish

		String t5 = 10 + 30 + s1 + 40; // return 40ashish40
		System.out.println("String t5 " + t5);

		String t6 = 50 + 30 + s1 + 40 + 60; // return 80ashish4060
		System.out.println("String t6 " + t6);

		String t7 = 10 - 30 + s1 + 40; // return -20ashish40
		System.out.println("String t7 " + t7);

		String t8 = -10 + 30 + s1 + 40; // return 20ashish40
		System.out.println("String t8 " + t8);

		String t9 = 10 + s1 + 40 / 6; // return 10ashish6
		System.out.println("String t9 " + t9);

		String t10 = s1 + 4 * 2; // return ashish8
		System.out.println("String t10 " + t10);

		String t11 = -10 + 30 + s + 40 + 4 / 2 + s1 + 8 * 3 + (20 + 5 / 5); // return 20Dev402ashish2421 i.e.
																			// concatenation follows the BODMAS theory
		System.out.println("String t11 " + t11);

		String t12 = s.concat(s2); // return DevRathod
		System.out.println("String t12 " + t12);

		String t13 = String.join("-", s, s1); // return Dev-ashish i.e. String s and s2 are joined with delimiter -
		System.out.println("String t13 " + t13);

		String t14 = String.join(" ! ", s, s1, s2); // return Dev ! ashish ! Rathod i.e. String s , s1 and s2 are joined
													// with delimiter !
		System.out.println("String t14 " + t14);

		String t15 = String.join("*", s, null, s2); // return Dev*null*Rathod i.e. String s , null and s2 are joined
													// with delimiter *
		System.out.println("String t15 " + t15);

//		String t16 = String.join(null, s, s2); // throw java.lang.NullPointerException due to delimiter passed as null
//		System.out.println("String t16 " + t16);

		CharSequence t17 = s1.subSequence(2, 5); // returns his i.e. CharSequence
		System.out.println("CharSequence t17 " + t17);

//		CharSequence t18 = s1.subSequence(4, 1); // throws java.lang.StringIndexOutOfBoundsException exception due to negative argument passed
//		System.out.println("CharSequence t18 " + t18);

		CharSequence t19 = s1.subSequence(5, 5);// return empty CharSquence
		System.out.println("CharSequence t19 " + t19);

		String t20 = s1.substring(1); // return shish i.e. whole string starts with 1 index
		System.out.println("String t20 " + t20);

//		String t21 = s1.substring(10); // throws java.lang.StringIndexOutOfBoundsException exception due to crossing the string length
//		System.out.println("String t21 " + t21);

		String t22 = s1.substring(5, 5); // return empty string i.e. indexes are same
		System.out.println("String t22 " + t22);

		String t23 = s1.substring(2, 5); // return his substring i.e. starts with 2nd index and end with 4(5-1)
		System.out.println("String t23 " + t23);

//		String t24 = s1.substring(5, 2); // throws java.lang.StringIndexOutOfBoundsException exception due to negative argument passed
//		System.out.println("String t24 " + t24);

	}
}

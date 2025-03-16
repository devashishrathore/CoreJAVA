package strings;

//--------------------------------------------------------------------  String Searching Methods  ---------------------------------------------------------------------------------------------------------

// -> indexOf() -> This method takes argument as string or character(s) and returns integer value. The indexOf() method returns the position of the first occurrence of a specified character(s) 
//                 in a string or returns -1, if the character does not occur.

// #Syntax:- String s1.indexOf(String s/Char c); returns integer

// -> lastIndexOf() -> This method takes argument as string or character(s) and returns integer value. The lastIndexOf() method returns the position of the last occurrence of a specified character(s) 
//                     in a string or returns -1, if the character does not occur.

// #Syntax:- String s1.lastIndexOf(String s/Char c); returns integer

// -> charAt() -> This method takes an integer as an argument and returns a character value at the specified index. The index value should lie between 0 to one less in the length of the string 
//                i.e. String s1.length()-1.
//                It shows the "StringIndexOutOfBoundsException" exception when we pass the greater integer as compared to the string length. 

// #Syntax:- String s1.charAt(int a); returns character

// -> contains() -> This method takes string or charSequence as an argument and returns a boolean value. This method searches the sequence of characters in the given string. 
//                  It returns true if the sequence of char values is found in this string otherwise returns false.
//                  It does not accept the single-character argument. It means accepting charSquence or string as an argument.

// #Syntax:- String s1.contains(String s/CharSquence c); returns boolean

// -> startsWith() -> This method takes string or charSequence as an argument and returns a boolean value. This method tests if a string starts with a specified prefix beginning from 1st index.
//                    If yes then it will return true else it will return false.
//                    It does not accept the single-character argument. It means accepting charSquence or string as an argument.

// #Syntax:- String s1.startsWith(String s/CharSquence c); returns boolean

// -> endsWith () -> This method takes string or charSequence as an argument and returns a boolean value. This method checks whether the string ends with a specified suffix ending from the last index.
//                   If yes then it will return true else it will return false.
//                   It does not accept the single-character argument. It means accepting charSquence or string as an argument.

// #Syntax:- String s1.endsWith(String s/CharSquence c); returns boolean

public class StringSearchMethods {
	public static void main(String[] args) {
		String s = "Devashish Rathod";

		int a = s.indexOf('D');
		System.out.println("int a " + a); // return 0 i.e. character 'D' exists in zero index. indexing always start
											// from 0,1,2,3... so on...

		int b = s.indexOf("Ra");
		System.out.println("int b " + b); // return 10 i.e. substring/string "Ra" exist in the 10th index

		int c = s.indexOf("u"); // return -1 i.e. substring/string "u" do not exist in String s
		System.out.println("int c " + c);

		int d = s.lastIndexOf('a'); // return 11 i.e. character 'a' exist in 11th index from last.
		System.out.println("int d " + d);

		int e = s.lastIndexOf("th"); // return 12 i.e. substring/string "th" exists in the 12th index from last.
		System.out.println("int e " + e);

		int f = s.lastIndexOf("u"); // return -1 i.e. substring/string "u" do not exist in String s
		System.out.println("int f " + f);

		char g = s.charAt(0); // return 'D' due to the character 'D' existing at zero index in the string.
		System.out.println("char g " + g);

//		char h = s.charAt(50); // give "StringIndexOutOfBoundsException" due to the argument crossing the string length
//		System.out.println(h);

		boolean i = s.contains("b"); // return false due to substring/string/charSquence "b" does not exist in String
										// s.
		System.out.println("boolean i " + i);

		boolean j = s.contains("th"); // return true due to substring/string/charSquence "th" existing in String s.
		System.out.println("boolean j " + j);

		boolean k = s.startsWith("s"); // return false due to String s does not starting with
										// substring/string/charSquence "s".
		System.out.println("boolean k " + k);

		boolean l = s.startsWith("D"); // return true due to String s starting with substring/string/charSquence "D".
		System.out.println("boolean l " + l);

		boolean m = s.endsWith("s"); // return false due to String s does not end with substring/string/charSquence
										// "s".
		System.out.println("boolean m " + m);

		boolean n = s.endsWith("d"); // return true due to String s end with substring/string/charSquence "d".
		System.out.println("boolean n " + n);
	}
}

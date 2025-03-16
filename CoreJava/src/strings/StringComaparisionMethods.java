package strings;

//-----------------------------------------------------  String Comparison Methods  ---------------------------------------------------------------------------

// -> equals() -> This method returns a boolean value. This method compares the content of the given two strings. 
//                If any character is not matched, it returns false. If all characters are matched, it returns true.

// #Syntax:- String1.equals(String2); return boolean

// -> equalsIgnoreCase() -> This method also returns a boolean value. The equalsIgnoreCase() Method is used to compare a specified String to another String,
//                          ignoring case considerations i.e. lower case or upper case. Two strings are considered equal 
//                          ignoring case if they are of the same length and corresponding characters in the two strings are equal ignoring case.

// #Syntax:- String1.equalsIgnoreCase(String2); return boolean

// Different between equals() Method and "=="(double equals operator) :-

// (i) == operator is used for reference comparison(address comparison). It means == the operator checks if both objects point to the same memory location or not.
//           But .equals() method is used for content comparison(in String class). It means the .equals() method is used to check object value.

// (ii) == operator is treated the same with the .equals() method of Object Class i.e. works the same for all other object comparisons except String Class.
//           But the .equals() method in String Class overrides the Object Class method i.e. customized for content comparison due to String Object Immutability behavior.

// -> compareTo() -> This method returns an integer value. This method is used for comparing two strings lexicographically(i.e. check their Unicode of mirror 
//                   characters and return subtraction value). Each character of both strings is converted into a Unicode value or decimal value for comparison. 
//                   If both the strings are equal then this method returns 0 else it returns a positive or negative value.

// #Syntax:- String1.compareTo(String2); return int

// -> compareToIgnoreCase() -> This method also returns an integer value. This method is the same as the compareTo method while ignoring case considerations i.e. 
//                             lower case or upper case. Two string's character is considered equal unicode ignoring case. If they have the same corresponding characters.

// #Syntax:- String1.compareToIgnoreCase(String2); return int

// Different Cases for compareTo() and compareToIgnoreCase() methods :-
// (1)  return 0 if String s1 = String s2
// (2)  return + if String s1 > String s2
// (3)  return - if String s1 < String s2

public class StringComaparisionMethods {
	public static void main(String[] args) {

		String s = new String("Rathod");
		String s1 = "Dev";
		String s2 = "Rathod";
		String s3 = "Dev";
		String s4 = new String("Dev");
		String s5 = new String("Rathod");
		String s6 = "dev";

		boolean a = s1.equals(null); // return false i.e. String s1 is not null
		System.out.println("boolean a " + a);

		boolean b = s1.equals(""); // return false i.e. String s1 is empty
		System.out.println("boolean b " + b);

		boolean c = s1.equals(s2); // return false i.e. both String's characters are not matched
		System.out.println("boolean c " + c);

		boolean d = s1.equals(s3); // return true i.e. String s1 is matched with String s3
		System.out.println("boolean d " + d);

		boolean e = s.equals(s2); // return true i.e. String s is matched with String s2
		System.out.println("boolean e " + e);

		boolean f = s == s2; // return false i.e. String object s reference(i.e. Exist in Heap Memory) is
								// different from String s2(i.e. Exist in SCP)
		System.out.println("boolean f " + f);

		boolean g = s == s4; // return false i.e. String object s reference and String's Characters both are
								// different from String s4
		System.out.println("boolean g " + g);

		boolean h = s == s5; // return false i.e. String object s reference is different from String s5
		System.out.println("boolean h " + h);

		boolean i = s1 == s3; // return true i.e. String object s1 and String object s5, both point to the
								// same reference object in memory.(SCP Memory)
		System.out.println("boolean i " + i);

		boolean j = s.equals(s5); // return true i.e. String object s characters are matched with String s5(i.e.
									// equals method does not check the reference of String objects)
		System.out.println("boolean j " + j);

		boolean k = s1.equals(s6); // return false i.e. String object s1 characters are different from String
									// s6(i.e. equals method treated different character if they have lower or upper
									// case)
		System.out.println("boolean k " + k);

		boolean l = s1.equalsIgnoreCase(s6); // return true i.e. String object s1 characters are matched with String
												// s6(i.e. equalsIgnoreCase method treated same character if they have
												// lower or upper case)
		System.out.println("boolean l " + l);

		int m = s1.compareTo(s3); // return 0 i.e. Subtraction of Unicode/Decimal values of String s1 Object and
									// String s3 is zero or both are the same string
		System.out.println("int m " + m);

		int n = s1.compareTo(s6); // return -32(Negative value) i.e. String s1 is smallest to Sting s6
		System.out.println("int n " + n);

		int o = s2.compareTo(s3); // return 14(Positive value) i.e. String s2 is greatest to Sting s3
		System.out.println("int o " + o);

		int p = s1.compareToIgnoreCase(s6); // return 0 i.e. in compareToIgnoreCase method String s1 and String s6 are
											// treated the same if they have different cases
		System.out.println("int p " + p);

	}
}

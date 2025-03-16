package strings;

//----------------------------------------------------  String Constructors  -----------------------------------------------------------------------

// String class has many constructors and methods but we learn 6 main constructors of String :-
// (1) No arguments Constructor
// (2) String argument Constructor
// (3) StringBuffer argument Constructor
// (4) StringBuilder argument Constructor
// (5) Byte array argument constructor
// (6) Char array argument constructor

// Why char array is best preferred to store user passwords as compared to String literals or String class objects??

// -> (i) String objects are immutable in Java and therefore if a password is stored as plain text it will be 
//        available in memory until the Garbage collector clears it, but String objects are stored in the String Literal pool 
//        for re-usability and garbage collection is not applicable in SCP, which is a security threat. while with an array, 
//        We can explicitly wipe the data after we're done with it. we can overwrite the array with anything we like, 
//        and the password won't be present anywhere in the system, even before garbage collection.
// -> (ii) If we try to print the String object it will print the actual content or inside object value 
//         While the char array prints the whole object it doesn't print the inside char array values that are security to 
//         hide privacy text or password.

public class StringConstructors {

	public static void main(String[] args) {
		String s = new String(); // no arguments Constructor creates Empty Object
		System.out.println(s.length()); // return 0 due to no argument pass in Constructor so create an empty object
										// that means no length.

		String s1 = new String("Dev"); // String argument Constructor
		System.out.println(s1 + " and its length is: " + s1.length());

		StringBuffer sb = new StringBuffer("Hello");
		String s3 = new String(sb); // StringBuffer argument Constructor here we can also say that Mutable Object is
									// converted to Immutable Object
		System.out.println(s3 + " and its length is: " + s3.length());

		StringBuilder sb1 = new StringBuilder("Welcome");
		String s4 = new String(sb1); // StringBuilder argument Constructor here we can also say that Mutable Object
										// is converted to Immutable Object
		System.out.println(s4 + " and its length is: " + s4.length());

		byte[] b = { 100, 101, 102, 103, 104, 105 };
		String s5 = new String(b); // byte array argument constructor that is converted to string from byte numbers
		System.out.println(s5);

		char[] c = { 'I', 'n', 'd', 'o', 'r', 'e' };
		String s6 = new String(c); // char array argument constructor that is converted to string from char values
									// or also say that it creates a combination of characters
		System.out.println(s6);

		char[] g = { 's', 't', 'r', 'i', 'n', 'g' };
		System.out.println(g); // return Object with hiding data

	}
}

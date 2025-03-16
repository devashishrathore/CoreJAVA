package strings;

//-----------------------------------------------------  String Is Final  -----------------------------------------------------------------------------------------

// -> Final is the keyword used with class, methods, and variables.
// -> String class has special features that are not available to other Java classes 
// and making the String class final prevents subclasses that could break these assumptions.

// Important String Class Features:-
// -> (i) String Constant Pool (SCP) :- It is a special memory location in the heap area that stores String Literals.
// -> (ii) Immutable Objects :- The String objects are immutable which means once the String object is created its data or state can't be changed but a new string object is created.
// -> (iii) + Operator for Strings :- Multiple Strings can be concatenated using + operator.
// -> (iv) Security:- The parameters used for network connections, database connection URLs, usernames/passwords, etc are represented in Strings. If it was mutable, these parameters could be changed easily.
// -> (v) Class loading:- String is used as an argument for class loading. If mutable, it could result in the wrong class being loaded (because mutable objects change their state).
// -> (vi) Synchronization and Concurrency:- Making String immutable automatically makes them thread-safe thereby solving the synchronization issues.
// -> (vii) Memory management :- When the compiler optimizes our String objects, it seems that if two objects have the same value (a =" test", and b =" test") and thus we need only one string object (for both a and b, these two will point to the same object

// Different between final and Immutability:
// (1) Final is the keyword used with class, methods, and variables. but immutability is the concept used for objects in which the object state and content can't be changed.
// (2) Final Objects are changeable but we can't reassign them. but immutability means we can't change its value and content.
// (3) Final Variable can't be changed and reassigned i.e. we can't change that value/content with final keyword variable declaration and initialization.
// (4) Final Method can't override i.e. we can't customize methods statements if the method is declared and initialized with the final keyword.
// (5) Final Class can't be extended i.e. we can't inherit features and properties of the class that's why we can't customize their methods and variables.  

public final class StringIsFinal {

	public static void main(String[] args) {
		final int a = 60;
//		a = 30; // Error -> Can't change final variable
		int b = a + 30; // Changed with assigning new variable b.(i.e. we can use final variable)

		final StringBuffer s = new StringBuffer("Rathod");
//		s = s.append("Dev"); // Error -> changed but can't reassign
		StringBuffer s2 = s.append(" Devashish");
		System.out.println(b + " " + s2);

		final String p = new String("Rathod"); // Immutable Object with final keyword(i.e. p is constantly point to this
												// object only)
		String p2 = p.concat("      Devashish"); // Here, create a new object and refer to p2.
		System.out.println(p2);

		StringIsFinal stringClass = new StringIsFinal();
		stringClass.sum(a, p);

//		Dev myClass = new Dev();
//		myClass.sum(a, p);

	}

	final void sum(int a, String s) {
		System.out.println(a + " " + s);
	}
}

//class Dev extends StringIsFinal { // Error -> Final class can't extend
//	void sum(int a, String s) { // Error -> Final Method can't override
//		System.out.println(a + s);
//	}
//}

package strings;

//-----------------------------------------------------  Strings Introduction  ---------------------------------------------------------------------------------------

// What's String:-

// (i) String is a non-primitive data type. -> Because it references a memory location where data is stored in the heap memory (or String Constant Pool) i.e,
// It references a memory where an object is actually placed. Thus the variable of a non-primitive data type is also called reference data type or object reference variable.
// This object reference variable lives on the stack memory and the object to which it points always lives on the heap memory.
// The stack holds a pointer to the object on the heap. Thus all non-primitive data types are simply called objects which are created by instantiating a class.

// (ii) String is the sequence of characters or say, String is an array of characters. -> String class implements the CharSequence Interface to sequence the characters as well as also implements 2 more interfaces: 
//     (1) Serializable Interface -> Used when we need to store a copy of the object and send it to another process that runs on the same system or over the network.
//     (2) Comparable Interface -> Used to order the objects of the class. It has only one method i.e. compareTo().

// (iii) String is a class -> It has many methods, inherits the Object class as well, and implements interfaces.
//    Syntax of String class -> public final class String extends Object implements CharSequence, Serializable, Comparable { }

// (iv) String is an immutable object -> We can create a String class object by using a new keyword.

// (v) Three classes to create String -> (1) String class, (2) StringBuffer class, and (3) StringBuilder class. 

public class Introduction {
	public static void main(String[] args) {
		char[] c = { 'd', 'e', 'v' }; // An array of characters
		String s = new String(c); // Immutable object
		System.out.println(s);

		String s1 = "ram"; // Most preferred way to create a string due to memory save and some advantages.
		System.out.println(s1);

		StringBuffer s2 = new StringBuffer("devashish");
		System.out.println(s2);

		StringBuilder s3 = new StringBuilder("Rathod");
		System.out.println(s3);
	}
}

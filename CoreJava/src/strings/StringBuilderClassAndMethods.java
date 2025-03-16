package strings;

// ----------------------------------------------------  String Builder Class  ------------------------------------------------------------------------

//What's -> StringBulder is also used to create String. But it creates mutable String Object

// Use Case or Why -> To overcome the problem of slow performance of StringBuffer methods, java introduced the StringBuilder concept in the JDK 1.5 version and 
//                    creates all the methods of StringBuilder as non-synchronized which increases the method's performance.

// #Syntax:- public final class StringBuilder extends AbstractStringBuilder implements java.io.Serializable, CharSquence { 
//                4 constructors and
//                  many methods 
//                                }

// Constructors of StringBuffer Class:-
// (1) StringBuilder(){---} -> no arguments Constructor
// (2) StringBuilder(CharSequence seq){---} -> CharSequence argument Constructor
// (3) StringBuilder(String str){---} -> String argument Constructor
// (4) StringBuilder(int capacity){---} -> integer argument Constructor i.e. we can set the no. of character by which it creates a limited character(s) String.

// Methods of StringBuilder Class:-
// In StringBuilder class has many methods and most of all methods are non-synchronized methods, here we learn only some important methods and they all are non-synchronized.
// All methods in the StringBuilder class are the same as the StringBuffer class but the difference is they are non-synchronized methods.

// Synchronized Method:- Synchronization in Java guarantees that no two threads can execute a synchronized method that requires the same lock simultaneously or concurrently.
//                    And thus, synchronization increases the waiting time of the thread and affects the performance of the system.

// -> append() - append method used to concat two StringBuilder object strings.
// -> capacity() - This method used to check no. of character(s) in StringBuilder object strings.
//              If the StringBuilder object string is reached or exceeds after 16 character(s) or maybe the StringBuilder Object string append any StringBuilder Object and exceeds capacity then it is calculated by 
//		           (1) (old capacity*2)+2 or (2) (old capacity+1)*2
// -> length() - To check and return the length of the string.
// -> delete(int beginIndex, int endIndex) - Same as substring method of string class but it deletes that part/substring from a string which parameter we passed in the method and returns the remaining string.
// -> deleteCharAt(int index) - Delete the character that exists in the passed parameter index number.
// -> equals() - Treated same as == operator or equals method of Object Class i.e. StringBuilder class does not override equals method of Object class so it does not check the content of string while checking the object references.
// -> insert(int beginIndex, String substring) - Insert the string as passed the first argument to where to start and the second argument to which string is inserted in existing string. 
// -> replace(int beginIndex, int endIndex, replacement string)- replace method first deletes the substring which is getting by start index and end index -1 parameters, and the deleted string is replaced by third argument replacement string.
// -> reverse() - Simply reverse the all characters of the string.
// -> toString() - Convert the StringBuffer string object to String.
// -> ensureCapacity(int capacity) - To set the capacity of existing StringBuilder String object. It means we can set our requirements capacity. 
// -> setCharAt(int index, char c) - To set the character at the given index or replace the character with a given new character in the provided index position.
// -> setLength(int length) - To set the maximum length of a string. if a string is bigger and we set the maximum length as smallest to the existing string length then it automatically deletes the exceeding part of the string and perfectly fits with the given length. 
// -> trimToSize() - To remove or delete the extra capacity of a string if it has many vacant capacities. 

//and many methods are available in the StringBuilder class but these are the main methods and also some methods are the same as String class methods 

public class StringBuilderClassAndMethods {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		System.out.println(s.capacity());
		System.out.println(s.length());
	}
}

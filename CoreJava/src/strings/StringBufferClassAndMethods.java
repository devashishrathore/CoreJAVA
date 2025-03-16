package strings;

// ------------------------------------------------------  StringBuffer Class  ------------------------------------------------------------------------

// What's -> StringBuffer is a class and is also used to create strings but it creates mutable string objects.
// Use case -> If the data does not change or change one or two times only, use String. While if data is constantly or frequently changing 
//             like in calculator, notepad, etc, we should use StringBuffer.

// #Syntax:- public final class StringBuffer extends AbstractStringBuilder implements java.io.Serializable, CharSquence { 
//             4 constructors and
//             many methods 
//            }

// Constructors of StringBuffer Class:-
// (1) StringBuffer(){---} -> no arguments Constructor
// (2) StringBuffer(CharSequence seq){---} -> CharSequence argument Constructor
// (3) StringBuffer(String str){---} -> String argument Constructor
// (4) StringBuffer(int capacity){---} -> integer argument Constructor i.e. we can set the no. of character by which it creates a limited character(s) String.

// Methods of StringBuffer Class:-
// In StringBuffer class has many methods and most of all methods are Synchronized methods, here we learn only some important methods and they all are Synchronized.

// Synchronized Method:- Synchronization in Java guarantees that no two threads can execute a synchronized method that requires the same lock simultaneously or concurrently.
//                       And thus, synchronization increases the waiting time of the thread and affects the performance of the system.

// -> append() - append method used to concat two StringBuffer object strings.
// -> capacity() - This method used to check no. of character(s) in StringBuffer object strings.
//                 If the StringBuffer object string is reached or exceeds after 16 character(s) or maybe StringBuffer Object string append any StringBuffer Object and exceeds capacity then it is calculated by 
//		           (1) (old capacity*2)+2 or (2) (old capacity+1)*2
// -> length() - To check and return the length of the string.
// -> delete(int beginIndex, int endIndex) - Same as substring method of string class but it deletes that part/substring from a string which parameter we passed in the method and returns the remaining string.
// -> deleteCharAt(int index) - Delete the character that exists in the passed parameter index number.
// -> equals() - Treated same as == operator or equals method of Object Class i.e. StringBuffer class does not override equals method of Object class so it does not check the content of string while checking the object references.
// -> insert(int beginIndex, String substring) - Insert the string as passed the first argument to where to start and the second argument to which string is inserted in existing string. 
// -> replace(int beginIndex, int endIndex, replacement string)- replace method first deletes the substring which is getting by start index and end index -1 parameters, and the deleted string is replaced by third argument replacement string.
// -> reverse() - Simply reverse the all characters of the string.
// -> toString() - Convert the StringBuffer string object to String.
// -> ensureCapacity(int capacity) - To set the capacity of existing StringBuffer String object. It means we can set our requirements capacity. 
// -> setCharAt(int index, char c) - To set the character at the given index or replace the character with a given new character in the provided index position.
// -> setLength(int length) - To set the maximum length of a string. if a string is bigger and we set the maximum length as smallest to the existing string length then it automatically deletes the exceeding part of the string and perfectly fits with the given length. 
// -> trimToSize() - To remove or delete the extra capacity of a string if it has many vacant capacities. 

// and many methods are available in the StringBuffer class but these are the main methods and also some methods are the same as String class methods 

public class StringBufferClassAndMethods {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer(); // empty Constructor returns an empty string and its default capacity
												// value is 16.
		System.out.println(sb.capacity());

		StringBuffer sc = new StringBuffer("Dev"); // String argument Constructor returns a mutable string object and
													// its capacity is the addition of the string's no. of character(s)
													// and the default capacity value is 16+3 = return 19.
		System.out.println(sc);
		System.out.println(sc.capacity());

		StringBuffer sd = new StringBuffer(500); // integer argument Constructor set capacity to store characters
													// numbers.
		System.out.println(sd.capacity());

		sb.append("dev"); // returns default value 16 due to the string does not reach or exceeds 16
							// characters
		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("Rathod");
		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("Indore");
		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("Mp"); // here, string is reached or exceed default 16 character(s) so capacity is
							// (16*2)+2 = 34 returns
		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("India"); // here, the string is append with a new string but does not exceed its old
							// capacity
							// so returns 34
		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("IndiaIndiaIndiaIndiaIndiaIndiaIndiaIndiaIndia"); // here, string is append with new string and
																	// exceeds old capacity so new capacity is (34*2)+2
																	// = 70 returns
		System.out.println(sb);
		System.out.println(sb.capacity());

		int a = sb.length(); // return 67 i.e. length of string(it has 67 characters)
		System.out.println(a);

		int b = sc.length(); // return 3 i.e. length of string(it has 3 characters)
		System.out.println(b);

		StringBuffer s = sc.delete(0, 1); // return ev i.e. delete the part starting from 0 to 1 index
		System.out.println(s);
		System.out.println(sc);

		StringBuffer s1 = sc.deleteCharAt(1); // return e i.e. delete the character which exists in 1 index number.
		System.out.println(s1);

		StringBuffer s2 = new StringBuffer("hello");
		StringBuffer s3 = new StringBuffer("hello");
		boolean v = s2.equals(s3); // return false due to checking object references not checking the content of
									// both Strings
		System.out.println(v);

		StringBuffer s4 = s2.append(s3);
		boolean x = s4.equals(s2); // return true due to StringBuffer String Objects s4 and s2 are point to same
									// object.
		System.out.println(x);

		StringBuffer s5 = s3.insert(3, "dev"); // return heldevlo due to insert string "dev" which is starting to 3rd
												// index
		System.out.println(s5);

		StringBuffer s6 = s3.replace(0, 3, "haa"); // return haadevlo due to replace the string which is starting from 0
													// index and ending with endIndex-1(3-1=2) and which is replaced by
													// replacement string "haa"
		System.out.println(s6);

		StringBuffer s7 = s6.reverse(); // return olvedaah due to reverse order of character(s) string.
		System.out.println(s7);

		String s8 = s7.toString();
		System.out.println(s8 + " and it's type is " + s8.getClass().getName());

		StringBuffer s9 = new StringBuffer("deva");
		System.out.println(s9.capacity()); // returns 16 + 4 = 20
		s9.ensureCapacity(100); // return 100 set capacity
		System.out.println(s9.capacity());
		System.out.println(s9);

		s9.setCharAt(1, 'i'); // return diva due to replace the index 1 character with the given I character
		System.out.println(s9);

		s9.setLength(2); // return length 2 and delete after exceeding length string part
		System.out.println(s9);
		System.out.println(s9.length());
		System.out.println(s9.capacity()); // return 100
		s9.trimToSize(); // remove extra vacant capacity from string and release memory
		System.out.println(s9.capacity()); // return 2

	}
}

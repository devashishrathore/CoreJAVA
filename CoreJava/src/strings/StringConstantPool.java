package strings;

//-------------------------------------------  String Constant Pool OR String Literals Pool  ------------------------------------------------------------------------

// String Constant Pool or String Literal Pool is an area in Heap Memory where Java stores String literal values.
// It is the special area or memory location present in Heap Memory to store only string literal.
// String Constant Pool is not applicable for Garbage Collection, JVM internally creates reference variables for each String literal Objects.
// It was present in the Method Area until the 1.6 version but after the 1.7 version, it was shifted to Heap Memory due to SCP can increase and decrease their size.
// String Constant Pool contains unique String Literal objects i.e. if we can store the same String literal value with different variables then it always refers to the same String literals object but if we change any one or more variables of them then now it refers to different String literals Object.     

// Different between Creations of String by "String Class Object" and "String literals" :-

// (1) By String class, always creates a maximum of 2 objects in memory, one is in Heap memory and the other is in String Literals Pool. but if is same String Literal Object is present in SCP then it always creates a minimum of 1 object in Heap Memory.
//      But in the case of String literal, it creates a maximum of 1 object in SCP only but if is same String Literal Object is present in SCP then it never creates any object in any memory while now existing Object refers to this new variable too.

// (2) By String class, occupy more memory due to no. of objects increase in Heap Memory.
//      But in the case of String literal, it Occupies less memory due to the possibility of to same Object referring to many Variables.

// (3) By String class, if we create 2 or more variables with the same content then it always creates different Objects reference in Heap Memory and One Object is created in SCP too.
//      But in the case of String literal, only one object is created in SCP and it refers to all variables.

// (4) Conclusion -> "String Literals" is the most preferred and best way to Create a String as compared to "String Class Object" due to memory saving, increasing productivity, and fast.

public class StringConstantPool {
	public static void main(String[] args) {

		String s = new String("Hello"); // Create 2 Objects that are present in (i) Heap Memory, and (ii) SCP
		System.out.println(s);

		String s1 = new String("Welcome");
		System.out.println(s1);

		String s2 = "Good morning"; // Create 1 Object that is present in only SCP
		System.out.println(s2);

		String s3 = new String("Hello"); // Create only 1 Object in Heap Memory due to already being present in SCP
		System.out.println(s3);

		boolean a = s == s3; // return false due to String class objects always creates different objects
								// reference in Heap Memory.
		System.out.println(a);

		String s4 = "Hello"; // No any object is created due to already present in SCP, now existing Object
								// also refers to s4 variable too.
		System.out.println(s4);

		String s5 = "Welcome";

		boolean b = s1 == s5; // return false due to String class objects always creating different objects
								// reference in Heap Memory i.e. s1 present in Heap Memory while String Literals
								// always refers to the same existing object in SCP i.e. s5 present in SCP.
		System.out.println(b);

		String s6 = "Welcome"; // return true due to the same String literal Object refers to both variables
								// i.e. s5 and s6.
		boolean c = s5 == s6;
		System.out.println(c);

	}
}

package strings;

//-------------------------------------------------------  String Immutability  -----------------------------------------------------------------------------

// What's Immutability Concept :-

// Immutability Concept is used for "String Object" i.e. String objects are immutable.
// It means once a String Object is created; its data or state can't be changed but a new string object is created.
// Immutable -> not changeable So, if we declare and initialize some value with a new string variable after that 
//              Now if we change this value or concat with another variable then it never affects that object in memory 
//              while creating a new different variable object in SCP memory with a unique content object (i.e. create 
//              different another object if that is not present in SCP) and after assigning that changed values in Heap Memory
//              (i.e. concatenation of both Objects), now updated Object refers to an assigned variable.

// Why String Objects are Immutable ??

// Stings are Immutable in Java because String Objects are cached in String Pool.
// Since cached String literals are shared between multiple variables/persons there is always a risk, 
// where one variable's/person's action would affect all other persons/variables.
// Like : if we declare many variables and initialize with the same values(i.e. SCP always creates only 
//        unique one object and refers to all that same content variables).
//        Now, if we changed/update any of them so SCP has security to store unique objects then 
//        If that is not a possibility of this so all Variables assigned with that object 
//        now refers to all assigned variables that are not correct that is why this concept is
//        "String Objects are Immutable".

public class ImmutableString {
	public static void main(String[] args) {

		String s = new String("Hello");

		String s1 = new String(" Welcome");

		s.concat(s1); // not update s variable due to not assign to any variable(String s is Immutable
						// Object i.e. not affect the concatenation value)
		System.out.println(s);

		s = s.concat(s1); // Now, here concatenation value or object refers to s variable that is a new
							// different object created in Heap Memory, and old "s" variable object("Hello")
							// in Heap Memory is applicable for Garbage Collection (i.e. SCP contains 2
							// different objects that are "Hello" and "Welcome")
		System.out.println(s);

		// Example :- all person have the same city but after some time any person
		// changed their city so,
		String person1City = "Indore";
		String person2City = "Indore";
		String person3City = "Indore";
		String person4City = "Indore"; // Only 1 Object is created in SCP and refers to all variables.

		System.out.println("All People's cities are : Person1->" + person1City + " Person2->" + person2City
				+ " Person3->" + person3City + " Person4->" + person4City);

		person1City = "Mumbai"; // A different unique object is created in SCP and now that object refers to
								// this person's city variable.(i.e. not affect the old object #IMMUTABILITY OF
								// STRING OBJECT)
		System.out.println("Updated city for person1 is: " + person1City + " Rest all cities are Person2->"
				+ person2City + " Person3->" + person3City + " Person4->" + person4City);

		String person5City = "Mumbai"; // No Object is created while the existing same content object in SCP also
										// refers to this. (i.e. pesrson1City and person5City both have the same Object
										// reference)
		System.out.println("Person1City is-> " + person1City + " and Person5City is-> " + person5City);
	}
}

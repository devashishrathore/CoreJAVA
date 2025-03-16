package strings;

//--------------------------------------------------------------------------   String Update Methods  --------------------------------------------------------------------------------

// Here we learn only 3 methods exist in the String class for updating a string while some more methods are used for updating the string 
// They do not exist in the String Class but they exist in StringBuffer and StringBuilder classes like:- remove() and deleteCharArr() etc..

// -> replace(char oldChar, char newChar) Method -> 
// replace(char oldChar, char newChar) method returns a string replacing all the old characters or ChrSequence to new characters or CharSequence.
// This method was introduced in the JDK 1.5 version.

// #Syntax:- String s1.replace(char oldChar, char newChar); returns String

// -> replaceFirst(String regex, String replacement) Method -> 
// This method replaces the first substring that fits the specified regular expression with the replacement String.
// If the specified regular expression(regex) is not valid, then it will provide a "java.util.regex.patternSyntaxException" exception.

//#Syntax:- String s1.replaceFirst(String regex, String replacement); returns String

// -> replaceAll(String regex, String replacement) Method ->
// This method replaces all the substring that fits the specified regular expression with the replacement String.
//If the specified regular expression(regex) is not valid, then it will provide a "java.util.regex.patternSyntaxException" exception.

//#Syntax:- String s1.replaceAll(String regex, String replacement); returns String

// Different between replace(), replaceFirst(), replaceAll():-

// replace() Method takes the first argument as a characters/characters sequence whose replaced with the second argument characters/characters sequence.
// If we are trying to pass a regex in the replace method then it is treated as a simple string or characters so it does not affect the replacement String.
// While replaceFirst() and replaceAll() both take taking first arguments as a regular expression(regex) which replaced with the second argument any substring.

public class StringUpdateMethods {
	public static void main(String[] args) {

		String s = "Hello all , this is the java string replace methods";
		String t = "aaa bb cc d e";

		String s1 = s.replace('h', 'k'); // all h Characters are replace with k Characters
		System.out.println(s1);

		String s2 = s.replace("th", "fz"); // all th-substring are replace with fz-substring
		System.out.println(s2);

		String s3 = s.replace("th(.)", "fz"); // never affects the string replacement due to regex being treated as a
												// string in replace method
		System.out.println(s3);

		String s4 = s.replaceFirst("th", "fd"); // replace only first match with th-substring
		System.out.println(s4);

		String s5 = s.replaceFirst("t(.)", "FD"); // replace only first match with given regex
		System.out.println(s5);

		String s6 = s.replaceAll("th", "ddd"); // replace all matches with th-substring
		System.out.println(s6);

		String s7 = s.replaceAll("t(.)", "DDD"); // replace all matches with given regex
		System.out.println(s7);

		String s8 = s.replaceAll("t(.*)", "RR"); // replace all matches with given regex
		System.out.println(s8);

		String t1 = t.replace('g', 'k'); // never affects the string replacement if the given argument does not
											// exist/matched in String Object content for all methods
		System.out.println(t1);
	}
}

package strings;

// ---------------------------------   Difference Between String Class, StringBuffer Class, And StringBuilder Class  ---------------------------------------------------------

// Parameters                    String                    StringBuffer                    StringBuilder

//                          Heap Area as well                                      
//  Storage                   as SCP(String                 Heap Area                       Heap Area    
//                            Constant Pool)

//  Objects                  Immutable Object               Mutable Object                  Mutable Object  

//                           If we change the value          Consumes less                  Occupy less 
//  Memory                  of string a lot of times.            memory                         memory           
//                          it will allocate more                                                              
//                                memory                                          

//   Thread-safe                                            all methods are sync-            non-synchronized     
//                             not thread-safe              -hronized & thus it is           methods i.e. not
//                                                              thread-safe                  thread-safe         

//    Performance                    Slow                    Fast as compared to             Fast as compared to  
//                                                               String                         StringBuffer      

//     Use                      If data is not                If data is changed             If data is changed   
//                              changing frequently             frequently                    frequently and want 
//                                                                                             fast performance

public class StringVsStringBufferVsStringBuilder {
	public static void main(String[] args) {

		String s = new String("Dev");
		StringBuffer s1 = new StringBuffer("Dev");
		StringBuilder s2 = new StringBuilder("Dev");

		System.out.println("String Class s is: " + s);
		System.out.println("StringBuffer Class s1 is: " + s1);
		System.out.println("StringBuilder Class s2 is: " + s2); // All 3 String's are Different from each other.
	}
}

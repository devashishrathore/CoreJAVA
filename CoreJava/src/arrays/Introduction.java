package arrays;

//----------------------------------------------------------   Arrays Introduction   --------------------------------------------------------------------- 

// An array is an object that holds a fixed number of values of homogeneous or similar data type.
// Or say An Array is a Data Structure where we store similar elements.
// The length of an array is assigned when the array is created and After creation, its length is fixed.

// For example: 
public class Introduction {
	public static void main(String[] args) {
		int[] a = new int[6]; // 1-D Array, It will create an array of length 6 and the index value will
								// always start from 0, so here index positions are 0 to 5.
		System.out.println("a Array size: " + a.length);
		int[][] b = new int[3][4]; // 2-D Array(Multi-Dimension Array)
		System.out.println("b Array size: " + b.length);

		int[] c; // Declaration
		c = new int[5]; // Creation
		c[0] = 10;
		c[1] = 20;
		c[2] = 30;
		c[3] = 40;
		c[4] = 50; // Initialization
		for (int i : c) { // Retrieve Elements
			System.out.println("c Array Elements : " + i);
		}

		int[] d = { 1, 2, 3, 4, 5 }; // Declaration , Creation, and Initialization in a single line
		for (int j : d) { // Retrieve Elements
			System.out.println("d Array Elements : " + j);
		}
	}
}

// Features Of An Array :-

// A Java array variable can be declared like other variables with [] after the data type.
// The variables in the array are ordered and each has an index beginning from 0.
// In Java, Arrays are objects, and thus they occupy memory in the 'Heap Area'.
// The direct superclass of an array type is Object.
// They are always created at runtime.
// The length of an array can be find by using member 'length'. This is different from C/C++ where we find length using "sizeof".
// The elements of an array are stored in consecutive memory locations.

// Advantages Of An Array :-

// Arrays are used to store multiple data items of the same type by using only a single name.
// We can access any element randomly by using indexes provided by arrays.
// Arrays can be used to implement other data structures like linked lists, stacks, queues, trees, graphs, etc.
// Primitive type to wrapper classes object conversion will not happen so it is fast.

// Disadvantages Of An Array :-

// Fixed Size -> We need to mention the size of the array, thus they have fixed size. When the array is created, the size cannot be changed.
// Memory Wastage -> There is a lot of chance of memory wastage. Suppose we create an array of length 100 but only 10 elements are inserted, then 90 blocks are empty and thus memory wasted.
// Strongly Typed -> Array stores only similar data types, thus strongly typed.
// Reduce Performance -> The elements of an array are stored in consecutive memory locations, thus to delete an element in an array we need to traverse throughout the array so this will reduce performance.
// No Methods -> Arrays do not have to add or remove methods.

// Types Of An Array :-
// (i) One-Dimensions Array -> which has only one Array. like int[] a = new int[6];
// (ii) Multi-Dimensions Array -> Which has an array inside the array in a hierarchy way. In multi-dimensions, arrays may be 2-D, 3-D, and 4-D arrays. like int[][] a = new int[3][4];

// Steps For Using An Array :-
// (1) Declaration -> Declare with any variable. like int[] a;
// (2) Creation -> After declaration create an array using a new keyword and set the size of an array. like a = new int[5];
// (3) Initialize -> After Declaration and creation of an array initialize values in it. like a[0] = 10; 
// (4) Retrieve Elements -> Now, we can print or retrieve elements of an array in two ways -(i)By using for loop, and (ii)By using for each loop. like for(int i:a){ System.out.println(i)};

//
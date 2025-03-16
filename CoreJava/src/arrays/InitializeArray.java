package arrays;

//-----------------------------------------------  Initialization Of An Array  ------------------------------------------------------------------------

public class InitializeArray {

	public static void main(String[] args) {
		int[] a; // Declaration
		a = new int[5]; // Creation -> compulsory to declare the size of an array at the time of
						// creation.
		System.out.println("a Array size: " + a.length);

		System.out.println();

		int[] b = new int[7]; // We can declare and create an array within a single line.
		System.out.println("b Array size: " + b.length);

		b[0] = 10; // Array initialization at 0 index position
		b[1] = 20; // Array initialization at 1 index position
		b[2] = 30; // Array initialization at 2 index position
		b[3] = 40; // Array initialization at 3 index position

		b[4] = 50; // Initialization -> if we did not initialize values of the rest of all index positions
					// then Java always takes values for that by default as depending on variable data
					// type. here take 0 as the int data type.

		b[7] = 80; // Initialize array at index position 7 or more, it will throw
					// 'ArrayIndexOutOfBoundException' exception, so we cannot initialize an array
					// more than its size.

		for (int i : b) { // Retrieve Elements
			System.out.println("b Array Elements : " + i);
		}

		System.out.println();

		int[] c = { 1, 2, 3, 4, 5 }; // Declaration, Creation, and Initialization in a single line -> First Way.
		for (int j : c) { // Retrieve Elements
			System.out.println("c Array size: " + c.length + " c Array Elements : " + j);
		}

		System.out.println();

		int[] d = new int[] { 2, 4, 6, 8, 10 }; // Declaration, Creation, and Initialization in a single line -> Second
												// Way.
		for (int j : d) { // Retrieve Elements
			System.out.println("d Array size: " + d.length + " d Array Elements : " + j);
		}
	}
}

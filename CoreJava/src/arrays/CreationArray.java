package arrays;

//-------------------------------------------------------   Creation Of An Array  -----------------------------------------------------------------

public class CreationArray {

	public static void main(String[] args) {
		int[] a; // Declaration
		a = new int[5]; // Creation -> compulsory to declare the size of an array at the time of
						// creation.
		System.out.println("a Array size: " + a.length);

		System.out.println();

		int[] b = new int[10]; // We can declare and create an array within a single line.
		System.out.println("b Array size: " + b.length);

		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50; // Initialization -> if we do not initialize values of the rest of all index
					// positions
					// then Java always takes values for that by default as depending on variable
					// data
					// type. here take 0 as the int data type.
		for (int i : b) { // Retrieve Elements
			System.out.println("b Array Elements : " + i);
		}

		System.out.println();

		int[] c = { 1, 2, 3, 4, 5 }; // Declaration , Creation, and Initialization in a single line
		for (int j : c) { // Retrieve Elements
			System.out.println("c Array size: " + c.length + " c Array Elements : " + j);
		}

		System.out.println();

		int[] d = new int[0]; // Program will successfully compile and execute.
		System.out.println("d Array size: " + d.length);

		System.out.println();

		int[] e = new int[-5]; // Program will compile successfully but when we run the program, it will throw
								// a 'Negative Array SizeException' exception.
		System.out.println("e Array size: " + e.length);

	}
}

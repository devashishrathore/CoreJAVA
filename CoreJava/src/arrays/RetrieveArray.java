package arrays;

//-----------------------------------------------------   Retrieve Elements From An Array  ------------------------------------------------------------------

public class RetrieveArray {

	public static void main(String[] args) {
		// We can print elements of an array in two ways
		int[] a = { 10, 20, 30, 40, 50, 60, 70 }; // Declaration, Creation, and Initialization in a single line.

		for (int i = 0; i < a.length; i++) { // Way 1 -> using for loop
			System.out.println("a Array Elements by for loop " + a[i]);
		}

		System.out.println();

		for (int j : a) { // Way 2 -> using for-each loop
			System.out.println("a Array Elements by for-each loop " + j);
		}
	}
}

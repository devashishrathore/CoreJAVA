package arrays;

//-------------------------------------------------------------  Declaration Of An Array  -------------------------------------------------------------

public class DeclarationArray {

	public static void main(String[] args) {
		// Different Ways of Declaration of Arrays are :
		int[] a; // Most Preferred Array Declaration is 'int[] a;', because here 'a' is a
					// one-dimensional int array, thus the name is clearly separated with type. the
					// standard way to declare any variable.
		int[] b;
		int[] c;
		int d[];

		// int[7] m; // We cannot provide size at the time of array declaration i.e.
		// 'int[7] a;' or 'int a[7];' statement is incorrect.

		// There is a difference between below two statements below :
		int[] x, y; // here 'x' and 'y' both are arrays.
		int p[], q; // here 'p' is an array, and 'q' is a simple int type variable, not an array.
		System.out.println("Array Declaration");
	}
}

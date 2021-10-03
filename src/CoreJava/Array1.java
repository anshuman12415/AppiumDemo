package CoreJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array1 {
	public static void main(String[] args) {

		/*
		 * // array sorting int a[]= {11,12,1,3,13}; Arrays.sort(a); for(int
		 * i=0;i<=a.length-1;i++) System.out.println(a[i]);
		 */

		// duplicate elements
		// String s[] = { "anshuman", "anshu", "java", "c", "java", "ry", "ky", "ry" };

		/*
		 * for (int i = 0; i < s.length; i++) { for (int j = i + 1; j < s.length; j++) {
		 * if (s[i].equals(s[j])) { System.out.println("duplicate element is " + s[i]);
		 * } } }
		 */
		// using hashset
		/*
		 * Set<String> store = new HashSet<String>(); for (String sa : s) { if
		 * (store.add(sa) == false) { System.out.println("duplicate element is" + sa); }
		 * }
		 */

		// smallest, largest num

		/*
		 * int num[] = { 1, 2, 3, 11, 12, 13, -11 }; int largest = num[0]; int smallest
		 * = num[0]; for (int i = 1; i < num.length; i++) { if (num[i] > largest) {
		 * largest = num[i]; } else if (num[i] < smallest) { smallest = num[i]; } }
		 * System.out.println("no of array= " + Arrays.toString(num));
		 * System.out.println("largest num " + largest);
		 * System.out.println("smallest num " + smallest);
		 */

		/*
		 * //sort in array
		 * 
		 * int arr[]= {1,3,2,5,33,41,11}; Arrays.sort(arr); for(int
		 * i=0;i<arr.length-1;i++) { System.out.println(arr[i]); }
		 */

		// addition of two matrix
		int a[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 4, 5, 6 } };
		int b[][] = { { 1, 2, 4 }, { 2, 3, 34 }, { 34, 35, 6 } };
		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.println(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.toString(a));
		int i = 0;
		int j = a.length - 1;
		/*
		 * while(i<=j) { int temp = a[i]; a[i] = a[j]; a[j] = temp; i++; j--; }
		 */

		for (i = 0; i <= a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}

		String[] str = {"hello","good","morning","revanth"};
		
		System.out.println(Arrays.toString(a));
	}

	
}

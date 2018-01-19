import java.util.Scanner;

/**
 * 
 * Print the following pattern for the given number of rows. Pattern for N = 3
 * 333 233 123
 * 
 * @author unuser
 *
 */
public class NumberPattern {

	static private Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("enter n values");
		int n = scan.nextInt();
		int i = n;
		for (; i > 0; i--) {

			for (int j = i; j <= n; j++) {
				System.out.print(j);
			}
			for(int k =i-1;k>0;k--)
				System.out.print(n);
			System.out.println();
		}
	}

}


/*
 * print all subsequences of a string using bit masking
 * no of subseqences are 2^n
 * 
 */
public class AllSubsequence {

	public static void main(String args[]) {
		String str = "xyz";
		printSubsequences(str);
	}

	private static void printSubsequences(String str) {

		int length = str.length();
		int n = (1 << length) - 1;

		for (int i = 0; i <= n; i++) {
			findBits(str, i);

		}

	}

	private static void findBits(String str, int n) {

		int i=0;
		while (n > 0) {
			if((n & 1)>0) {
				System.out.print(str.charAt(i));
			}
			else
				System.out.print("");
			i++;
			n = n>>1;
		}
		System.out.println();

	}
}

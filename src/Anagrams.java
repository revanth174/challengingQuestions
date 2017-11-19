import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		
		String one = scan.nextLine();
		String two = scan.nextLine();
		if(one.length() != two.length()) {
			System.out.println(false);
			return;
		}
		Boolean b = isAnagram(one,two);
		System.out.println(b);
	}
	private static Boolean isAnagram(String one, String two) {
		int[] a = new int[26];
		int[] b = new int[26];
		Arrays.fill(a, 0);
		Arrays.fill(b, 0);
		a = countArray(one);
		b = countArray(two);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		for(int i=0;i<a.length;i++) {
			if(a[i] != b[i])
				return false;
		}
		return true;
		
	}
	private static int[] countArray(String one) {
		
		int[] count = new int[26];
		String str = one.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch = one.charAt(i);
			int digit = ch - (int)'a';
			count[digit]++;
		}
				return count;
	}
}

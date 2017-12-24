import java.util.Arrays;
import java.util.Scanner;

public class DivisableArrays {

	private static Scanner scan;

	public static void main(String args[]) {

		scan = ScannerUtil.getScanner();
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int k = scan.nextInt();

		System.out.println(Arrays.toString(a));
		int sum[] = new int[n];
		sum[0] = a[0];
		for (int i = 1; i < n; i++) {
			sum[i] = sum[i - 1] + a[i];

		}

		System.out.println(Arrays.toString(sum));

		for (int i = 0; i < n; i++) {
			sum[i] %= k;
		}

		System.out.println(Arrays.toString(sum));

		int[] count = new int[k];
		Arrays.fill(count, 0);
		count[0] = 1;
		for (int i = 0; i < n; i++) {
			count[sum[i]]++;
		}
		
		System.out.println(Arrays.toString(count));

		int now = 0;
		for(int i =0;i<k;i++) {
			if(count[i]>1) {
				now += (count[i] * (count[i]-1)) / 2;
				System.out.println(now);
			}
		}
		
		System.out.println(now);
	}

}

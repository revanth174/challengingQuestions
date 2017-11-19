import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * You are  given array of size N and a interger M. The array contains n*(n-1)/2 different pairs.You need
 * to find chow many of those pairs have the sum to M. 
 * 
 *Input:
 * first line consistes of two integers N and M.
 * next line consists of N array elements
 * Output:
 * 
 * print no of different pairs to M
 * 
 */
public class PairSum {

	private static Scanner scan=new Scanner(System.in);
	public static void main(String args[]) {
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		
		int count = findNoOfDifferentPairs(a,m);
		System.out.println(count);
	}
	private static int findNoOfDifferentPairs(int[] a, int m) {
		
		int count=0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i =0;i<a.length;i++) {
			if(map.containsValue(a[i])) {
				count++;
				//System.out.println(map.);
			}
		map.put(i, m-a[i]);
			
		}
		
		/*for(Integer n :map.keySet()) {
			System.out.println(n+"  "+map.get(n));
		}*/
		return count;
	}
}

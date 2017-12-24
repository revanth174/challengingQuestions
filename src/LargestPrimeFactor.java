import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
  		Input Format

		First line contains , the number of test cases. This is followed by  lines each containing an integer .

		Constraints
		1<t<=10
		10<=n<=10^12
		
		Output Format
		
		For each test case, display the largest prime factor of .
		
		Sample Input 0
		
		2
		10
		17
		Sample Output 0
		
		5
		17
  
 */
public class LargestPrimeFactor {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {
			long n = scan.nextLong();
			System.out.println(largestPrimeFactor(n));
		}

	}

	private static int largestPrimeFactor(long n) {
		int count = 0;
		Map<Long,Long> map = new HashMap<>();
		while(n%2==0) {
			//System.out.print(2+",");
			count++;
			n = n/2;
		}
		map.put((long)2,(long) count);
		
		int large = 0;
		int i;
		//if i=9 , n wont divide by n because number thats by 9 would have already divided by 3 similary for all other numbers
		for( i =3;i<=Math.sqrt(n);i+=2) {
			count = 0;
			while(n%i==0) {
				//System.out.print(i+",");
				count++;
				n = n/i;
				large = i;
			}
			if(count!=0)
				map.put((long)i,(long)count);
		}
		if(n>1) {
		//System.out.print(n);
			map.put(n, (long)1);
			large =(int) n;
		}
		System.out.println(map.toString());
		
		return large;
	}

	

	

}

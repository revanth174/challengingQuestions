import java.util.Scanner;

public class PrimeNumberCheck {
		public static Scanner scan = new Scanner(System.in);
		public static void main(String args[]) {
			long n = scan.nextLong();
			if(isPrime(n))
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		private static boolean isPrime(long n) {
			
			if(n==2)
				return true;
			if(n%2 == 0)
				return false;
			for(int i=3;i<=Math.sqrt(n);i++) {
				if(n%i==0)
					return false;
						
			}
			return true;
		}
	
}

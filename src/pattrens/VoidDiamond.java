package pattrens;

/* if n = 9
 * ********* 
 * **** **** 
 * ***   *** 
 * **     **  
 * *       * 
 * **     ** 
 * ***   *** 
 * **** **** 
 * *********
 */

public class VoidDiamond {
	
	public static void main(String args[]) {
		int n = 9;
		print(n);
		
	}

	private static void print(int n) {
		
		int a = n/2;
		for(int i=1;i<=n;i++)
			System.out.print("*");
		System.out.println();
		for(int i=1;i<=a;i++) {
			
			// for left stars 
			for(int j=1;j<=a-i+1;j++)
				System.out.print("*");
			
			// for spaces
			for(int j = 1;j<=2*i-1;j++)
				System.out.print(" ");
			
			//for right stars
			for(int j=1;j<=a-i+1;j++)
				System.out.print("*");
			System.out.println();
			
		}
		
		for(int i=a-1;i>=1;i--) {
			
			// for left stars 
			for(int j=1;j<=a-i+1;j++)
				System.out.print("*");
			
			// for spaces
			for(int j = 1;j<=2*i-1;j++)
				System.out.print(" ");
			
			//for right stars
			for(int j=1;j<=a-i+1;j++)
				System.out.print("*");
			System.out.println();
			
		}
		
		for(int i=1;i<=n;i++)
			System.out.print("*");
		
	}

}

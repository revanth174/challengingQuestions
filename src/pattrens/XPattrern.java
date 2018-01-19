package pattrens;


/*
 * Pattern for N = 3 (No. of rows = 5, No. of columns = 5)
 *  1     1
 *   2  2 
 *     3 
 *   2  2 
 *  1     1
 */
public class XPattrern {
	
	public static void main(String args[]) {
		int n = 5;
		printPattern(n);
	}

	private static void printPattern(int n) {
		int  cols = 2 * n - 1;
	      int rows = cols;
	      for(int i=1;i<= n;i++) {
	        for(int j=1;j<=cols;j++) {
	          if(i  == j || i+j == 2*n)
	            System.out.print(i);
	          else
	            System.out.print(" ");
	        }
	        System.out.println();
	      }
	      for(int i=n-1;i>=1;i--) {
	        for(int j=1;j<=cols;j++) {
	          if(i  == j || i+j == 2*n)
	            System.out.print(i);
	          else
	            System.out.print(" ");
	        }
	        System.out.println();
	      }
	      
		}
		
	

}

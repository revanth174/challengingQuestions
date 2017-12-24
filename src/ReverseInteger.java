import java.util.Scanner;

public class ReverseInteger {
	
	public static void main(String args[]) {
		int num = 254;
		String reverse = reverse(num);
		System.out.println(reverse);
	}

	private static String reverse(int num) {
		
		
		boolean isNegative = num < 0 ? true : false;
		if(isNegative)
			num *=-1;
		String str = Integer.toString(num);
		
		String rev = new StringBuilder(str).reverse().toString();
		Scanner scan = new Scanner(System.in);
		//int reverse  = Integer.parseInt(rev);
		/*int rem;
		int reverse = 0;
		while(num > 0) {
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num / 10;
		}*/
		
		if(isNegative)
			rev = "-" + rev;
		return rev;
	}

}

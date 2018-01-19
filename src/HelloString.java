import java.util.Scanner;

/**
 * Given a String S, you have to check weather you can make "hello" by removing
 * several letters from it. Return true or false accordingly. For example, if
 * you type the word "ahhellllloou", it will be considered that answer is true.
 * And if you type "hlelo", then you can't able to say hello. So answer is
 * 
 * @author unuser
 *
 */
public class HelloString {

	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {

		String str = scan.next();
		System.out.println(checkHello(str));
			

	}

	private static boolean checkHello(String str) {
		char[] hello = { 'h', 'e', 'l', 'l', 'o' };

		int j = 0;
		int flag = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == hello[j]) {
				//System.out.println(str.charAt(i) + "is matched " + hello[j]);
				j++;
			}
			if(j>=hello.length) {
				
				flag = 1;
				break;
			}
			
				
		}
		
		if(flag==1)
			return (true);
		else
			return (false);
	}

}

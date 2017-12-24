
public class Palindrome {
	
	public static void main(String[] args) {
		String str = "abad";
		if(isPalindrome(str))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

	private static boolean isPalindrome(String str) {
		
		//String rev = reverse(str);
		//System.out.println(rev);
		StringBuilder sb = new StringBuilder(str);
		StringBuilder revb = sb.reverse();
		String rev = revb.toString();
		if(rev.equals(str))
			return true;
		else
			return false;
		
	}

	private static String reverse(String str) {
		
		if(str == null || str.isEmpty())
			return str;
		return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
		
	}

}

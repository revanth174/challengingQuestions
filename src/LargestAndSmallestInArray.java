
public class LargestAndSmallestInArray {
	
	public static void main(String args[]) {
		int[] a = {1,2,-10,-282,2545,101,-54654,545};
		int large = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		for(int number : a) {
			if(number > large) 
				large = number;
			else if(number < small)
				small = number;
		}
		System.out.println(large);
		System.out.println(small);
	}
	

}

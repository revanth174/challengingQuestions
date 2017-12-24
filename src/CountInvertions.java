/*
 * Let A[0 ... n-1] be an array of n distinct positive integers.
 *  If i < j and A[i] > A[j] then the pair (i, j) is called an inversion of A (where i and j are indexes of A). 
 * Given an integer array A, your task is to find the number of inversions in A
 */
public class CountInvertions {

	public static void main(String args[]) {
		int a[] = {2,5,1,3,4};
		int count = noOfInversions(a);
		System.out.println(count);
		
	}

	private static int noOfInversions(int[] a) {

		int count = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] > a[j])
					count++;
				
			}
		}
		return count;
	}
}

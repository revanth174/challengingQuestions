import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers of size n which contains numbers from 0 to n - 2. 
 * Each number is present at least once. That is, if n = 5, numbers from 0 to 3 is present in the given array at least once and one number is present twice. 
 * You need to find and return that duplicate number present in the array.
 *  Assume, duplicate number is always present in the array
 */
public class DuplicateInArray {
	
	public static void main(String args[]) {
		int a[] = {0,1,2,4,3,4};
		int dupNumber = findDuplicateNumber(a);
		System.out.println(dupNumber);
	}

	private static int findDuplicateNumber(int[] a) {

		Set<Integer> set = new HashSet<>();
		for(Integer i : a) {
			if(set.contains(i))
				return i;
			set.add(i);
		}
		
		return -1;
	}

}

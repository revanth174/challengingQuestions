
public class SecondLargestElement {
	
	public static void main(String arg[]) {
		int a[] = {8 ,8,5,5,8,8};
		int secondLargest ;
		secondLargest = findSecondLargest(a,a.length);
		System.out.println(secondLargest);
	}

	private static int findSecondLargest(int[] a, int length) {
		
		int first = Integer.MIN_VALUE;
		int second = first;
		
		for(int i=0;i<length;i++) {
			
			if(a[i] >= first) {
				if(a[i] != first) {
					second = first;
					first = a[i];
				}
			}
			else if(a[i] > second)
				second = a[i];
			
			System.out.println("first = " + first);
			System.out.println("second = " + second);
		}
		second = (second == Integer.MIN_VALUE ? -1 : second);
		
		return second;
	}

}

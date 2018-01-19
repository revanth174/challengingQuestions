
public class ArrayEquilibriumIndex {

	public static void main(String args[]) {
		int[] a = {0,1,-5,2,-1,3,2};
		int index = findEquilibriumIndex(a);
		System.out.println(index);
	}

	private static int findEquilibriumIndex(int[] a) {
		int n = a.length;
		int sum = 0 ;
		for(int i=0;i<n;i++) {
			sum += a[i];
		}
		int leftsum = 0;
		for(int  i=0;i<n;i++) {
			sum -=a[i];
			if(leftsum == sum)
				return i;
			leftsum +=a[i];
			
		}
		
		return -1;
	}

	/*private static int findEquilibriumIndex(int[] a) {

		int sum[] = new int[a.length];
		sum[0] = a[0]; 
		for (int i = 1; i < a.length; i++) {
			sum[i] = sum[i-1] + a[i];
		}
		
		int total = sum[a.length-1];
		for(int i =1;i<a.length;i++) {
			int left = sum[i-1];
			int right = total - sum[i] ;
			if(left == right)
				return i;
		}
		return -1;
	}*/

}

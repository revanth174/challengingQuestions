
public class ArrayEquilibriumIndex {

	public static void main(String args[]) {
		int[] a = {-7,1,5,2,-4,3,0};
		int index = findEquilibriumIndex(a);
		System.out.println(index);
	}

	private static int findEquilibriumIndex(int[] a) {

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
	}

}

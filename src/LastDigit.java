
public class LastDigit {

	public static void main(String args[]) {
		long a = 107;
		long b = 109;
		long last = computeLastDigit(a, b);
		System.out.println(last);
	}

	private static long computeLastDigit(long a, long b) {

		if (b < a)
			return 0;
		else {
			long diff = b - a;
			if (diff >= 5)
				return 0;
			else {
				long last = 1;
				for (int i = 1; i <= diff; i++) {
					System.out.println(last);
					last = (last * (a + i) % 10) % 10;
				}
				return last;
			}

		}

	}

}

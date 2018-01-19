import java.util.Date;
import java.util.Random;

public class DateToLocalDate {
	
	public static void main(String args[]) {
		
		Date date = new Date();
		System.out.println(date);
		System.out.println("");
		
		
		Random ran = new Random();
		int n = ran.nextInt(100000);
		System.out.println(n);
	}

}

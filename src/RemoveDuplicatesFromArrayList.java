import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {
	
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1,2,2,4,2,5,8,7,1,7);
		
		/*// hash set doesnot main order of creation 
		Set<Integer> set = new HashSet<>(list);
		set.forEach(i -> System.out.println(i));
		
		list = new ArrayList<>(set);
		list.forEach(i->System.out.println(i));*/
		
		Set<Integer> sets = new LinkedHashSet<>(list);
		
		sets.forEach(i -> System.out.println(i));
		
		
	}

}

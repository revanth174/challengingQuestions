import java.util.TreeMap;

public class MaxCharInString {

		public static void main(String arg[]) {
			String s = "bkajdkfjjdjf";
			TreeMap<Character,Integer> map = new TreeMap<>();
			char[] ch = s.toCharArray();
			for(int i =0;i<ch.length;i++) {
				
				if(map.containsKey(ch[i])) {
					int k = map.get(ch[i]);
					map.put(ch[i],++k);
				}
				else
				{
					map.put(ch[i], 1);
				}
			}
			
			
			char c = map.firstKey();
			System.out.println(map.get(c));
					
		}
}

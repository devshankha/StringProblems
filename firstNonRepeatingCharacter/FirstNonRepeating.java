
//Code is inspired from == https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeating {
	static Character firstNonRepeating(String args) {
		int l = args.length();
		Map<Character,Integer> map = new HashMap<>();
		for (int i=0; i < l; i++) {
			Character ch = args.charAt(i);
			if (map.containsKey(ch)) {
				int s = map.get(ch);				
				map.put(ch,++s);
			} else
				map.put(ch, 1);
			
		}
		System.out.println(map);
		for (int i=0; i < l; i++) {
			
			Character ch = args.charAt(i);
			int s = map.get(ch);
			if (s == 1)
				return ch;	
			
			
		}
		
		
		
		return null;
		
	}
	public static void main(String[] args) {
		String ks = "azacbddz";
		System.out.println(FirstNonRepeating.firstNonRepeating(ks));
		
		
		
	}

}

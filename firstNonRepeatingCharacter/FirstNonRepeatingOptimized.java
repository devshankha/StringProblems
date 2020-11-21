//Code is inspired from == https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
//
//This is an optimized version
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class CountIndex {
	@Override
	public String toString() {
		return "[count=" + count + ", index=" + index + "]";
	}

	int count;
	int index;
	public CountIndex(int i) {
		index = i;
		count = 1;
		
	}
	void incCount() {
		count = count+1;
	}
	
	int getCount() {
		return count;
	}
	
	int getIndex() {
		return index;
	}
}
public class FirstNonRepeatingOptimized {
	static Character firstNonRepeating(String args) {
		int l = args.length();
		Map<Character,CountIndex> map = new HashMap<>();
		for (int i=0; i < l; i++) {
			Character ch = args.charAt(i);
			if (map.containsKey(ch)) {
				CountIndex c = map.get(ch);
				c.incCount();			
				
				
			} else
				map.put(ch, new CountIndex(i));
				
			
		}
		System.out.println("The map is "+map);
		Iterator<Character> itr = map.keySet().iterator();
		Integer result = Integer.MAX_VALUE;
		while (itr.hasNext()) {
			Character c = itr.next();
			CountIndex in = map.get(c);
			int index = in.getIndex();
			//System.out.println("The index is "+index);
			if ((in.getCount() == 1 ) && (index < result))
				result = index;
		}
		if (result == Integer.MAX_VALUE)
			return null;
		else
		return args.charAt(result);
		
	}
	public static void main(String[] args) {
		String ks = "dlzdrazarb";
		System.out.println(FirstNonRepeatingOptimized.firstNonRepeating(ks));
		
	}

}

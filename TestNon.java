import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//An efficient algorithm to find the first non-repeatable character 
//in a string, use NashMap, better use LinkedHashMap to preserve the order


public class TestNon {
	static Character nonRepeat(String str){
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for (int i=0; i < str.length();i++){
			Character ch = str.charAt(i);
			if (map.containsKey(ch)){
				int val = map.get(ch);
				map.put(ch, val+1);
			} else
				map.put(ch, 1);
		}
		System.out.println(map);
		
		Iterator iter = map.entrySet().iterator();
		Character c= null;
		while (iter.hasNext()){
			Map.Entry<Character, Integer> entry = (Entry<Character, Integer>) iter.next();
		   System.out.print(entry.getKey());
		   System.out.print(entry.getValue()+" ");
		   if (entry.getValue()== 1){
			   c = entry.getKey();
			   break;
		   }
		
		}
		return c;
		
		
	}
	public static void main(String[] args) {
		char d=TestNon.nonRepeat("afghagfebhcda");
		System.out.println();
		System.out.println(d);
		
	}

}

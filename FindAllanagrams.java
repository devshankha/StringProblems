
//Group all anagrams in an array of strings

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllanagrams {
	
	public static List<List<String>> findAnagrams(String[] s) {
		
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		List<List<String>> groupedAnagrams = new ArrayList<List<String>>();
		
		for (String a:s) {
			char[] arr = a.toCharArray();
			Arrays.sort(arr);
			String sorted = new String(arr);
			if (!map.containsKey(sorted)) {
				List<String> l1 = new ArrayList<String>();				
				l1.add(a);
				map.put(sorted, l1);
			} else
				map.get(sorted).add(a);
			
		}
		//System.out.println(map);
		groupedAnagrams.addAll(map.values());
		System.out.println(groupedAnagrams);
		return groupedAnagrams;
		
	}
	
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		findAnagrams(strs);
		
	}

}

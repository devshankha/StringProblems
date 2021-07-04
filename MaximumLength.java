
/** 1239. Maximum Length of a Concatenated String with Unique Characters
Medium

1032

95

Add to List

Share
Given an array of strings arr. String s is a concatenation of a sub-sequence of arr which have unique characters.

Return the maximum possible length of s.

*/

//the solution is taken from here ==https://www.youtube.com/watch?v=pD3cHFNyW2I&t=68s
//it uses kind of DFS and backtracing
//Intuition behind solution: Generate all possible concatenations of the strings and for each one check if it has
//unique characters. If it has unique characters and is longer than a previously found answer, update your answer.

import java.util.ArrayList;
import java.util.List;

//This is a very simple problem
public class MaximumLength {
	
	public static int uniqueCharacterCount(String s) {
		int[] count = new int[26];
		for (char c : s.toCharArray()) {
			if (count[c - 'a']++ > 0) {
				return -1;

			}

		}
		return s.length();

	}

	static public void maxUnique(List<String> arr, int index, String current, int[] result) {

		if (index == arr.size() && uniqueCharacterCount(current) > result[0]) {
			result[0] = current.length();
			return;
		}

		if (index == arr.size()) {
			return;
		}

		maxUnique(arr, index + 1, current, result);
		maxUnique(arr, index + 1, current + arr.get(index), result);

	}
	
	static public int maxLength(List<String> arr) {
		int[] result= new int[1];
		maxUnique(arr, 0, "", result);
		return result[0];
		
	}
	
	
	
	
	


	public static void main(String[] args) {
		
		//arr = ["cha","r","act","ers"]
				
				List<String> l1 = new ArrayList<String>();
				l1.add("cha");
				l1.add("r");
				l1.add("act");
				l1.add("ers");
				System.out.println(maxLength(l1));
		

	}
}

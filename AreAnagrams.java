
public class AreAnagrams {
	static boolean areAnagrams(String s1,String s2){
		if (s1.length() != s2.length())
			return false;
		int val = 0;
		for (int i=0; i < s1.length();i++){
			val = val ^ (int)s1.charAt(i);
			val = val ^ (int)s2.charAt(i); 
			//looks like this should also work
			val = val^ s1.charAt(i)^s2.charAt(i);
		}
		return val == 0;
	}
	
	// another solution to the problem
	//convert the strings into character arrays
	//sort them and compare the two arrays
	
	static boolean areAnagranms(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		for (int i=0; i < a.length;i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(areAnagrams("Kamal","mKlaa"));
		System.out.println(areAnagrams("Kamal1","mKlaa"));
		
	}

}


public class AreAnagrams {
	static boolean areAnagrams(String s1,String s2){
		if (s1.length() != s2.length())
			return false;
		int val = 0;
		for (int i=0; i < s1.length();i++){
			val = val ^ (int)s1.charAt(i);
			val = val ^ (int)s2.charAt(i); 
		}
		return val == 0;
	}
	
	public static void main(String[] args) {
		System.out.println(areAnagrams("Kamal","mKlaa"));
		System.out.println(areAnagrams("Kamal1","mKlaa"));
		
	}

}

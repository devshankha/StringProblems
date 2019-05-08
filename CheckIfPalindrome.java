import java.util.Arrays;

public class CheckIfPalindrome {
	//This program checks if characters of given string can be arranged
	//to form a palindrome
	static boolean canFormPalindrome(String str) { 
		
		 int a[] = new int[26];
			for (int i = 0; i < str.length(); i++) {
				//System.out.println((int)'b');
				int index = str.charAt(i) - 'a';
				a[index]++;
			}
		
		 System.out.println(Arrays.toString(a));
		 int s = (int)'a';
		 System.out.println(s);
		  int odd = 0; 
		    for (int i = 0; i < 26; i++)  
		    { 
		    if ((a[i] & 1) == 1) 
		        odd++; 
		  
		    if (odd > 1) 
		        return false; 
		    } 
		 return true;
	}
	public static void main(String[] args) {
		boolean ls =CheckIfPalindrome.canFormPalindrome("level");
		System.out.println(ls);
		
	}

}

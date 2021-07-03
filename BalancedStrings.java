

/** 1221. Split a String in Balanced Strings
Easy

1217

644

Add to List

Share
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it in the maximum amount of balanced strings.

Return the maximum amount of split balanced strings.

 

Example 1:

Input: s = "RLRRLLRLRL"
Output: 4 **/

//This is a very simple problem
public class BalancedStrings {
	
	public int balancedStringSplitS(String s) {
        char[] ar = s.toCharArray();
        int check = 0;
        int count = 0;
        for(int i = 0; i < ar.length; i++) {
            if(ar[i] == 'R') {
                check++;
            }else if(ar[i] == 'L'){
                check--;
            }
            if(check == 0) {
                count++;
            }
        }
        return count;
    }

	public static int balancedStringSplit(String s) {
		int numberL = 0;
		int numberR = 0;
		int num = 0;

		for (int i = 0; i < s.length();i++) {

			if (s.charAt(i) == 'L')
				numberL++;
			else
				numberR++;
			if (numberL == numberR) {
				num = num + 1;
				numberL = 0;
				numberR = 0;

			}

		}

		return num;

	}

	public static void main(String[] args) {
		System.out.println(balancedStringSplit("RLRRLLRLRL"));

	}
}

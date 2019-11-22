
public class NaivePatternSearch {
	/* the below method is taken from geekforgeeks
	 * 
	 */
	public static void search(String txt, String pat) 
    { 
        int M = pat.length(); 
        int N = txt.length(); 
  
        /* A loop to slide pat one by one */
        for (int i = 0; i <= N - M; i++) { 
  
            int j; 
  
            /* For current index i, check for pattern  
              match */
            for (j = 0; j < M; j++) 
                if (txt.charAt(i + j) != pat.charAt(j)) 
                    break; 
  
            if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1] 
                System.out.println("Pattern found at index " + i); 
        } 
    }
	/* the below method is my own implementation of
	 * the same logic
	 * 
	 */

	public static void searchMyOwn(String value, String pat) {
		int valueLength = value.length();
		int patternLength = pat.length();
		int startIndex = 0;
		while (startIndex < valueLength) {
			int indexX = startIndex;
			int indexY = 0;
			//System.out.println("Printing startIndex "+startIndex);
			for (int i = indexX; i < valueLength; i++) {
				if (value.charAt(indexX) == pat.charAt(indexY)) {
					indexX++;
					indexY++;
				} else {
					//indexX++;
					break;
				}
				if (indexY == patternLength) {
					System.out.println("Index found at " + startIndex);
					break;
				}

			}
			startIndex++;

		}
		
	}
  
	public static void main(String[] args) {
		String a1 = "cgkwnaertynad";
		String a2 = "na";
		NaivePatternSearch.searchMyOwn(a1, a2);
	}

}

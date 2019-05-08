
public class ReverseString {
	static String reverse(String s) {
		StringBuilder l = new StringBuilder();
		int i = s.length();
		for (int j=(i-1); j>=0;j--) {
			l.append(s.charAt(j));
		}
		return new String(l);
	}
	public static void main(String[] args) {
		System.out.println(ReverseString.reverse("good"));
		
	}

}

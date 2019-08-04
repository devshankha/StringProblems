
public class Duplicate {
	//find if all characters are unique in a string without using any datastructure
	//excellent use of bitvector
	static boolean isUnique(String s1) {
		if (s1 == null)
			return true;
		long checker = 0;
		int len = s1.length();
		for (int i=0; i < len;i++) {
			int index = s1.charAt(i)-'A';
			System.out.println("Printing the index value "+index);
			if ((checker & (1<< index)) > 0)
				return false;
			checker = checker | (1<< index);

		}
		return true;
	}
	
	
	public static void main(String[] args) {
		//Anagram.isUnique("DadD");
		System.out.println(Duplicate.isUnique("DadjDkl"));
		int a1 = 'a';
		System.out.println(a1);
		a1 = 'A';
		System.out.println(a1);
		int a = 1<< 1;
		System.out.println(a);
		
		
	} 

}

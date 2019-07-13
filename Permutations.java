import java.util.*;

public class Permutations {
	public static void main(String[] args) {
		String word = "de";
		List<Integer> indices = new ArrayList<Integer>();
		List<String> permutations = Permutations.getPermutations(word, indices);
		System.out.println(permutations);

	}

	public static List<String> getPermutations(String word, List<Integer> indices) {
		int length = word.length();
		List<String> toReturn = new ArrayList<String>();
		if (indices.size() == length) {
			toReturn.add("");
			return toReturn;
		}
		// Iterate over each character to find permutation
		for (int i = 0; i < length; i++) {
			// skip if index is already considered
			if (indices.contains(i))
				continue;

			// Create and populate a duplicare arraylist of indices that have already
			// been populated
			List<Integer> newIndices = new ArrayList<Integer>();
			for (int index : indices)
				newIndices.add(index);
			// Add current index
			newIndices.add(i);

			// Calculate the permutations
			List<String> permutations = Permutations.getPermutations(word, newIndices);
			for (String str : permutations)
				toReturn.add(word.charAt(i) + str);

		}
		return toReturn;

	}
}

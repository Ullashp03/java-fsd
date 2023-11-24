package practice_proj1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class subsequence {

	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(50);
		}

		List<Integer> longestIncreasingSubsequence = findLongestIncreasingSubsequence(numbers);
		System.out.println("Longest increasing subsequence: " + longestIncreasingSubsequence);
	}

	private static List<Integer> findLongestIncreasingSubsequence(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return new ArrayList<>();
		}

		int[] length = new int[numbers.length];
		int[] previous = new int[numbers.length];

		length[0] = 1;
		previous[0] = -1;

		int maxLengthIndex = 0;

		for (int i = 1; i < numbers.length; i++) {
			length[i] = 1;
			previous[i] = -1;

			for (int j = 0; j < i; j++) {
				if (numbers[i] > numbers[j] && length[i] < length[j] + 1) {
					length[i] = length[j] + 1;
					previous[i] = j;
				}
			}

			if (length[i] > length[maxLengthIndex]) {
				maxLengthIndex = i;
			}
		}

		List<Integer> longestIncreasingSubsequence = new ArrayList<>();
		for (int i = maxLengthIndex; i >= 0; i = previous[i]) {
			longestIncreasingSubsequence.add(0, numbers[i]);
		}

		return longestIncreasingSubsequence;
	}
}
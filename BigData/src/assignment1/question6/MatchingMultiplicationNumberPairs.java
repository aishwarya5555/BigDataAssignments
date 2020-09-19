package assignment1.question6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MatchingMultiplicationNumberPairs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Integers");
		int noOfIntegers = scanner.nextInt();

		int[] intArray = new int[noOfIntegers];
		System.out.println("Enter Integers");
		for (int i = 0; i < noOfIntegers; i++) {
			intArray[i] = scanner.nextInt();
		}

		Map<String, Integer> pairs = new HashMap<String, Integer>();
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				pairs.put("(" + intArray[i] + "," + intArray[j] + ")", intArray[i] * intArray[j]);
			}
		}

		Map<Integer, Set<String>> pairList = new HashMap<Integer, Set<String>>();
		for (Map.Entry<String, Integer> entry : pairs.entrySet()) {
			Integer value = entry.getValue();
			for (Map.Entry<String, Integer> serachEntry : pairs.entrySet()) {
				if (value == serachEntry.getValue() && !entry.getKey().equals(serachEntry.getKey())) {
					if (pairList.get(value) == null) {
						pairList.put(value, new HashSet<String>());
					}
					pairList.get(value).add(serachEntry.getKey());
				}
			}
		}
		boolean isPairFound = false;
		for (Map.Entry<Integer, Set<String>> entry : pairList.entrySet()) {
			Set<String> value = entry.getValue();
			if (!value.isEmpty()) {
				isPairFound = true;
				System.out.println(value.toString());
			}
		}
		if (!isPairFound) {
			System.out.println("No Pair Found!!");
		}

		scanner.close();
	}

}

package assignment1.question5;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Strings");
		int noOfIntegers = scanner.nextInt();

		String[] strArray = new String[noOfIntegers];
		System.out.println("Enter Strings");
		for (int i = 0; i < noOfIntegers; i++) {
			strArray[i] = scanner.next();
		}

		sort(strArray, 0, strArray.length - 1);

		System.out.println("Sorted Array");
		printArray(strArray);

		scanner.close();
	}

	private static void sort(String arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	private static int partition(String arr[], int low, int high) {
		String pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j].length() < pivot.length()) {
				i++;
				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		String temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	private static void printArray(String arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

}

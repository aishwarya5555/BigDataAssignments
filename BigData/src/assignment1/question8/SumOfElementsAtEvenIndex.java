package assignment1.question8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SumOfElementsAtEvenIndex {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Integers");
		int noOfIntegers = scanner.nextInt();
		
		List<Integer> list = new ArrayList<Integer>(noOfIntegers);
		System.out.println("Enter Integers");
		for (int i = 0; i < noOfIntegers; i++) {
			list.add(scanner.nextInt());
		}

		int j = 0;
		int sum = 0;
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int value = iterator.next();
			if (j % 2 == 0) {
				sum += value;
			}
			j++;
		}

		System.out.print("Sum Of elements at even index is " + sum);
		scanner.close();
	}
}

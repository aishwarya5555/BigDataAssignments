package assignment1.question7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfIntegers = 6;

		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter Integers");
		for (int i = 0; i < noOfIntegers; i++) {
			list.add(scanner.nextInt());
		}
		
		//Print the 3rd element from the beginning
		System.out.println("Third element from beginning::" + list.get(2));
		
		//Replace the 5th element from the beginning with integer 8
		list.remove(4);
		list.add(4, 8);
		
		// Print the 5th element from the beginning
		System.out.println("Fifth element from beginning::" + list.get(4));
		
		//Print the index of the element 56
		System.out.println("index of the element 56::" + list.indexOf(56));
		
		//Add the element 44 at index 2
		list.add(1, 44);
		
		//Print the 5th element from the beginning
		System.out.println("Fifth element from beginning::" + list.get(4));
		
		//Remove the element at index 1
		list.remove(0);
		
		//Print the index of the element 9
		System.out.println("index of the element 9::" + list.indexOf(9));
		
		scanner.close();
	}

}

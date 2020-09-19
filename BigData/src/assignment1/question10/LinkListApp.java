package assignment1.question10;

import java.util.Scanner;

public class LinkListApp {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter nos of integers in the linked list");
		int	noOfIntegers = scanner.nextInt();
		
		System.out.println("Enter integers");
		LinkedList list = new LinkedList();
		
		for (int i = 0; i < noOfIntegers; i++) {
			list.insert(scanner.nextInt());
		}
		
		list.replaceLastNode();
		list.traverse();
		scanner.close();
	}
}

package assignment1.question9;

import java.util.Scanner;

public class LinkListApp {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter nos of Strings in the linked list");
		int	noOfStrings = scanner.nextInt();
		
		System.out.println("Enter Strings");
		LinkedList list = new LinkedList();
		
		for (int i = 0; i <= noOfStrings; i++) {
			list.insert(scanner.nextLine());
		}
		
		list.removeDuplicate();
		list.traverse();
		scanner.close();
	}
}

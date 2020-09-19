package assignment1.question2;

import java.util.Scanner;

public class TreeApp {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int noOfEmplyees = 0;

		do {
			System.out.println("Enter no of employees in range 0 < no of employee < 100");
			noOfEmplyees = scanner.nextInt();
		} while (noOfEmplyees < 1 || noOfEmplyees >= 100);

		System.out.println("Enter employee id,  for whom immediate reporting manager need to find.");
		int employeeId = scanner.nextInt();

		System.out.println("Enter employee ids ::");

		Tree tree = new Tree();
		for (int i = 0; i < noOfEmplyees; i++) {
			int value = scanner.nextInt();
			tree.insert(value);
		}

		Node result = tree.search(employeeId);
		if (result == null) {
			System.out.println("Employee Not Found for empId=" + employeeId);
		} else {
			System.out.println("Immediate reporting manager empId=" + result.data);
		}
		scanner.close();
	}
}

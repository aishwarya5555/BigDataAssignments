package assignment1.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyTreeMapSolution2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of managers and no of subordinates");
		int noOfManagers = scanner.nextInt();
		int noOfSubordinates = scanner.nextInt();
		Map<String, List<Subordinate>> company = new TreeMap<String, List<Subordinate>>();
		
		System.out.println("Enter name of manager");
		for(int i = 0; i < noOfManagers; i++) {
			String managerName = scanner.next();
			company.put(managerName, new ArrayList<Subordinate>());
		}
		
		System.out.println("Enter name of manager, subordinate and age of subordinate");
		for(int i = 0; i < noOfSubordinates; i++) {
			String managerName = scanner.next();
			String subordinateName = scanner.next();
			int age = scanner.nextInt();
			company.get(managerName).add(new Subordinate(subordinateName, age));
		}
		
		company.entrySet().stream().forEach(manager -> {
			System.out.println(manager.getKey());
			//sort subordinates
			Collections.sort(manager.getValue());
			System.out.println(manager.getValue());
		});
		
		scanner.close();
	}
}

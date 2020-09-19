package assignment1.question4;

import static java.lang.String.format;
import static java.util.stream.Collectors.toList;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CompanyApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of managers and no of subordinates");
		int noOfManagers = scanner.nextInt();
		int noOfSubordinates = scanner.nextInt();
		Map<String, Manager> company = new HashMap<String, Manager>();
		
		System.out.println("Enter name of manager");
		for(int i = 0; i < noOfManagers; i++) {
			String managerName = scanner.next();
			company.put(managerName, new Manager(managerName));
		}
		System.out.println("Enter name of manager, subordinate and age of subordinate");
		for(int i = 0; i < noOfSubordinates; i++) {
			String managerName = scanner.next();
			String subordinateName = scanner.next();
			int age = scanner.nextInt();
			Manager manager = company.get(managerName);
			if(manager == null) {
				System.out.println(format("Manager of name=%s not found", managerName));
			} else {
				manager.getSubordinates().add(new Subordinate(subordinateName, age));
			}
		}
		List<Manager> collect = company.values().stream().collect(toList());
		//sort manager
		Collections.sort(collect);
		collect.stream().forEach(manager -> {
			System.out.println(manager);
			//sort subordinates
			Collections.sort(manager.getSubordinates());
			System.out.println(manager.getSubordinates());
		});
		scanner.close();
	}

}

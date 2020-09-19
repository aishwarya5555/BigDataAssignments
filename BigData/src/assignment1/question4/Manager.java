package assignment1.question4;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Comparable<Manager> {
	private String name;
	private List<Subordinate> subordinates = new ArrayList<Subordinate>();
	
	public Manager(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subordinate> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(List<Subordinate> subordinates) {
		this.subordinates = subordinates;
	}

	@Override
	public int compareTo(Manager o) {
		char[] str1 = this.getName().toCharArray();
		char[] str2 = o.getName().toCharArray();
		int len1 = str1.length;
		int len2 = str2.length;
		for (int i = 1; i <= len1 && i <= len2; i++) {
			int ascii1 = (int) str1[i];
			int ascii2 = (int) str2[i];
			if (ascii1 < ascii2) {
				return -1;
			} else if (ascii1 > ascii2) {
				return 1;
			}

			if (i == len1) {
				return -1;
			}
			if (i == len2) {
				return 1;
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return name;
	}

}

package assignment1.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchingSubString {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Enter first string");
		String firstStrArray = scanner.next();
		System.out.println("Enter second string");
		String secondStrArray = scanner.next();
		
		//find possible substring combinations
		List<String> firstStrSubStrCombi = new ArrayList<String>();
		for(int i = 0; i < firstStrArray.length(); i++) {
			for(int j = i + 1; j <= firstStrArray.length(); j++) {
				firstStrSubStrCombi.add(firstStrArray.substring(i, j));
			}
		}
		
		List<String> secondStrSubStrCombi = new ArrayList<String>();
		for(int i = 0; i < secondStrArray.length(); i++) {
			for(int j = i + 1; j <= secondStrArray.length(); j++) {
				secondStrSubStrCombi.add(secondStrArray.substring(i, j));
			}
		}
		
		List<String> firstCombi = new ArrayList<String>();
		for(String searchStr : firstStrSubStrCombi) {
			firstCombi.add(firstStrArray.replace(searchStr, ""));
		}
		
		List<String> secCombi = new ArrayList<String>();
		for(String searchStr : secondStrSubStrCombi) {
			secCombi.add(secondStrArray.replace(searchStr, ""));
		}
		
		String maxLenMatchingStr = "";
		for(String searchStr : firstCombi) {
			if(secCombi.contains(searchStr) && searchStr.length() > maxLenMatchingStr.length() ) {
				maxLenMatchingStr = searchStr;
			}
		}
		
		System.out.println("String=" + maxLenMatchingStr + " with lenght=" + maxLenMatchingStr.length());
		scanner.close();
	}
}

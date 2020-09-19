package assignment1.question1;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
		System.out.println("Enter no of elements of first array");
		int sizeOfFirstArray = scanner.nextInt();
		System.out.println("Enter no of elements of second array");
		int sizeOfSecondArray  = scanner.nextInt();
	  	    	   
	    int[] firstArray = new int[sizeOfFirstArray];
	    System.out.println("Enter firstArray");
		for (int i = 0; i < sizeOfFirstArray; i++) {
			firstArray[i] = scanner.nextInt();
		}
	    int[] secondArray = new int[sizeOfSecondArray];
	    System.out.println("Enter secondArray");
		for (int i = 0; i < sizeOfSecondArray; i++) {
			secondArray[i] = scanner.nextInt();
		}
	    
	    int[] mergedArray = new int[sizeOfFirstArray + sizeOfSecondArray];
	    int k = 0, i = sizeOfFirstArray - 1, j = sizeOfSecondArray - 1;
	    for(; i >= 0 &&  j >= 0;) {
	    	if(firstArray[i] >= secondArray[j]) {
    			mergedArray[k++] = firstArray[i--] ;
    		} else {
    			mergedArray[k++] = secondArray[j--];
    		}
	    }
	    
	   while (i >= 0) {
		   mergedArray[k++] = firstArray[i--] ;
	   }
	   
	   while (j >= 0) {
		   mergedArray[k++] = secondArray[j--];
	   }
	    
	   System.out.println("Merged array elements in descending order");
	   for(int p = 0; p < mergedArray.length; p++) {
		   System.out.println(mergedArray[p]);
	   }
	   
	   scanner.close();
	}

}

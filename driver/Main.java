package com.greatlearning.driver;

import java.util.Scanner;
import com.greatlearning.services.*;

public class Main {
	
	static int getUserInput(Scanner sc) {
		int input = sc.nextInt();
		return input;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size of Transaction array:");
	    int size = getUserInput(sc);
	    int arr[] = new int[size];
	    System.out.println("Enter value of Transaction");
	    for (int i=0; i< size;i++) {
	    	arr[i] = getUserInput(sc);
	    }
	    
	    System.out.println("cumulative transaction array");
	    int[] cs= new int[size];
	    cs[0]=arr[0];
	    for (int i=1; i< size;i++) {
	    	cs[i] = cs[i-1] + arr[i];
	    }
	    for(int a: cs)
	    System.out.print(a + " ");
	    
	    System.out.println("\nEnter no of target to be achieved");
	    int targetNo= getUserInput(sc);
	    TransactionServiceImpl txnServive = new TransactionServiceImpl();
	    while (targetNo-- != 0) {
	    	System.out.println("Enter the value of target:");
	    	int targetValue = getUserInput(sc);
	    	txnServive.search(arr,targetValue);
	    	txnServive.search2(arr,targetValue);
	    	txnServive.search3(cs,targetValue);
	    }
  	}
}

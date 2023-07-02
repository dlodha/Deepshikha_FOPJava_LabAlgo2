package com.greatlearning.driver;

import java.util.Scanner;
import com.greatlearning.services.*;

public class Driver {

	static int getUserInput(Scanner sc) {
		int input = sc.nextInt();
		return input;
	}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size of currency denomination:");
	        int size = getUserInput(sc);
	        
	        System.out.println("Enter value of currency denomination:");
	        int currency[] = new int[size];
	        for (int i=0;i< size;i++) {
	        	currency[i] = getUserInput(sc);
	        }
	        BubbleSortImpl bubbleSort =new BubbleSortImpl();
	        bubbleSort.sort(currency);
	       System.out.println("Sorted currency denomination in Main:");
	 	   for (int a : currency)
	 		   System.out.print(a + " ");
	        System.out.println("\n Enter amount to pay:");
	        int amount = getUserInput(sc);
	        NotesCount notesCount=new NotesCount();
	        notesCount.notesCountImpl(currency, amount);
	}
}


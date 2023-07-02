package com.greatlearning.services;

public class TransactionServiceImpl {
  
	public void search(int arr[],int targetVal) {
		System.out.println("Solution 1");
		int i = 0;
		int flag =0;
		while(targetVal > 0 && i < arr.length) {
			targetVal =  targetVal - arr[i];
			i++;
		}
		if(targetVal > 0) {
			System.out.println("no of target transaction not achieved");
		}else {
		System.out.println("no of target transaction is: " + i);
		}
	}
	
	public void search2(int arr[],int targetVal) {
		System.out.println("Solution 2");
		int flag =0; int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			if(sum >= targetVal) {
				System.out.println("no of target transaction is: " + (i+1));
				flag =1;
				break;
			}
		}
		
		if(flag ==0) {
			System.out.println("no of target transaction not achieved");
		}
	}
	
public void search3(int cs[],int targetVal) {
	System.out.println("Solution 3 using cumulative array");
		int flag =0; int sum=0;
		for(int i=0;i<cs.length;i++) {
			if(cs[i] >= targetVal) {
				System.out.println("no of target transaction is: " + (i+1));
				flag =1;
				break;
			}
		}
		
		if(flag ==0) {
			System.out.println("no of target transaction not achieved");
		}
	}
}

package com.greatlearning.services;

public class BubbleSortImpl {
   public void sort(int[] arr) {
	   int temp =0;
	   for (int i=0; i< arr.length;i++ ) {
		   for (int j=i+1; j < arr.length;j++ ) {
			   if (arr[j] > arr[i]) {
				   temp=arr[j];
				   arr[j]=arr[i];
				   arr[i]=temp;
			   }
		   }
	   }
   }
}

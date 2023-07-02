package com.greatlearning.services;

public class NotesCount {
   public void notesCountImpl(int[] currency, int amount) {
	   int noteCounter[] = new int[currency.length];
	   try {
	   for(int i=0;i< currency.length;i++) {
		   if (amount >= currency[i]) {
		    noteCounter[i] = amount/currency[i];
		    amount= amount- (currency[i]*noteCounter[i]);
		   } else {
			   noteCounter[i] =0;
		   }
	   }
	   
	   if(amount > 0) {
		   System.out.println("Cannot pay with higher denomination");
	   } else {
		   for (int i=0; i<currency.length ;i++) {
			   if(noteCounter[i] !=0 )
			   System.out.println(currency[i] +":"+ noteCounter[i]);			   
		   }
	   }
	   } catch (ArithmeticException e) {
		   e.printStackTrace();
	   }
	   
   }
}

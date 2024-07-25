package com.tnsif.dayten;

public class ArraysOperation {
     public static int[] oddEven(int[] array) {
    	 int evencount=0;
    	 int oddcount=0;
    	 for(int i=0;i<array.length;i++) {
    		 if(array[i]%2==0) {
    			 evencount++;
    		 }
    		 else {
    			 oddcount++;
    		 }
    	 }
    	 return new int[] {evencount,oddcount};
     }
}

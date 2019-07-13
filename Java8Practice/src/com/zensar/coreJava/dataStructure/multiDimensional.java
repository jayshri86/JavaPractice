package com.zensar.coreJava.dataStructure;

public class multiDimensional {
	
	public static void main(String args[]) 
    { 
		printMatrix();
		arrayCloning();
	
	
    }
	
	private static void printMatrix() {
		 // declaring and initializing 2D array 
	    int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
	    
	    for(int i=0; i<3; i++) {
	    	 for(int j=0; j<3; j++) {
	    		 System.out.print(arr[i][j] + " ");
	    	 }
	    	 System.out.println();
	    }
	}
	
	private static void arrayCloning() {
		 int intArray[] = {1,2,3}; 
         
	        int cloneArray[] = intArray.clone(); 
	          
	        // will print false as deep copy is created 
	        // for one-dimensional array 
	        System.out.println(intArray == cloneArray); 
	          
	        for (int i = 0; i < cloneArray.length; i++) { 
	            System.out.print(cloneArray[i]+" "); 
	        } 
	    } 
	

}

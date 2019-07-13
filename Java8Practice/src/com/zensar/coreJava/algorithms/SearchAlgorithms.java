package com.zensar.coreJava.algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SearchAlgorithms {

	public static void main(String[] args) {
		Integer[] personAge = { 1,2,3,4,5,6,7,8,9,10 };
		//linearSearch();
		binarySearch(personAge, 0);
	}

	public static void linearSearch() {
		Integer[] empAge = new Integer[10];
		Integer[] personAge = { 2, 1, 3, 10, 5, 7, 8 };
		String[] strArray = {"a","b","c","d"};
	
		// find person havong age 7
		for (Integer integer : personAge) {
			if (integer == 7)
				System.out.println("ForEach = " + integer);
		}
		Arrays.stream(personAge).forEach(n -> {
			if (n == 7)
				System.out.println("Lamda = " + n);
		});
		IntStream.range(0, personAge.length)
				 .mapToObj(index -> String.format("%d -> %s", index, personAge[index]))
				 .forEach(System.out::println);
	}
	
	public static void binarySearch(Integer[] ageArray, int midIndex) {
		//Integer[] personAge = { 1,2,3,4,5,6,7,8,8,9,10 };
		int findNum = 7;
		int mid = (ageArray.length/2);
		System.out.println("mid = " + mid);
		
		Integer[] half;
		int index = midIndex + mid;
		if(findNum < ageArray[mid]) {
			half = new Integer[mid];
			int j=0;
			for (int i = 1; i < mid; i++) {
				half[j] = ageArray[i];
				j++;
			}
			binarySearch(half, index);
		}else if (findNum > ageArray[mid]) {
			//index = index + mid+1;
			half = new Integer[mid-1];
			int j=0;
			for (int i = mid+1; i < ageArray.length; i++) {
				
				half[j] = ageArray[i];
				j++;
				
			}
			//index = mid + midIndex;
			binarySearch(half, index);
			
		}else {
			
			System.out.println("Missing number 7 is at index = " + index);
		}
		
		
		
	}
	
}

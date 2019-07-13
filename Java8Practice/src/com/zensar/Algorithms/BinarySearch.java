package com.zensar.Algorithms;

public class BinarySearch {
	public static void main(String[] args) {
		int[] personAge = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		// linearSearch();
		int index = binarySearchRecursive(9, personAge, 0, personAge.length);
		System.out.println("Num at index = " + index);
	}

	public static int binarySearchRecursive(int search, int[] array, int start, int end) {

		int middle = (start + end) / 2;

		if (end < start) {
			return -1;
		}

		if (search < array[middle]) {
			return binarySearchRecursive(search, array, start, middle - 1);
		}

		if (search > array[middle]) {
			return binarySearchRecursive(search, array, middle + 1, end);
		}

		if (search == array[middle]) {
			return middle;
		}

		return -1;
	}

	public static int binarySearch(int search, int[] array) {

		int start = 0;
		int end = array.length - 1;

		while (start <= end) {

			int middle = (start + end) / 2;

			if (search < array[middle]) {
				end = middle - 1;
			}

			if (search > array[middle]) {
				start = middle + 1;
			}

			if (search == array[middle]) {
				return middle;
			}
		}
		return -1;

	}

}

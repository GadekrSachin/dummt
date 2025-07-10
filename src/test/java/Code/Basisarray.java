package Code;

import java.util.Arrays;

public class Basisarray {

	public static void main(String[] args) {

	}



	public static void duplicate() {
		int[] arr1 = { 5, 8, 2, 10, 3, 102, 3, 10 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					System.out.println(arr1[j]);
				}
			}
		}

	}

	public static void merge_array() {

		int[] arr1 = { 5, 8, 2, 10, 3, 102 };
		int[] arr2 = { 15, 18, 12, 10, 13, 102 };

		int[] arr3 = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length - i] = arr2[i];
		}
		System.out.println(Arrays.toString(arr3));

	}

	public static void reverse_array() {
		int[] arr = { 5, 8, 2, 10, 3, 102 };
		int[] arr2 = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[arr.length - i - 1] = arr[i];

		}
		System.out.println(Arrays.toString(arr2));

	}

	public static void maximum_num() {
		int[] arr = { 5, 8, 2, 10, 3, 102 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}

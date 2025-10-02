package Code;

import java.util.Arrays;

public class Basisarray {

	public static void main(String[] args) {
		second_small();
	}

	public static void same_element() {
		int[] a = { 10, 20, 30, 40, 50 };

		int[] b = { 100, 200, 300, 40, 50, 10 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

	public static void num_Of_alphabet() {
		String name = "Java123@2025";
		int alpha = 0;
		int num = 0;
		int spe = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (Character.isAlphabetic(ch)) {
				alpha++;
			} else if (Character.isDigit(ch)) {
				num++;
			} else {
				spe++;
			}
		}

		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spe);
	}

	public static void second_small() {
		int[] aa = { 12, 5, 8, 1, 19 };
		int[] b = new int[aa.length];

		for (int i = 0; i < aa.length; i++) {
			int count = 0;
			for (int j = 0; j < aa.length; j++) {
				if (aa[i] > aa[j]) {
					count++;
				}
			}
			b[count] = aa[i];
		}
		System.out.println(b[1]);

	}

	public static void count() {

		int[] num = { 0, -10, 20, 60, -70, -80, };
		int pocount = 0;
		int negcount = 0;
		int nucount = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > 0) {
				pocount++;
			} else if (num[i] < 0) {
				negcount++;
			} else {
				nucount++;
			}
		}

		System.out.println("positive value :" + pocount);
		System.out.println("negetive value :" + negcount);
		System.out.println("nutral value :" + nucount);

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
			arr3[arr1.length + i] = arr2[i];
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

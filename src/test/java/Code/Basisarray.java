package Code;

public class Basisarray {

	public static void main(String[] args) {
		maximum_num();
	}
	
	

	public static void maximum_num() {
		int[] arr = { 5, 8, 2, 10, 3,102};

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}

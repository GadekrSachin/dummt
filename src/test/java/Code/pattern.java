package Code;

public class pattern {

	public static void main(String[] args) {
		pattern2();
	}

	public static void pattern2() {

		for (int i = 5; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern1() {

		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

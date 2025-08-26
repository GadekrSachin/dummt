package Code;

public class numerical {

	public static void main(String[] args) {
		prime();
	}



	public static void prime() {

		for (int i = 2; i <= 100; i++) {
			boolean isprime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				System.out.println(i);
			}
		}
	}

	public static void fabbonacci_NUmber() {

		int n1 = 0, n2 = 1, n3 = 0;

		for (int i = 2; i <= 8; i++) {
			System.out.println(n3);
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}

	public static void prime_Number() {

		int num = 18;
		int flag = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				flag++;
			}
		}
		if (flag == 2) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}
	}

	public static void even() {
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

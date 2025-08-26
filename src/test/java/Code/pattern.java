package Code;

import com.github.dockerjava.api.model.StatisticNetworksConfig;

public class pattern {

	public static void main(String[] args) {
		data();
	}
	public static void data () {

		int n1=0;
		int n2=1;
		int n3=0;

		for(int i=2; i<=10; i++) {
			System.out.println(n3);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
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
			System.out.println(  );
		}
	}




}




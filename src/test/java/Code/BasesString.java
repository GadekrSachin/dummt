package Code;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BasesString {

	public static void main(String[] args) {
		repeat_char();
	}

	public static void repeat_char() {

		String st = "sachomm";
		st = st.toLowerCase().replaceAll("\\$", "");
		Map<Character, Integer> cout = new LinkedHashMap<Character, Integer>();

		for (char ch : st.toCharArray()) {
			cout.put(ch, cout.getOrDefault(ch, 0) + 1);
		}

		cout.forEach((c, v) -> {

			if (v > 1) {
				System.out.println(c + ":" + v);
			}
		});

	}

	public static void reverse_string() {

		String st = "sachin";
		String str = "";

		for (int i = st.length() - 1; i >= 0; i--) {
			char ch = st.charAt(i);
			str = str + ch;
		}
		System.out.println(str);

	}

	public static void vowel_count() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");

		String str = sc.nextLine();
		int count = 0;
		str = str.toLowerCase();
		for (int j = 0; j <= str.length() - 1; j++) {

			char c = str.charAt(j);
			if (c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u') {
				count++;
			}
		}
		System.out.println(count);

		sc.close();
	}
}

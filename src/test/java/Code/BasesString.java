package Code;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BasesString {

	public static void main(String[] args) {

	}

	public void remove_duplicate_charecter() {
		String name = "aaabbcccdee";
		StringBuilder sb = new StringBuilder();
		sb.append(name.charAt(0));

		for (int i = 1; i < name.length(); i++) {

			if (name.charAt(i) != name.charAt(i - 1)) {
				sb.append(name.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

	public static void duplicate_in_string() {
		String name = "Java is fun and Java is powerful";

		String[] name2 = name.split(" ");
		boolean[] visited = new boolean[name.length()];

		for (int i = 0; i < name2.length; i++) {
			if (!visited[i]) {
				int count = 1;

				for (int j = i + 1; j < name2.length; j++) {
					if (name2[i].equalsIgnoreCase(name2[j])) {
						count++;
						visited[j] = true;
					}
				}
				if (count > 1) {
					System.out.println(name2[i]);
				}
			}
		}
	}

	public static void remove_space() {
		String str = "sachin gadekar tester";
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				builder.append(ch);
			}
		}
		System.out.println(builder.toString());
	}

	public static void reverse_words_in_sentence() {
//		Reverse Words in a Sentence
		String str = "Java is fun";
		String str2[] = str.split(" ");

		for (int i = str2.length - 1; i >= 0; i--) {
			System.out.println(str2[i]);
		}
	}

	public static void remove_int() {
		String str = "educa12t5i8on";
		str = str.toLowerCase();
		StringBuilder sBuilder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(ch > '0' && ch < '9')) {
				sBuilder.append(ch);
			}
		}
		System.out.println(sBuilder.toString());
	}

	public static void longest() {

		String str = "Java is super powerful";
		String str2[] = str.split(" ");
		String longeString = "";

		for (String word : str2) {
			if (word.length() > longeString.length()) {
				longeString = word;
			}
		}
		System.out.println(longeString);

	}

	public static void replace_with() {
		String str = "education";
		str = str.toLowerCase();
		StringBuilder sBuilder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				sBuilder.append('*');
			} else {
				sBuilder.append(ch);
			}
		}
		System.out.println(sBuilder.toString());

	}

	public static void count_int() {
		String rt = "Java123Code45";
		int count = 0;

		for (int i = 0; i < rt.length(); i++) {
			char ch = rt.charAt(i);
			if (ch >= '0' && ch <= '9') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void uppercount() {

		String str = "sachiIN";
		int lowr = 0;
		int upper = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else {
				lowr++;
			}
		}
		System.out.println("upper :" + upper);
		System.out.println("lowr :" + lowr);
	}

	public static void replace() {
		String string = "sachin_gadekar_pune";

		StringBuilder sB = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == '_') {
				sB.append(' ');
			} else {
				sB.append(ch);
			}
		}
		System.out.println(sB.toString());
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
		System.out.println(" Enter your string ");

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

package com.factory;

public class test {

	public static void main(String[] args) {

		String name = "Java@123Code";
		name = name.toLowerCase();
		int count = 0;
		int vowel = 0;
		int special = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (ch >= '0' && ch <= '9') {
				count++;
			} else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'e') {
				vowel++;
			} else if (!Character.isLetter(ch)) {
				special++;
			}

		}
		System.out.println(count);

		System.out.println(vowel);
		System.out.println(special);

	}
}

package CodingTest;

import java.util.Scanner;

public class palindrome {

	public static String IsPalindrome(String str) {
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] != array[array.length - i - 1]) {
				return "not a palindrome ";
			}
		}
		return "palindrome ";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1 = scanner.nextLine();

		System.out.println(IsPalindrome(str1));

	}

}

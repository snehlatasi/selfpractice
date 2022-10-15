package CodingTest;

import java.util.Scanner;

public class Roman {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = s.nextInt();
		System.out.print("Roman output: ");
		number = Math.min(3999, Math.max(1, number));
		System.out.print(CharToInt(number));
	}

	public static String CharToInt(int number) {
		String rCharToInt = "";

		String[] RN = { "I", "V", "X", "L", "C", "D", "M" };
		int i = 0;
		while (number > 0) {
			switch (number % 10) {
			case 1:
				rCharToInt = RN[i] + rCharToInt;
				break;
			case 2:
				rCharToInt = RN[i] + RN[i] + rCharToInt;
				break;
			case 3:
				rCharToInt = RN[i] + RN[i] + RN[i] + rCharToInt;
				break;
			case 4:
				rCharToInt = RN[i] + RN[i + 1] + rCharToInt;
				break;
			case 5:
				rCharToInt = RN[i + 1] + rCharToInt;
				break;
			case 6:
				rCharToInt = RN[i + 1] + RN[i] + rCharToInt;
				break;
			case 7:
				rCharToInt = RN[i + 1] + RN[i] + RN[i] + rCharToInt;
				break;
			case 8:
				rCharToInt = RN[i + 1] + RN[i] + RN[i] + RN[i] + rCharToInt;
				break;
			case 9:
				rCharToInt = RN[i] + RN[i + 2] + rCharToInt;
				break;
			}
			number = (int) number / 10;
			i += 2;
		}
		System.out.println(rCharToInt);
		return "";
	}
}

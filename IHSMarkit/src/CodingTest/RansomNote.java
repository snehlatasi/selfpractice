package CodingTest;

import java.util.Arrays;

public class RansomNote {

	public static boolean canConstruct(String note, String magazine) {

		if (note == null || note.length() == 0)
			return true;
		if (magazine == null || magazine.length() == 0)
			return false;
		boolean flag = false;
		boolean visited[] = new boolean[magazine.length()];
		Arrays.fill(visited, Boolean.FALSE);
		for (int i = 0; i < note.length(); i++) {
			flag = false;
			for (int j = 0; j < magazine.length(); j++) {
				if (note.charAt(i) == magazine.charAt(j) && !visited[j]) {
					visited[j] = true;
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(canConstruct("ceba", "abcde"));
		System.out.println(canConstruct("deaa", "abcde"));
		System.out.println(canConstruct("aacc", "bbccaa"));

	}

}

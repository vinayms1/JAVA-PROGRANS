package String;

import java.util.LinkedHashSet;

public class deleteDuplicate {

	public static void main(String[] args) {
		String s = "TYSS";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));

		}
		for (Character ch : set) {
			System.out.print(ch);

		}

	}
}
package String;

import java.util.HashSet;

public class numberOfLeterspresent {
	
	public static void main(String[] args) {
		
		String s = "TYSS";
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++; 
				}
			}
			System.out.println(ch + "==>" + count);
		}

	}
}

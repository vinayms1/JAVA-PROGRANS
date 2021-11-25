package String;

import java.util.LinkedHashSet;

public class printUniqueChar {
	public static void main(String[] args) {
		String s = "TYSSAADGE";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
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
			if(count==1) {
				System.out.print(ch);
			}
			
		}

	}

}

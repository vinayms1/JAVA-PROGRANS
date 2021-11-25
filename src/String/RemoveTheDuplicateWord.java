package String;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to tyss welcome to tyss welcome to tyss ";
		String str[] = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		for (String word : set) {
			System.out.print(word+" ");
		}

	}

}

package String;

public class maxLengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"hi","bye","hello","p","tyss","mango"};
		String max=s[0];
		for(int i=1;i<s.length;i++) {
			if(s[i].length()>max.length()) {
				max=s[i];
			}
		}
		
		for(int i=0;i<s.length;i++) {
			if(s[i].length()==max.length()) {
				System.out.println(s[i]);
			}
		}

	}

}

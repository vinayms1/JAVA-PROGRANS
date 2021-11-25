import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str =sc.next();
		String Org_str=str;
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		if(Org_str.equals(rev)) {
			System.out.println("the entered string is palindrome");
		}
		else {
			System.out.println("entered string is not a palindome");
		}
	}

}

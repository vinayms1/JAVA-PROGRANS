package practies;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2589, temp=n;
		int rev = 0;
		while (n != 0) {
			int r = n % 10;
			rev = rev*10 + r;
			n = n / 10;
		}
		if(rev==temp) {
			System.out.println("the given number is palindrome");
		}
		else {
			System.out.println("the given number is not palindrome");
		}
	}
}

package practies;

public class HappyNumber {
	public static void main(String[] args) {
		int n = 534568;
		while (n > 9) {
			int sum = 0;
			while (n != 0) {
				int rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			n = sum;
		}
		System.out.println(n);
		if (n == 1) {
			System.out.println("the given number is happy number");
		} else {
			System.out.println("the given number is not happy number");
		}
	}

}

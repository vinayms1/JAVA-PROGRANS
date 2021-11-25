import java.util.Scanner;

public class FizzAndBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener the number ");
		int num = sc.nextInt();
		if (num % 3 == 0 && num % 5 != 0) {
			System.out.println("FIZZ");
		} else if (num % 5 == 0 && num % 3 != 0) {
			System.out.println("BUZZ");
		} else if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("FIZZ-BUZZ");
		} else {
			System.out.println("Crazy");

		}
	}

}

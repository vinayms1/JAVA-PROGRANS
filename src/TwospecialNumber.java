import java.util.Scanner;

public class TwospecialNumber {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter the value");
		int number = Sc.nextInt();
		
		int d1=number/10;
		int d2=number%10;
		int sum=d1+d2+d1*d2;
		if(number==sum) {
			System.out.println("entered value is Special number");
		}
		else {
			System.out.println("entered value is not a special number");
		}

	}

}

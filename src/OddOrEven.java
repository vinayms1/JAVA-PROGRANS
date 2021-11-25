import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter the value");
		int number = Sc.nextInt();
int a = (number/2)*2;
if(number==a) {
	System.out.println("the Entered value is even number");
}
else {
	System.out.println("odd number");
}
	}

}

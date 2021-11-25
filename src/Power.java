import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int power = sc.nextInt();
		
		
		int intialnumber = number;
		
		for(int i=1;i<power;i++) {
			number=intialnumber*number;
			
		}
		
		System.out.println(number);

	}

}

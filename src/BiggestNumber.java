import java.util.Scanner;
public class BiggestNumber {
	

	public static void main(String[] args) {
Scanner Sc = new Scanner(System.in);
		
		
		
		System.out.println("enter the radius");
		float a = Sc.nextFloat();
		float b = Sc.nextFloat();
		float c = Sc.nextFloat();
		
		
		float big =a;
		if(a<b) {
			big=b;
		}
		else if(big<c) {
			big=c;
			
		}
		System.out.println(big);
		
		
	}

}

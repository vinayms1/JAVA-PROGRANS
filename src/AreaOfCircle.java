import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		float pi= 3.14f;
		
		System.out.println("enter the radius");
		int radius = Sc.nextInt();
		 
		double Area=pi*radius*radius;
		System.out.println(Area);

	}

}

import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter the value of   base");
		int base= Sc.nextInt();
		
		System.out.println("Enter the value of  height");
	short height=Sc.nextShort();
	
	double Area=0.5*height*base;
	System.out.println("area of the Triangle  is " +Area);
	}

}

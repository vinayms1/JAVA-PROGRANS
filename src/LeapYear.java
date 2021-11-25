import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE YEAR");
		int year = sc.nextInt();
		
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("THE NUMBER IS LEAP YEAR");
			
		}
		else {
			System.out.println("THE ENTERED YEAR IS NOT A LEAP YEAR");
		}

	}

}
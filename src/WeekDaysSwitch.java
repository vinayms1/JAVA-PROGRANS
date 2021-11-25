import java.util.*;
public class WeekDaysSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE DAY NUMBER");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("MONDAY");
			break;
		case 2: 
			System.out.println("TUESDAY");
			break;
		case 3: 
			System.out.println("WEDNESDAY");
			break;
		case 4: 
			System.out.println("THURSDAY");
			break;
		case 5: 
			System.out.println("FRIDAY");
			break;
		case 6: 
			System.out.println("SATURDAY");
			break;
		case 7: 
			System.out.println("SUNDAY");
		default:
			System.out.println("ENTER THE NUMBER BETWEEN 1 TO 7");
			
			
		}

	}

}

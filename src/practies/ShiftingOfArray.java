package practies;

import java.util.*;

public class ShiftingOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			int temp = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}

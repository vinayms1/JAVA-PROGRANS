package Array;

public class SumOfFirst3max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 40, 90, 30, 80, 50 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + a[i];

		}
		System.out.println(sum);
	}

}

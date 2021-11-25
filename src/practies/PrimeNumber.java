package practies;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		int div = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				div++;
				
			}
		}
		if(div==2) {
			System.out.println("the given number is prime number ");
		}
		else {
			System.out.println("the given number is not prime number");
		}
		System.out.println(div);
	}

}

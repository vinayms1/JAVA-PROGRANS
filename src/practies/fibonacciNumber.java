package practies;

public class fibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0;
		int f2=1;
		System.out.print(f1+" ");
		System.out.print(f2+" ");
		for(int i=1;i<=20;i++) {
		
		int f= f1+f2;
		System.out.print(" "+f);
		f1=f2;
		f2=f;
		}

	}

}

package Array;

public class AddingOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,8,7,9,6};
		int[] b= {8,7,9,6};
		
		int count=a.length;
		if(a.length<b.length) { 
			count=b.length;
		}
		for(int i=0;i<count;i++) {
			try {
				System.out.println(a[i]+b[i]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				if(a.length>b.length) {
					System.out.println(a[i]);
				}
				else {
					System.out.println(b[i]);
				}
			}
		}
	}
}

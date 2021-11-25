package practies;

public class SumOfNumber {

	public static void main(String[] args) {
		String s = "as23ok733pk34";
		int sum = 0;
		int gnum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int n = s.charAt(i) - 48;
				gnum = gnum * 10 + n;
			}
			else {
				sum = sum + gnum;
				gnum = 0;
			}
		}
		sum = sum + gnum;
		System.out.println(sum);
	} 
}

package String;

public class reverseStringWihoutLenghtMEthod {
	public static void main(String[] args) {
		String s = "vinay";
		String rev="";
		int leg=s.compareTo(rev);
		for(int i=0; i<leg;i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
		
	}



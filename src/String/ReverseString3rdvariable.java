package String;

public class ReverseString3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "vinay";
		String revName="";
		for(int i=0; i<name.length();i++) {
			revName=name.charAt(i)+revName;
		}
		System.out.println(revName);
	}

}

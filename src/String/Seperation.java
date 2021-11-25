package String;

public class Seperation {
public static void main(String[] args) {
	String s="asdfgh!@#$%^65432";
	String alpha="";
	String numb="";
	String spec="";
	for(int i=0;i<s.length();i++) {
		if((s.charAt(i)>= 'a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')) {
			alpha=alpha+s.charAt(i);
			 
		}
		else if(s.charAt(i)>= '0'&&s.charAt(i)<='9') {
			numb=numb+s.charAt(i);
		}
		else {
			spec=spec+s.charAt(i);
		}
	}
	System.out.println(alpha);
	System.out.println(numb);
	System.out.println(spec);
	
}
}

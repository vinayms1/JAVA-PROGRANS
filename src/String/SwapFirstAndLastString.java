package String;

public class SwapFirstAndLastString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to tyss";
		String str[]=s.split(" ");
		
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		

	}

}

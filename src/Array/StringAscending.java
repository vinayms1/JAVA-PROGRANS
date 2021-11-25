package Array;

public class StringAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"a","hi","bye","hello","p","tyss","mango"};
		
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j])>1) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}
			}	
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}

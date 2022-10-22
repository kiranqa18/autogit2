package inque;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String s1= "KIRAN";
		
		String rs="" ;
		
		for(int i =s1.length()-1 ; i>=0;i--) {
			
			char a = s1.charAt(i);
			
			rs=rs+a;
			
		}
		
		System.out.println(rs);
		
	}
}

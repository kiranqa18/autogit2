package inque;

public class Per_Alp {
	
	public static void main(String[] args) {
		
		getCharPercentage("INDIA + 1 & 2 & a");
		
		getCharPerArr("INDIA");
		
	}
	
	
	public static void getCharPercentage(String str) {
		
		int len = str.length();
		
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digits = 0;
		int specChars = 0;
		
		
		for(int i=0 ; i<len ; i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
				
			}else if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}else if(Character.isDigit(ch)) {
				digits++;
			}else {
				specChars++;
			}
		}
		
		double upperCasePercentage = (upperCaseCount*100)/len;
		double lowerCasePercentage = (lowerCaseCount*100)/len;
		double digitsPercentage = (digits*100)/len;
		double specCharsPercentage = (specChars *100)/len;
		
		System.out.println("Upper Case % " + upperCasePercentage );
		System.out.println("lower Case % " + lowerCasePercentage );
		System.out.println("digits Case % " + digitsPercentage );
		System.out.println("specCharsPercentage % " + specCharsPercentage );
		
		
		
	}
	
	
	public static void getCharPerArr(String str1) {
		
		char[] a = str1.toCharArray();
		
		int len1 = a.length;
		
		int upperCaseCount1 = 0;
		int lowerCaseCount11 = 0;
		int digits1 = 0;
		int specChars1 = 0;
		
		for(int i = 0 ; i<len1 ; i++) {
			
			a.toString().matches("[A-Z]");
			upperCaseCount1++;
			
		}
		
		System.out.println("--------------------");
		
		System.out.println(upperCaseCount1*100/len1);
		
		
	}

}

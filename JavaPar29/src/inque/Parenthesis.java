package inque;

import java.util.Stack;

public class Parenthesis {
	
	public static void main(String[] args) {
		
		ispar("{}");
		
		if(ispar("{},)")==true) {
			
			System.out.println("matche");
		}else {
			
			System.out.println("Not Matched");
		}
		
		
	}
	
	
	 static boolean ispar(String x){
	        // add your code here
	        Stack<Character> st = new Stack<>();
	        for(int i=0;i<x.length();i++){
	            char ch = x.charAt(i);
	            if(st.isEmpty() || ch=='(' || ch=='{' || ch=='[') st.push(ch);
	            else if((ch==')'&&st.peek()=='(')||(ch=='}'&&st.peek()=='{')||(ch==']'&&st.peek()=='[')) st.pop();
	            else return false;
	        }
	        return st.size()==0;
	    }

}

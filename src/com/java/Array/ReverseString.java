package com.java.Array;

public class ReverseString {
	public static void main(String[] args) {
		
		String str[] = "This is a java program".split(" ");
		
		//System.out.println(StringFormatter.reverseString("This is a java program"))
		
		String ans = "";
		for(int  i  = str.length-1; i >=0 ; i--) {
			ans = ans+ str[i] + " ";
		}
		System.out.println(ans.substring(0, ans.length() -1));
	}

//	private static String reverseString(String str) {
//		// TODO Auto-generated method stub
//		StringBuilder reversed = new StringBuilder();
//		for(int i = 0 ; i< str.length(); i ++ ) {
//			reversed.append(str.charAt(i));
//		}
//		return reversed.toString();
//	}
//	
	

}

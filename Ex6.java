package JavaCore;

import java.util.Scanner;

public class Ex6 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("enter a string: ");
			String str = sc.next();
			System.out.println("reverse string: " + reverseString(str));
			sc.close();
			
		}
		static String reverseString(String str) {
			String reverseStr = "";
			for(int i = 0 ; i < str.length(); i++) {
				char ch = str.charAt(i);
				reverseStr = ch + reverseStr;
			}
			return reverseStr;
		}
}

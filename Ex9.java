package JavaCore;

import java.util.Scanner;

public class Ex9 {
	// This is a program that inputs 2 positive integers and checks it's the same
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("enter the second number: ");
		int num2 = sc.nextInt();
		System.out.println(isTheSame(num1, num2));
		sc.close();
	}

	static boolean isTheSame(int num1, int num2) {

		String str1 = Integer.toString(num1);
		String str2 = Integer.toString(num2);
		String[] arrStr1 = str1.split("");
		String[] arrStr2 = str2.split("");
		for (int i = 0; i < 2; i++) { // input is a two-digit numbers
			for (int j = 0; j < 2; j++) {
				if (arrStr1[i].equals(arrStr2[j])) {
					return true;
				}
			}
		}

		return false;
	}
}

package JavaCore;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a natural number: ");
		int num = sc.nextInt();
		sc.close();
		System.out.print("sum of digits: ");
		System.out.println(sumOfDigitsOfANaturalNumber(num));
		
	}
	
	static int sumOfDigitsOfANaturalNumber(int num) {
		int sum = 0;
		int remainder;
		while( num != 0) {
			remainder = num % 10;
			num /= 10;
			sum  += remainder;
		}
		return sum;
	}
	

}

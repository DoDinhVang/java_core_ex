package JavaCore;

import java.util.Scanner;

public class Ex10 {
//	Program to find prime numbers from 1 to n and sum those primes
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a any natural number n: ");
		int num = sc.nextInt();
		System.out.print("sum of primes from 1 to n: " + sumOfPrimes(num));
		
		sc.close();
	}
		
		
	static int sumOfPrimes(int n) {
		int sum = 0 ;
		for(int i = 1; i <= n ; i++ ) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}
	
	static boolean isPrime(int num) {
		if(num == 1 | num == 2) {
			return true;
		}
		if(num < 1) {
			return false;
		}
		for(int i = 2 ; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

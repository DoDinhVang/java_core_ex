package JavaCore;

public class Ex7 {
		public static void main(String[] args) {
			findDivisors(7);
		}
		
		static void  findDivisors (int num) {
			
			System.out.print("the divisors of " + num + ": ");
			for(int i = 1; i <= num ; i++) {
				if(num % i == 0) {
					System.out.print(i + "\s");
				}
			}
		}
}

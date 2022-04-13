package JavaCore;
import java.util.Scanner;
public class Ex11 {
	//Program to find the largest natural number k smaller than log2(n)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a natural number n: ");
		int num = sc.nextInt();
		System.out.print("the largest k natural number smaller than log2(n) is: " + findK(num));
		sc.close();
	}
	static int findK(int num) {
		
		int logN = (int) (Math.log(num) / Math.log(2));
		
		return  logN - 1;
	}
}

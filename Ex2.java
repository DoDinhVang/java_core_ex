package JavaCore;

public class Ex2 {
		public static void main(String[] args) {
				
				System.out.println(convertDecimalToBinary(5));
				System.out.println(convertBinaryToDecimal(101));
		}
		
		static int convertDecimalToBinary(int num) {

			int remainder;
			int binary = 0, i = 1;
			while(num != 0) {
				remainder = num % 2;
				num /= 2;
				binary += remainder * i ;
				i *= 10;
			}
//			return Integer.toBinaryString(num); type of toBinaryString():  string 
			return binary;
		}
		static int  convertBinaryToDecimal(int num) {
			int decimal = 0, i = 0; 
			int remainder;
			while(num != 0 ) {
				remainder = num % 10;
				num = num / 10;
				decimal += remainder * Math.pow(2, i);
				i++;
			
			}
			
//			return Integer.parseInt("100",2);
			return decimal;
		}
}

package JavaCore;

public class Ex1 {
		public static void main(String[] args) {
			
			for(int i = 1 ; i <= 13 ; i++) {
				for(int j = 1 ; j <= 53 ; j ++) {
					if(i < 8) {
						if(i % 2 != 0) {
							if( j <= 6) {
								System.out.print("* ");
							}else if( j <= 53 - 6){
								System.out.print("=");
							}else {
								continue;
							}
						}else {
							if(j <= 5 && j != 5) {
								System.out.print(" *");
							}else if(j == 5){
								System.out.print(" *  ");
							}else if( j <= 53- 7) {
								System.out.print("=");
							}
							else { 
								continue;
							}
						}
					}else {
						System.out.print("=");
					}
				}
				System.out.println("");
			}
		}
}

package JavaCore;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the coordinates of point A ");
		System.out.print("\tcoorX: ");
		double AX = sc.nextDouble();
		System.out.print("\tcoorY: ");
		double AY = sc.nextDouble();
		System.out.println("enter the coordinates of point B ");
		System.out.print("\tcoorX: ");
		double BX = sc.nextDouble();
		System.out.print("\tcoorY: ");
		double BY = sc.nextDouble();
		Coordinate A = new Coordinate(AX, AY);
		Coordinate B = new Coordinate(BX, BY);
		System.out.println("the length Of line segment AB is: " + distanceBwPoint(A, B));
		sc.close();
		
		
	}
	static double distanceBwPoint(Coordinate A, Coordinate B) {
		double  distance = 0 ;
		 distance = Math.sqrt(Math.pow(A.coorX - B.coorX, 2) + Math.pow(A.coorY - B.coorY,2));
		return distance;
	}
	
}

class Coordinate{
	public double coorX;
	public double coorY;
	public Coordinate(double X, double Y) {
		// TODO Auto-generated constructor stub
		coorX = X;
		coorY = Y;
	}
	
}

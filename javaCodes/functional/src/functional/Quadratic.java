package functional;
import java.util.Scanner;
import java.lang.Math;
public class Quadratic {
	public static void root(int a,int b,int c) {
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println("Roots of Eq."+a+"x^2+"+b+"x+"+c+" x1= "+x1+" x2= "+x2);
	}
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter int in Eq.: Ax^2+Bx+C=0");
		System.out.print("A= ");
		int A=ob.nextInt();
		System.out.print("B= ");
		int B=ob.nextInt();
		System.out.print("C= ");
		int C=ob.nextInt();
		root(A,B,C);
		ob.close();
	}
}

package functional;
import java.util.Scanner;
public class Harmonic {

	public static  double harmonic(double n)
	{
		double res=0;
		for(int i=1;i<=n;i++)
			res=res + (1.0)/i;
		return res;
	}
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a No. (Except '0')");
		double n=obj.nextDouble();
		double res=harmonic(n);
		System.out.println("The Harmonic NO.: "+res);
		obj.close();
	}

}
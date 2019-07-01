package functional;
import java.lang.Math;
public class power_2 {
	public static void main(String[] args) {
		int n=0;
		n=Integer.parseInt(args[0]);
		if(n<0 || n>31) {
			System.out.println("It will work for no. upto 31 only");
		}
		else {
			for(int i=0;i<=n;i++)
			System.out.println("2^"+i+ "= " +(Math.pow(2, i)));
		}
	}
}
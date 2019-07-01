package functional;
import java.io.InputStream;
import java.util.Scanner;
public class PrimeFactor {
	static boolean flag=false;
	public static void primeFactor(int n) {
		for(int i=3;i<=n/2;i=i+2) {
			if(isPrime(i)){
				if(n%i==0) {
					flag=true;
					System.out.print(" "+i);
				}
			}
		}
	}
	public static boolean isPrime(int n) {
		boolean prime=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) {prime=false; break;}
		}
		return prime; 
	}
	
	public static void main(String []args) {
	
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a no to find Prime Factors: ");
		int n=obj.nextInt();
		if(n<0) {
			System.out.println("Invalid input...No. should be greater than 0");
		}
	else{
			if(n%2==0) {flag=true; System.out.print(2);}
			primeFactor(n);
			if(flag==false) {
				System.out.println("No. u've Entered is itself a prime NO.");
			}
		}
	}
}

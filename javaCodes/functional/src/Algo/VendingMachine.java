package Algo;
import java.util.Scanner;
import Utility.*;
public class VendingMachine{
	
public static void main(String[] args) {
	int i=0,amt;
	int sum=0;
	int[] notes= {1000,500,100,50,10,5,2,1};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount you Want to withdraw ");
		amt=sc.nextInt();
		System.out.println("List of Notes");
		sum=Util.noteCal(amt, notes, i,sum);
		System.out.println("Total No. of notes required are: "+sum);
		sc.close();
}


}


package Algo;
import java.util.Scanner;
import Utility.*;
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[]{ 11,22,34,43,55,58,79,81,87 }; 
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no u want to search:");
		n=sc.nextInt();
		sc.close();
		int low=0,high=8,mid=(low + high)/2;
		Utility.binarySearch(low,mid,high,n,arr);
	}
}
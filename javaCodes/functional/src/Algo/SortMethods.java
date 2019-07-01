package Algo;
import java.util.Scanner;
import Utility.*;
public class SortMethods {

	public static void main(String[] args) {
		
/* *******************  Insertion Sort Method for Integers ****************************/
		
		int [] array= {17,21,7,81,23,43,55,11,18};
		long start = System.nanoTime(); 	   
		array=Utility.insertionSort(array);
		long elapsedTime = System.nanoTime() - start;
		for(int k=0;k<array.length;k++)
		System.out.print(array[k]+" ");
		System.out.println();
		System.out.println("Time required for Insertion sort: "+elapsedTime+" nSec");
		System.out.println();
		
/*  ********************* Binary Search Method for Integers ************************* */
		
		int[] arr = new int[]{ 11,22,34,43,55,58,79,81,87 }; 
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no u want to search:");
		n=sc.nextInt();
		sc.close();
		int low=0,high=8,mid=(low + high)/2;
		start = System.nanoTime();
		int check=Utility.binarySearch(low,mid,high,n,arr);
		elapsedTime = System.nanoTime() - start;
		if(check==-1) 
			System.out.println("No. u've entered is not present in an array");
		else{
			System.out.println("No. found at "+(check+1)+ " Position");
		}
		System.out.println("Time required for Binary search: "+elapsedTime+" nSec");
		System.out.println();
		
/*  ***********************  Bubble Sort Method for Integers ************************ */
		
		int [] arrBubbl= {89,87,78,63,91,97,23,17,98,13,5};
			start = System.nanoTime();
			arrBubbl= Utility.bubbleSort(arrBubbl);
			elapsedTime = System.nanoTime() - start;
			for(int i=0;i<arrBubbl.length;i++)
			System.out.print(arrBubbl[i]+" ");
			System.out.println();
			System.out.println("Time required for Bubble Sorting: "+elapsedTime+" nSec");
			
/* **************************  Insertion sort for String  ***************************  */
			
			String str="HappyHappy",sortedString=" ";
			char[] arry= str.toCharArray();
			start = System.nanoTime();
			arry=Utility.insertSort_String(arry);
			elapsedTime = System.nanoTime() - start;
			for(int i=0;i<arry.length;i++)
			sortedString=sortedString + arry[i];
			System.out.println("Sorted string: "+sortedString);
			System.out.println();
			System.out.println("Time required for String Insertion sort: "+elapsedTime+" nSec");
			
/* *************************** Bubble Sort for String  *************************** */
			String str=""
	}
}
package Algo;

import Utility.*;

public class InsertionSort_Int {

	public static void main(String[] args) {
		int [] array= {17,21,7,81,23,43,55,11,18};
		long start = System.nanoTime();    
		array=Utility.insertionSort(array);
		long elapsedTime = System.nanoTime() - start;
		for(int k=0;k<array.length;k++)
		System.out.print(array[k]+" ");
		System.out.println();
		System.out.println("Time required for Insertion sort: "+elapsedTime+" nSec");
	}
}
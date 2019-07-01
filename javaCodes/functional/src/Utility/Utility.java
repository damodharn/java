package Utility;

public class Utility {

				/* binarySearch method for integer */	 
	
		public static int binarySearch(int low,int mid,int high,int n,int[] arr) {
			int check;
			if(low>high) {
			
			return -1;
			}
			else if(arr[mid]==n) {
				 return mid;
			}
			else if(n>arr[mid]) {
				low= mid+1;
				mid=(low+high)/2;
				return (check=binarySearch(low,mid,high,n,arr));
			}
			else {
				high=mid-1;
				mid=(low+high)/2;
				return ( check=binarySearch(low,mid,high,n,arr));
			}
			
		}
		
					/* insertionSort for Integers */
		
		public static int[] insertionSort(int [] arr) {
			int n=arr.length,temp;
			for(int i=1;i<n;i++) {
				for(int j=i-1;j>=0;j--) {
					if(arr[j]>arr[j+1]) {
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			return arr;
		}
		
					/* Bubble Sort Method */
		public static int[] bubbleSort(int[] arr) {
			
			int n=arr.length,temp;
			for(int j=n-1;j>=0;j--) {
			for(int i=0;i<n-1;i++)
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			return arr;
		}
		
/*  ********************** Insertion Sort for String  ****************************  */
		
		public static char[] insertSort_String(char[] arry) {
			
			int n=arry.length;
			char temp;
			for(int i=1;i<n;i++) {
				for(int j=i-1;j>=0;j--) {
					if(arry[j]>arry[j+1]) {
						temp=arry[j];
						arry[j]=arry[j+1];
						arry[j+1]=temp;
					}
				}
			}
			return arry;
		}
}
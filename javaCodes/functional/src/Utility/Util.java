package Utility;

public class Util {
	
	//static int sum=0;
	/* Vending Machine to calculate no. of notes required */
		public static int noteCal(int amt,int[]notes,int i,int sum) {
			int noteNo;
			if(amt==0) return sum;
			if(amt>=notes[i]){
				noteNo=amt/notes[i];
				amt%=notes[i];
				System.out.println(notes[i]+" Rs.Notes="+noteNo);
			 sum += noteNo;
			}
			i++;
			return (sum=noteCal(amt,notes,i,sum));
		}
		
	/* Prog to find and print Prime Nos upto 1000 */
		
		public static void primeNo() {
			boolean prime=true;
			int cnt=0;
			for(int i=2;i<=1000;i++,prime=true) {
				++cnt;
				for(int j=2;j<=i/2;j++)
					if(i%j==0) {
						prime=false; 
						--cnt;
						break;
					}
				if(prime==true) {
					if((cnt-1)%10==0) System.out.println();
					System.out.print("["+cnt+"] "+i+" ");
			}
			
		}
	}
		/* *  ****************   **************  **************  ***** */
}

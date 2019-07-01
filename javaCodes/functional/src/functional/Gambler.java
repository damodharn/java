package functional;

import java.util.Random;
import java.util.Scanner;

public class Gambler {
	public static int bet() {
		Random ran = new Random();
		return (ran.nextInt(2));
	}
	public static void main(String args[]) {
		int cnt=0,win=0;	
		Scanner no=new Scanner(System.in);
			System.out.print("Enter the Stake Value: ");
			int stake=no.nextInt();
			System.out.println();
			System.out.println("Enter the Goal u want to Achieve: ");
			int goal=no.nextInt();
			no.close();
			while(stake!=0 && (stake!=goal)) {
				cnt++;
				int i=bet();
				if(i==1) {
					win++;
					stake+=1;
					System.out.println("Heads..");
				}
				else {
					stake-=1;
					System.out.println("Tails..");
				}
			}
			if(stake==goal) {
				System.out.println("hurreyy..You win");
			}
			else {
				System.out.println("ooopsss..You Loose");
			}
			System.out.println("Totally u've played "+cnt+" Bets u won "+win+ " and loose "+(cnt-win));
			System.out.println("Ur winning percentage= "+(win*100/cnt)+ "% Ur loosing percentage= "+ ((cnt-win)*100/cnt)+"%");
	}

}

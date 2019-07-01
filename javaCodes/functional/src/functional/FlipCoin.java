package functional;
import java.util.Random;
import java.util.Scanner;

class FlipCoin2{
	public static int flipCoin()
	{ 
		Random rand = new Random();
		int res= rand.nextInt(2);
		return res;
	}
}
public class FlipCoin {
	public static void main(String[] args) {
		int head=0,tail=0;
		// TODO Auto-generated method stub
		int choice;
		Scanner obj= new Scanner(System.in);
		do {
			System.out.print("Enter: '1' to Flip Coin Enter: '0' to Quit");
			choice=obj.nextInt();
			if(choice==1)
			{
				int i =FlipCoin2.flipCoin();
				if(i==0) {
					tail++;
					System.out.println("You've Flipped Tails");
				}
				else
				{
					head++;
					System.out.println("You've Flipped Heads");
				}
			}
			else {
				System.out.println("Invalid input..Plz Enter: '1' to flip coin and '0' to Quit");
			}
		}while(choice!=0);
		float per=(head*100/(head+tail));
		System.out.println("Percentage of getting Heads=" + per + " Percntg of getting tails= " + (100-per));
	}

}

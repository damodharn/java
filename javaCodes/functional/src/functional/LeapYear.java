package functional;
import java.util.Scanner;
class Second{
	public boolean CheckLeapYr(int yr)
	{
		 if(yr%100==0)
	        {
	                if(yr%400==0)
	                        return true;
	                else
	                        return false;
	        }
	        else if(yr%4==0)
	                return true;
	        else
	                return false;

	}
	
}
public class LeapYear {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		int yr;
		do {
		System.out.println("Enter a year you want to check: ");
	    yr = myObj.nextInt();
	    if(yr<1000 || yr>9999) System.out.println("Year must be a 4 digit No."); // Checking if Year is 4 digit no. or not
		}while(yr<1000 || yr>9999);
	    Second obj2 =new Second();
	    boolean result=obj2.CheckLeapYr(yr);
	   if(result)
           System.out.println("Year " + yr +" is a Leap Year");
   else
           System.out.println("Year " + yr +" is not a leap year" );

	}

}
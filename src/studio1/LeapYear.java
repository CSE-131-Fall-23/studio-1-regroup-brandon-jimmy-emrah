package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("What year is it?");
		Scanner in = new Scanner(System.in); 
	     int x = in.nextInt();
	boolean leapyear= (((x%4==0)&&(x%100!=0))||(x%400==0));
	System.out.println(x + " is a leap year: " + leapyear);
	
	}

}

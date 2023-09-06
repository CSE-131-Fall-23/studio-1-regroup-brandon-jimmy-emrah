package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("the first of two integers to be averaged?"); 
		Scanner in = new Scanner(System.in); 
		int x = in.nextInt(); 
	System.out.println("the second of two integers to be averaged?"); 
		int y = in.nextInt(); 
		double average =(x+y)/2.0; 
		
		System.out.println("averaged of " + x + " and " + y + " is " + average); 
		
  
   
	}

}

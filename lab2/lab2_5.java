package lab2;
import java.util.Scanner;
public class lab2_5 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  
	      int count = 0;
	      System.out.println("Enter a number:");
	      int number = input.nextInt();
	      
	      while(number!=0){
	         number = number/10;
	         count++;
	      }
	      
	      System.out.println("Number of digits: " + count);
	   }

}

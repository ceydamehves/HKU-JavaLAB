package lab2;
import java.util.Scanner;
public class lab2_7 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number:");
	    int number = input.nextInt();
	    
	    System.out.print("Factors of " + number + " are: ");

	    for (int i = 1; i <= number; ++i) {
	      if (number % i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	  }
}

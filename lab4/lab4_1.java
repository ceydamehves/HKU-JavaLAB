package lab4;
import java.util.Scanner;
public class lab4_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int investment;
	    int years;
	    double interest,totalinvestment;
	
	    System.out.println("Input the investment amount: ");
	    investment = input.nextInt();
	    
	    System.out.println("Input the rate of interest: ");
	    interest = input.nextDouble();
	    
	    System.out.println("Input number of years: ");
	    years = input.nextInt();
	
	    totalinvestment = ((investment*interest)/100)*years;
	    System.out.printf("Total Money After %d Years: %f",years,(investment+totalinvestment));
    
}
}

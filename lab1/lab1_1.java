package lab1;
import java.util.Scanner;

public class lab1_1 {
	public static void main(String[] args) 
	  {
		  
	  
	int subtotal = 0;
	Scanner input = new Scanner(System.in);{ 
	
	  for (int i=0; i<5; i++) 
	  {
		  System.out.println("Enter " + i + ". item :");  
		  subtotal += input.nextInt();
	  }  
	  float tax = (subtotal/100.0f) * 7.0f ;
	  System.out.println("The subtotal amount = " + subtotal);
	  System.out.printf("\n The tax amount = %.2f", tax);
	  System.out.printf("\n The total amount = %.2f\n", tax + subtotal);
	}
	}
	}

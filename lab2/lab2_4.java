package lab2;
import java.util.Scanner;
public class lab2_4 {
	 public static void main(String[] args) {
		 
		 Scanner input = new Scanner(System.in);
	     System.out.print("Enter a number:");
	     int number = input.nextInt();
		
		    for(int i = 1; i <= 10; ++i)
		    {
		        System.out.printf("%d * %d = %d \n", number, i, number * i);
		    }
}}

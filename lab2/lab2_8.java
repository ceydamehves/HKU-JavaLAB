package lab2;
import java.util.Scanner;
public class lab2_8 {
	public static void main(String[] args) {

		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter hours parked 3 for cars:");
		  
		  float first = input.nextFloat();
		  float second = input.nextFloat();
		  float third = input.nextFloat();
		  
		  System.out.println("Car 1 :"+ calculator (first * 60));
		  System.out.println("Car 2 :"+ calculator (second * 60));
		  System.out.println("Car 3 :"+ calculator (third * 60));
		  System.out.println("Total Hour :"+ (first + second + third ) +"    "+ "Charge: " + (calculator(first * 60) + calculator(second * 60) + calculator(third * 60)));

	  }	  	
	  
	  public static float calculator(float minutes)
	  {
		  float total = 0;
		  
		  if(minutes > 180)
		  {
			  float newM = minutes - 180;
			  int newDay = (int)(newM/1440);
			  for (int i = 0; i <= newDay; i++) 
			  {		  	
				  float price = 0;
				  if(i == 0)
				  {
					  price += 2;
				  }
			      for (int j = 0; j < newM;) 
			         {
			        	 if(price < 10)
			        	 {
			        		 price += 0.5f;
			        	 }
						j += 60;
			         }
			      total += price;
			      price = 0;
			  }
		  }
		  
		  else 
		  {
			  total += 2;
		  }
		  return total;
	  }	   	
}



package lab2;
import java.util.Scanner;
public class lab2_2 {
	public static void main(String args[])
    {
		
		float largestNum = 0;
		float currentNum = 0;
	  
	 
	  while(currentNum != -1)
	  {
		  System.out.println("Enter Number: ");
		  Scanner input = new Scanner(System.in);
		  currentNum = input.nextFloat(); 
		  
		  if(currentNum > largestNum)
		  {
			  largestNum = currentNum;
		  }
	  }
	  
	  System.out.printf("%.1f  is largest number", largestNum);
}

}

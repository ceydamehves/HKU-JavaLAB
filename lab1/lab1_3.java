package lab1;
import java.util.Scanner;

public class lab1_3 {
	public static void main(String[] args) 
	  {
		  
		int male;
		int female;
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter the number of males :");
		  male = input.nextInt(); 		  
		  System.out.println("Enter the number of females:");
		  female = input.nextInt(); 
	  
	    float malesP = (float)male / ((float)male+(float)female);
        float  femalesP = 1.0f - malesP;
	  
	      System.out.println("The percantage of male = %" +(int)(malesP * 100));
	      System.out.println("The percantage of female = %"+(int)(femalesP * 100));
}
}
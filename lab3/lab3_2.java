package lab3;
import java.util.Random; 
public class lab3_2 {

	public static void main(String[] args) {
	
		int count;
		int arrayLen = (int)(Math.random() * 10 + 1);
		int[] number = new int[arrayLen];
		
	    System.out.println("The random numbers generated are: ");
	    for (count = 0; count < number.length; count++)
	    {
	        number[count] = (int) (Math.random() * 10 + 1);
	        System.out.println(number[count]);
	    }
	    
	    int max = 0;
	
	    for (int i = 0; i < number.length; i++)
	    {
	        if (number[i] > max)
	        {
	            max = number[i];
	        }
	    }
	    System.out.println("Largest element is:" + max);
}}
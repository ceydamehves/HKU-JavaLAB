package lab3;
import java.util.Random;
import java.util.Scanner;
public class lab3_4 {
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);	    
		String[] names = new String[2];
		int numberOfThrow = 0;
			
		System.out.println("Enter the name for player1:");
		names[0] = input.next();
		System.out.println("Enter the name for player2:");
		names[1] = input.next();
		
		
		System.out.println("Please enter throw number:");
		numberOfThrow = input.nextInt();
		
		int[] player1 = new int[numberOfThrow];
		int[] player2 = new int[numberOfThrow];
		int sumFirst = 0;
		int sumSecond = 0;
		
		for (int i = 0; i < numberOfThrow; i++) 
		{
			int score = (int)(Math.random() * 6 + 1);
			sumFirst += score;
			player1[i] = score;
		}
		
		for (int i = 0; i < numberOfThrow; i++) 
		{
			int score = (int)(Math.random() * 6 + 1);
			sumSecond += score;
			player2[i] = score;
		}		
		
		System.out.println("Results:\n");				
		System.out.printf("%s", names[0] + ":\n");
		for (int i = 0; i < numberOfThrow; i++) {
			System.out.printf("%d --- %d \n",i+1,player1[i]);
		}
		System.out.printf("\nScore for %s = %d \n\n", names[0],sumFirst);		
		
		System.out.printf("%s", names[1] + ":\n");
		for (int i = 0; i < numberOfThrow; i++) {
			System.out.printf("%d --- %d \n",i+1,player2[i]);
		}
		System.out.printf("Score for %s = %d \n\n", names[1],sumSecond);
	
		if(sumFirst > sumSecond)
		{
			System.out.printf("The winner is %s", names[0]);
		}
		else 
		{
			System.out.printf("The winner is %s",names[1]);
		}						
}	
}

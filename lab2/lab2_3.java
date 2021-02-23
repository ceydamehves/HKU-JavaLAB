package lab2;
import java.util.Scanner;
public class lab2_3 {
	public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = input.nextInt();
        
        boolean leap = false;
        
        if(year % 400 == 0)
        {
            leap = true;
        }
        else if (year % 100 == 0)
        {
            leap = false;
        }
        else if(year % 4 == 0)
        {
            leap = true;
        }
        else
        {
            leap = false;
        }
        
        if(leap)
        {
            System.out.println("Year "+ year +" is leap ");
        }
        else
        {
            System.out.println("Year "+ year +" is not leap ");
        }
    }
}


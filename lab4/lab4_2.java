package lab4;
import java.util.Scanner;
public class lab4_2 {
	public static void main(String args[]){
	    
		Scanner input = new Scanner(System.in);
		int palindrome;
        System.out.println("Enter a number : ");
        palindrome = input.nextInt();
       
        if(isPalindrome(palindrome)){
            System.out.println(palindrome + " is a palindrome");
        }else{
            System.out.println(palindrome + " is not a palindrome");
        }      
       
    }
 
    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) 
        {
            int remain = palindrome % 10;
            reverse = reverse * 10 + remain;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }

}


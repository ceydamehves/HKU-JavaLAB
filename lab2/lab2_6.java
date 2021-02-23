package lab2;

import java.util.Scanner;

public class lab2_6 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	    System.out.print("Enter 2 number:");
	    int low = input.nextInt();
	    int high = input.nextInt();
	    
        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {

                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }
}

package lab3;
import java.util.Scanner;
public class lab3_1 {

    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
  
        double[] arr = new double[size];
        double total = 0;

        for(int i=0; i<arr.length; i++){
        	System.out.print("Enter number "+(i+1)+": ");
        	arr[i] = input.nextDouble();
        }
        
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        
        double average = total / arr.length;
        double sum = total;        
        
        System.out.format("Sum of the array's elements is = %.2f \n", sum);
        System.out.format("Average of the array's elements is = %.2f", average);
    }
}

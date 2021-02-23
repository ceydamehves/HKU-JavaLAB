package lab2;
import java.util.Scanner;
public class lab2_1 {
	public static void main(String[] args) 
	  {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        float first = input.nextFloat();
        float second = input.nextFloat();

        System.out.print("Choose an operator (+, -, *, /, a) : ");
        
        char operator = input.next().charAt(0);

        float result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;
             
            default:
                System.out.printf("Operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}
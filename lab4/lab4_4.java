package lab4;
import java.util.Scanner;
public class lab4_4 {
	
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int[] grades = new int[5];
	    for (int i = 0; i < 5; i++) {
	      System.out.print("Please enter the "+(i+1)+". score: ");
	      grades[i] = input.nextInt();
	    }

	    for (int i = 0; i < grades.length; i++) {
	      System.out.println(grades[i] + " means " + determine_grade(grades[i]));
	    }
	    System.out.println("Average score is: "+ calc_average(grades));
	  }


	  public static String determine_grade(int notes) {
		  
	    String letter;
	    switch (notes) {
	      case 90:
	        letter = "A";
	        break;
	      case 80:
	        letter = "B";
	        break;
	      case 70:
	        letter = "C";
	        break;
	      case 60:
	        letter = "D";
	        break;
	      default:
	        letter = "F";
	        break;
	    }
	    return letter;
	    
	  }

	  public static double calc_average(int[] notes){
		  
	    int total = 0;
	    for (int i = 0; i < notes.length; i++) {
	      total += notes[i];
	    }
	    return total/notes.length;
	    
	  }
	}

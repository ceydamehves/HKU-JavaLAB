package lab3;
import java.util.Random; 
public class lab3_5 {
	
	 int minDist(int arr[], int n, int x, int y)  
	    { 
	        int i, j; 
	        int min_dist = Integer.MAX_VALUE; 
	        for (i = 0; i < n; i++)  
	        { 
	            for (j = i + 1; j < n; j++)  
	            { 
	                if ((x == arr[i] && y == arr[j] 
	                    || y == arr[i] && x == arr[j]) 
	                    && min_dist > Math.abs(i - j))  
	                    min_dist = Math.abs(i - j); 
	            } 
	        } 
	        return min_dist; 
	    } 
	  
	    public static void main(String[] args)  
	    { 
	        lab3_5 min = new lab3_5(); 
	        int count;
			
			int[] number = new int[10];
	        for (count = 0; count < number.length; count++)
		    {
		        number[count] = (int) (Math.random() * 10 + 1);
		        System.out.println(number[count]);
		    }
	        int n = number.length; 
	        
	        
	        Random rand = new Random(); 
			int x = rand.nextInt(10); 
			  
		    Random rand2 = new Random(); 
			int y = rand2.nextInt(10); 			  
	       
	  
	        System.out.println("Minimum distance between " + x + " and " + y + " is " + min.minDist(number, n, x, y)); 
	    } 

}

package lab3;

public class lab3_3 {
	public static void main(String[] args) {
		
	int rows = 2, columns = 3;
    int[][] first = { {3,5,3}, {4,6,1} };
    int[][] second = { {-4,3,-5}, {3,5,-3} };

    int[][] sum = new int[rows][columns];
    for(int x=0; x<rows; x++) {
        for (int y=0; y<columns; y++) {
            sum[x][y] = first[x][y] + second[x][y];
        }
    }

    System.out.println("Sum of two matrices is: ");
    for(int[] row : sum) {
        for (int column : row) {
            System.out.print(column + "   ");
        }
        System.out.println();
    }
}
}
import java.util.Scanner;


public class Matrices {
    public int[][] matrix_rcv(int row , int column){

        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[row][column];

        for ( int i = 0; i<row; i++)
        {
            for (int j = 0; j<column; j++)
            {
                System.out.println("Enter " +(i+1) +"x" +(j+1)+"element");
                 matrix[i][j] = Integer.parseInt(scan.next());
            }
        }

        scan.close();
        return matrix;
    }
}

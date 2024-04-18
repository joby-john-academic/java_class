/*Read a matrix from the console and check whether it is symmetric or not. */
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of rows of the matrix");
    int rows  = Integer.parseInt(scan.next());
    System.out.println("Enter the number of columns of the matrix");
    int cols  = Integer.parseInt(scan.next());

    if (rows!=cols){
        System.out.println("To be symmetric the matrix should be a square matrix");
        scan.close();
        System.exit(0);
    }


    int [][] matrix = new int[rows][cols];
    int [][] symmetric  = new int[rows][cols];
    Matrices matrices = new Matrices();
    matrix = matrices.matrix_rcv(rows, cols);


    for (int i = 0; i<rows; i++)
    {
        for ( int j = 0; j<cols; j++)
        {
           symmetric[j][i]= matrix[i][j];
        }
    }

    int sym = 1;
    for (int i = 0; i<rows; i++)
    {
        for ( int j = 0; j<cols; j++)
        {   
           if (symmetric[i][j]!=matrix[i][j])
           {
            System.out.println("The matrx is not symmetric");
            sym = 0;
            break;
           }
        }

       
    }
    if (sym == 1){
        System.out.println("The matrix is symmetric");
    }
    scan.close();
    System.exit(0);
  }
}


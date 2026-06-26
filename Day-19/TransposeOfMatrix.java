import java.util.Scanner;

public class TransposeOfMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.err.print("Enter rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter coloumn: ");
        int col = sc.nextInt();
        
        int[][] matrix = new int[rows][col];
        int[][] transpose = new int[col][rows];
        
        System.out.print("Enter Elements of  matrix -->\n");
        for(int i = 0; i<rows; i++){
            for(int j= 0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Transpose of matrix is -->\n");
        for(int i = 0; i<col; i++){
            for(int j= 0; j<rows; j++){
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println("");
        }

    }
}
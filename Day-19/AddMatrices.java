import java.util.Scanner;

public class AddMatrices{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.err.print("Enter rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter coloumn: ");
        int col = sc.nextInt();
        
        int[][] mat = new int[rows][col];
        int[][] sum = new int[rows][col];
        int[][] matrix = new int[rows][col];
        
        System.out.print("Enter Elements of first matrix -->\n");
        for(int i = 0; i<rows; i++){
            for(int j= 0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Enter Elements of Second matrix -->\n");
        for(int i = 0; i<rows; i++){
            for(int j= 0; j<col; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Sum of matrix is -->\n");
        for(int i = 0; i<rows; i++){
            for(int j= 0; j<col; j++){
                sum[i][j] = matrix[i][j] + mat[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
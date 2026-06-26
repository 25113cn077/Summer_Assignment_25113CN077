import java.util.Scanner;

public class SubtractionOfMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.err.print("Enter rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter coloumn: ");
        int col = sc.nextInt();
        
        int[][] matrix = new int[rows][col];
        int[][] mat = new int[rows][col];
        int[][] sub = new int[rows][col];
        
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
        
        System.out.print("Subtraction of matrix is -->\n");
        for(int i = 0; i<rows; i++){
            for(int j= 0; j<col; j++){
                sub[i][j] = matrix[i][j] - mat[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
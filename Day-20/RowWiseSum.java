import  java.util.Scanner;

public class RowWiseSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter coloumns: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter elements of matrix -->");
        for(int i =0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        
        System.out.print("Sum of rows are -->\n");
        for(int i=0;i<row;i++){
            for(int j = 0;j <col;j++){
                sum = sum + matrix[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row is "+ sum);
            sum = 0;
        }       
    }
}
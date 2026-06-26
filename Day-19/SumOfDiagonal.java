import java.util.Scanner;

public class SumOfDiagonal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.err.print("Enter size of matrix (like 3*3 type: 3): ");
        int size = sc.nextInt();
        
        // int[][] matrix = new int[size][size];
        System.out.print("Enter Elements of  matrix -->\n");
        int sum = 0;
        for(int i = 0; i<size; i++){
            for(int j= 0; j<size; j++){
                int value = sc.nextInt();
                if(i==j || (i+j) == (size-1)){
                    sum = sum + value;
                }
            }
        }
        System.out.print("Sum of Diagonal is --> "+sum);

    }
}
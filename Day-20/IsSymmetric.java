import java.util.Scanner;

public class IsSymmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean symmetric = true;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric) {
                break;
            }
        }

        if (symmetric) {
            System.out.println("Matrix is Symmetric.");
        } else {
            System.out.println("Matrix is Not Symmetric.");
        }

    }
}
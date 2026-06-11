import java.util.Scanner;

public class fibonacci {

    static void fibo(int n) {
        int firstNum = 0;
        int secondNum = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstNum + " ");

            int thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        fibo(n);
    }
}
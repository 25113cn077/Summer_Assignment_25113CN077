import java.util.Scanner;

public class SumOfNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Num: ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd Num: ");
        int m = sc.nextInt();
        System.out.print("Addition of both Number is : " + (n+m));
    }
}
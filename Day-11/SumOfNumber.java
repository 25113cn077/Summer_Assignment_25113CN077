import java.util.Scanner;

public class SumOfNumber{

    static int sum(int n, int m){
        return n+m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Num: ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd Num: ");
        int m = sc.nextInt();
        System.out.print("Addition of both Number is : " + sum(n,m));
    }
}
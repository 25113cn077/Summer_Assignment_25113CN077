import java.util.Scanner;

public class maximumNumber{

    static int max(int n, int m){
        if(n>m){
            return n;
        }
        else{
            return m;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int m = sc.nextInt();
        System.out.print(max(n,m) + " is greator than other number.");
    }
}
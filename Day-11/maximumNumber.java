import java.util.Scanner;

public class maximumNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int n = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int m = sc.nextInt();
        if(n>m){
            System.out.println("1st Number is greator than 2nd Number.");
        }
        else{
            System.out.println("2nd Number is greator than 1st Number.");
        }
    }
}
import java.util.Scanner;

public class binaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(n>0){
            int r = n % 10;
            sum = sum + (r * (int)Math.pow(2,i));
            i = i + 1;
            n = n /10;
        }
        System.out.print("decimal Number : " + sum);
    }
};
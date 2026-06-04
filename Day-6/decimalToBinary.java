import java.util.Scanner;

public class decimalToBinary{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reBinary = 0;
        int Binary = 0;
        while(n > 0){
            int r = n % 2;
            int m = n / 2;
            n = m;
            reBinary = reBinary * 10 + r ; 
        }
        while(reBinary > 0){
            int R = reBinary % 10;
            Binary = Binary *10 + R;
            reBinary = reBinary / 10;
        }        
        System.out.print(Binary);
    }
}
import java.util.Scanner;
public class Setbits{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int Binary = 0;
        int sum = 0;
        while(n > 0){
            int r = n % 2;
            int m = n / 2;
            n = m;
            Binary = Binary * 10 + r ; 
        }
        while(Binary > 0){
            int R = Binary % 10;
            if(R == 1){
                sum = sum +1;
            }
            Binary = Binary / 10 ;
        }        
        System.out.print("there are " + sum + " Bits");
    }
}
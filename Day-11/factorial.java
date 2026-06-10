import java.util.Scanner;

public class factorial{

    static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n ; i++){
            fact = fact *i;
        }
        return fact;        

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.print("Factorial of "+ n + " is " + fact(n));
    }
}
import java.util.Scanner;

public class Fibonacci{
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series are:\n");
        for(int i =0; i<n ; i++){
            System.out.print(fibonacci(i) + " ");  
        }

    }
}

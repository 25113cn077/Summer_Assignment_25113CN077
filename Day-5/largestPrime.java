import java.util.Scanner;

public class largestPrime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int max = 0;
        int count = 0;
        for(int num = 1; num <= n; num++){
            for(int i = 1 ; i <= num; i++){
                if(num % i == 0){
                    count = count + 1;
                }
            }
            if(count == 2){
                // System.out.println(num);
                if(num > max){
                    max = num ;
                }
            }
            count = 0;
        }
        System.out.print("Largest prime number is " + max);
    }
}
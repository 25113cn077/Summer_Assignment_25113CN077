import java.util.Scanner;

public class strongNumber{
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int ogNum = num;
        int sum = 0;
        while(num>0){
            int n = num % 10;
            sum = sum + factorial(n);
            num = num/10;
        }
        if(ogNum == sum){
            System.out.println("Enter Number is Strong number");
        }
        else{
            System.out.print("It is not a strong number");
        }
    }
}

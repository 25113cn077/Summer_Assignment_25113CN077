import java.util.Scanner;

public class perfect{
    static void check(int n) {
        int sum = 0;
        for(int i =1; i<= (n/2) ;i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        if(sum == n){
            System.out.print("It is Perfect Number");
        }
        else{
            System.out.print("It is not Perfect Number");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        check(n);
    }
}
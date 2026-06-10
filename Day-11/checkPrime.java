import java.util.Scanner;

public class checkPrime{

    static String prime(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            return "Number is Prime";
        }
        else{
            return "Number is not Prime" ;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print(prime(n));
    }
}
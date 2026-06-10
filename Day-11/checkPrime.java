import java.util.Scanner;

public class checkPrime{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.print("Number is Prime");
        }
        else{
            System.out.print("Number is not Prime");
        }
    }
}
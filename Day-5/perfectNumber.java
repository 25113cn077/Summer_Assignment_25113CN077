import java.util.Scanner;

public class perfectNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ogNum = n;
        int sum = 0;
        for(int i = 1; i<=(n/2) ; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        if(ogNum==sum)
            System.out.print("Yes, It is perfect number");
        
        else
            System.out.print("No, It is not");
        
    }
}
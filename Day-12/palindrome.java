import java.util.Scanner;

public class palindrome{
    static String palin(int n){
        int reverse = 0;
        int OgNum = n;
        while(n>0){
            int r = n % 10;
            reverse = reverse *10 + r;
            n = n / 10;
        }
        if(OgNum == reverse){
            return "Yes it is palindrome number";
        }
        else{
            return "It is not";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        System.out.print(palin(n));
    }

}
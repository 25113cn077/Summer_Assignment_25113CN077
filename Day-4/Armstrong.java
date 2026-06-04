// is number is Armstrong or not ??

import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ogNum = n;
        int reverseNum = 0;
        while(n>0){
            int r = n % 10;
            reverseNum = (reverseNum * 10) + r;
            n = n / 10;
        }
        if(ogNum == reverseNum){
            System.out.print("Yes, Number is Armstrong");
        }
        else{
            System.out.print("Number is not a Armstrong number");
        }
    }
}

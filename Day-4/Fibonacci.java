// Print Fibonacci series

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        for(int i =0; i<n ; i++){
            if(i == 0){
                System.out.print(firstNum + "\t");
            }
            if(i==1){
                System.out.print(secondNum + "\t");
            }
            if(i>1){
                int nextNum = (firstNum+secondNum);
                firstNum = secondNum;
                secondNum = nextNum;
                System.out.print(nextNum + "\t");
            }
        }


    }
}


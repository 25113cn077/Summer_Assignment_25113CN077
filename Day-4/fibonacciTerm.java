// to find the term of fibonaccai Series ... 

import java.util.Scanner;

public class fibonacciTerm{
    static int fibonacci_term(int n){
        // int nextterm = 0;
        if(n==1){
            return 0;
        }
        if(n==2){
            return  1;
        }
        return fibonacci_term(n-1) + fibonacci_term(n-2);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("fibonacci term is"+ " " +fibonacci_term(n));
    }

}
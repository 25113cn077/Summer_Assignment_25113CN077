import java.util.Scanner;
public class ProductOfDigits
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a no : ");
                int n=sc.nextInt();
                int prod=1;
                while(n>0)
                {
                        int digit=n%10;
                        prod=prod*digit;
                        n=n/10;
                }
                System.out.println("Product of digits of a number = "+prod);
        }
}
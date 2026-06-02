import java.util.Scanner;
public class Palindrome
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a no : ");
                int n=sc.nextInt();
                int num=n;
                int new_num=0;
                while(n>0)
                {
                        int digit=n%10;
                        new_num=new_num*10+digit;
                        n=n/10;
                }
                if(new_num==num)
                System.out.println("It is a palindrome number");
                else
                System.out.println("It is not a palindrome number");
        }
}
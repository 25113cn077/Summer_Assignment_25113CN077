import java.util.Scanner;

public class primeNumber 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1 ; i<=n ; i++){
            if(n%i == 0){
                count = count + 1;
            }
        }
        if(count == 2){
            System.out.print("Yes, it is a Prime Number");
        }
        else{
            System.out.print("it is not Prime Number");
        }
    }
}




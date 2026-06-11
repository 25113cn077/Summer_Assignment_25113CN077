import java.util.Scanner;
// import java.lang.Math;

public class armstrong{
    static String palin(int n){
        int sum = 0;
        int OgNum = n;
        int count = 0;
        while(n>0){
            count++;
            n =n/10;
        }
        n = OgNum;
        while(n>0){
            int r = n % 10;
            sum = sum + (int)Math.pow(r,count);
            n = n / 10;
        }
        if(OgNum == sum){
            return "Yes it is Armstrong number";
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
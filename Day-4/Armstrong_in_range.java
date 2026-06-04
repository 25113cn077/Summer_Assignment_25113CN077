import java.util.Scanner;

public class Armstrong_in_range{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial number: ");
        int n = sc.nextInt();
        System.out.print("Enter end number: ");
        int m = sc.nextInt();
        int i = n ;
        while(n <= i &&  i < m){
            int ogNum = i;
            int reverseNum = 0;
            while(i>0){
                int r = i % 10;
                reverseNum = (reverseNum * 10) + r;
                i = i / 10;
            }
            if(ogNum == reverseNum){
                System.out.print(ogNum + "\t");
            }
            // else{
            //     System.out.print("Number is not a Armstrong number");
            // }
            i = ogNum;
            i = i + 1;

        }
    }
}

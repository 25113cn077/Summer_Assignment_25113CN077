
import java.util.Scanner;

public class MissingNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int sArr = 0;
        int[] arr = new int[n];
        System.out.print("Enter consecutive elements: \n");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            sArr = sArr + arr[i];

        }
        int p = arr[0];
        int q = arr[n-1];
        int sum = (q * (q + 1)) / 2 - ((p - 1) * p) / 2;
        
        if((sum - sArr) == 0){
            System.out.print("You did not miss any number !");
        }
        else{
            System.out.print("you miss this number: " + (sum - sArr));
        }

    }
}
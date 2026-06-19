import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  Size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter element of an array....\n");
        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse array is : \n ");
        int[] ReArr = new int[n];
        for(int i = 0; i<n; i++){
            ReArr[i] = arr[n-i-1];
            System.out.print(ReArr[i] + " ");
        }
    }
}
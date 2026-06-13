import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array element...\n");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();            
        }

        System.out.print("Enter Searching Element : ");
        int m = sc.nextInt();
        boolean found = false;

        System.out.print("Element found at indexes: ");

        for(int i = 1; i <= n; i++) {
            if(arr[i] == m) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if(!found) {
            System.out.println("Element not found");
        }
    }
}
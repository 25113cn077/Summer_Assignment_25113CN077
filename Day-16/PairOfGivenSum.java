    
import java.util.Scanner;

public class PairOfGivenSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an array: ");
        int n = sc.nextInt();

        System.out.print("Enter Elements -->\n");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.err.print("Enter sum -- ");
        int sum = sc.nextInt();

        System.err.println("List of pairs -->");
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(sum == arr[i]+arr[j]){
                    // list.put(arr[i],arr[j]);
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }
}
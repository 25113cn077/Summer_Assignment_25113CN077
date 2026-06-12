import java.util.Scanner;

public class LargestElement{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int lNum = -120000;
        int sNum = 120000;
        int[] arr = new int[n];

        System.out.println("Enter array Elements...");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > lNum){
                lNum = arr[i];
            }
            if(arr[i]< sNum){
                sNum = arr[i];
            }
        }
        System.out.print("Largest Element in an array is: "+ lNum + "\n");
        System.out.print("Smallest Element in an arrat is: "+ sNum + "\n");
    }
}
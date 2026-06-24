import java.util.Scanner;

public class MergeArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of 1st arr: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter array elements --> \n");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        
        System.out.print("Enter size of 2nd arr: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter array elements --> \n");
        for(int i =0;i<m;i++){
            arr2[i] = sc.nextInt();
        }
        
        int index = n+m;
        int[] merged = new int[index];
        for(int i = 0 ; i<n; i++){
            merged[i] = arr1[i];
        }
        for(int i = 0;i <m; i++){
            merged[n+i] = arr2[i];
        }
        System.out.print("Merged array --> \n");
        for(int i =0; i<index; i++){
            System.out.print(merged[i] + " ");
        }
    }
}
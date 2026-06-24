import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfArrays{
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

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            if(set.contains(num)){
                System.out.print(num + " ");
                set.remove(num);
            }
        }
    }
}
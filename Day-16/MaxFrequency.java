import java.util.HashMap;
import java.util.Scanner;

public class MaxFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter Elements of an array --> \n");
        
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num , freq.getOrDefault(num, 0) + 1);
        }
        int Largestfreq = 0;
        int LargestNum = -1000;
        for(int num : arr){
            if(freq.get(num) > Largestfreq){
                Largestfreq = freq.get(num);
                LargestNum = num;
            }
        }
        System.out.print("maximum frequency Element is " + LargestNum);
    }
}
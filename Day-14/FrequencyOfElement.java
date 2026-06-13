import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array Elements : \n");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+ 1);
        }

        System.out.print(freq + "\n");
        System.out.print(freq.keySet());
    }
}

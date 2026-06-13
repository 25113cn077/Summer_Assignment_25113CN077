import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicatesInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.print("Enter array Elements: \n");
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap <Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }   
        ArrayList<Integer> duplicate = new ArrayList<>();
        // int index = 0;
        
        for(int num : freq.keySet()){
            if(freq.get(num) > 1){
                duplicate.add(num);
                // index++;
            }
        }
        System.out.print("Duplicates Number are: \n");
        for(int i = 0 ; i< duplicate.size(); i++){
            System.out.print(duplicate.get(i) + " ");
        }

    }
}

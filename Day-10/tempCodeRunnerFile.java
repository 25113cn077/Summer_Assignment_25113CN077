import java.util.Scanner;

public class alphaPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of pyramid: ");
        int n = sc.nextInt();
        char ch = 'A';
        

        for (int i = 1; i <= n; i++) {


            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(ch);
                ch++;
            }

            for (int l = i - 1; l >= 1; l--){
                ch ='A';
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            ch = 'A';
        }
    }
}
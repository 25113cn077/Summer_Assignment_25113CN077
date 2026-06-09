import java.util.Scanner;

public class alphaPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of pyramid: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(ch);
                ch++;
            }
   
            ch -= 2; 
            for (int l = 1; l < i; l++) {
                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }

        sc.close();
    }
}
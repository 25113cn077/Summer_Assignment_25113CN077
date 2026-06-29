import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("----- Java Quiz -----");

        System.out.println("1. Java is developed by?");
        System.out.println("a) Microsoft");
        System.out.println("b) Sun Microsystems");
        System.out.println("c) Google");
        System.out.print("Answer: ");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B')
            score++;

        System.out.println("\n2. Which keyword is used to create an object?");
        System.out.println("a) create");
        System.out.println("b) object");
        System.out.println("c) new");
        System.out.print("Answer: ");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'c' || ans2 == 'C')
            score++;

        System.out.println("\n3. Java is a?");
        System.out.println("a) Programming Language");
        System.out.println("b) Database");
        System.out.println("c) Browser");
        System.out.print("Answer: ");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'a' || ans3 == 'A')
            score++;

        System.out.println("\nYour Score = " + score + "/3");
    }
}
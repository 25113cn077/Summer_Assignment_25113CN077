import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int availableSeats = 50;

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        if (tickets <= availableSeats) {
            availableSeats -= tickets;

            System.out.println("\nBooking Successful!");
            System.out.println("Passenger : " + name);
            System.out.println("Tickets   : " + tickets);
            System.out.println("Seats Left: " + availableSeats);
        } else {
            System.out.println("Sorry! Tickets Not Available.");
        }
    }
}
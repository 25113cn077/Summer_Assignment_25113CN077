import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.println("\n------ Inventory ------");
        System.out.println("Product ID   : " + id);
        System.out.println("Product Name : " + name);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Price        : " + price);
        System.out.println("Total Value  : " + (quantity * price));
    }
}
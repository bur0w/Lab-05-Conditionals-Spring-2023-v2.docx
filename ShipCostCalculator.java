import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: $");
        double price = scanner.nextDouble();

        double shippingCost;
        double totalPrice;

        if (price >= 100) {
            shippingCost = 0; 
        } else {
            shippingCost = 0.02 * price; 
        }

        totalPrice = price + shippingCost;

        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total: $" + totalPrice);

        scanner.close();
    }
}

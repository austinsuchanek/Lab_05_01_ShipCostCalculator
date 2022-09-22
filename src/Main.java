public class Main {

    public static void main(String[] args) {

        double itemPrice = 96;
        double shippingCost = 0;
        double totalCost = 0;

        System.out.println("The price of your item is: + itemPrice");

        if (itemPrice >= 100) {
            shippingCost = 0;
            totalCost = itemPrice;
        } else // itemPrice < 100
        {
            shippingCost = 0.02 * itemPrice;
            totalCost = itemPrice + shippingCost;
        }

        System.out.println("The shipping cost is: " + shippingCost);
        System.out.println("The total cost is: " + totalCost);

    }
}
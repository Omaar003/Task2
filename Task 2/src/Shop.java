public class Shop {
    public static void main(String[] args) {

        Product Steel = new Product("Steel", 5000);
        Product Wood = new Product("Wood", 3000);
        Product Plastic = new Product("Plastic", 2000);

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(Steel);
        cart.addItem(Wood);
        cart.addItem(Plastic);

        double totalCost = cart.getTotalCost();
        System.out.println("Total Cost is : " + totalCost+" $");

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.placeOrder(cart);
    }
}
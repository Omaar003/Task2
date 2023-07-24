class OrderProcessor {
    public void placeOrder(ShoppingCart cart) {
        System.out.println("-----------Order Details------------");
        for (Product item : cart.getItems()) {
            System.out.println(item.getName() + " - " + item.getPrice()+" $");
        }
        double totalCost = cart.getTotalCost();
        System.out.println("Total Cost: " + totalCost);
    }
}
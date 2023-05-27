public class Product {
    private final String productName;
    private int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductName: " + productName +", Price=" + price+'\n';
    }
}

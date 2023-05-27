import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    public int totalPrice() {
        int totalPrice = 0;
        for (Product product : products)
            totalPrice += product.getPrice();
        return totalPrice;
    }
    private int totalPrice=totalPrice();

    @Override
    public String toString() {
        return products.toString()+" Total Price: "+totalPrice;
    }
}

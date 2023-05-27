public class Customer {
    private String name;
    private String phone;
    private CreditCard creditCard;
    private ShoppingCart shoppingCart;

    public Customer(String name, String phone, int cardNumber, int verificationNumber, String expireDate, ShoppingCart shoppingCart) {
        this.name = name;
        this.phone = phone;
        this.creditCard = new CreditCard(cardNumber, verificationNumber, expireDate);
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + '\n' +"Phone: " + phone + '\n' +
                "CreditCard: " + creditCard +
                "ShoppingCart: " + shoppingCart.toString();
    }
}

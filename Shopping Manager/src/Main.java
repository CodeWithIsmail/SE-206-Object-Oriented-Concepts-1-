public class Main {
    public static void main(String[] args)
    {

        Product keyboard=new Product("ASUS keyboard",2000);
        Product mouse=new Product("ASUS Mouse",1500);

        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addProduct(keyboard);
        shoppingCart.addProduct(mouse);

        Customer Ismail=new Customer("Ismail","01537790899",1234567,112233,"October2025",shoppingCart);


        System.out.println(Ismail);

    }
}
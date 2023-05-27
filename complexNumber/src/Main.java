public class Main {
    public static void main(String[] args)
    {
        complexNumber a=new complexNumber(5.9,6.0);
        complexNumber b=new complexNumber(-3.0,4.0);

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("a + b = "+a.sum(a,b));
        System.out.println("a - b = "+a.subtract(a,b));

    }
}
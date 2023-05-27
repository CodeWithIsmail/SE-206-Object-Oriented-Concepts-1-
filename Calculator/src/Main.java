public class Main {
    public static void main(String[] args)
    {
        calculator calc1=new calculator(3,4);
        calculator calc2=new calculator(3.8,9.2);

        System.out.println(calc1.a+" + "+calc1.b+" = "+calc1.sum(3,4));
        System.out.println(calc2.c+" + "+calc2.d+" = "+calc2.sum(3.6,4.8));
    }
}
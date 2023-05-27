import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        Point a;
        Point b;
        a=new Point(10,20);
        b=a;
        b.x=30;
        b.y=40;
        System.out.println("a: "+a.x+","+a.y);
        System.out.println("b: "+b.x+","+b.y);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Private st1=new Private("student1",133,4.00);
        System.out.println("Name: "+st1.getName()+" Roll: "+st1.getRoll()+" CGPA: "+st1.getCgpa());

        Private st2=new Private("Student2",123,3.99);
        System.out.println(st2);

        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int roll=scanner.nextInt();
        double cgpa=scanner.nextDouble();

        Private st3=new Private(name,roll,cgpa);
        System.out.println(st3);

    }

}
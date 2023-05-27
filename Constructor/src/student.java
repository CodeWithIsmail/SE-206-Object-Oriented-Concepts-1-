import java.util.Arrays;

public class student {
    private final String name;
    private final double[] mark;

    public student(String name, double[] mark) {
        this.name = name;
        this.mark = mark;
    }

    public double totalMarks() {
        double total = 0;
        for (double m : mark)
            total += m;
        return total;
    }
    public double average()
    {
        return totalMarks()/mark.length;
    }

//    @Override
//    public String toString() {
//        return Arrays.toString(mark);
//    }

    public void printInfo()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Marks: "+Arrays.toString(this.mark));
        System.out.println("Total Marks: "+this.totalMarks());
        System.out.println("Average: "+this.average());
    }
}

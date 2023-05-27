public class Private {
    private final String name;
    private final int roll;
    private final double cgpa;

    public Private(String name, int roll, double cgpa) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return
                "Name= " + name + ", Roll=" + roll +
                        ", CGPA=" + cgpa;
    }
}

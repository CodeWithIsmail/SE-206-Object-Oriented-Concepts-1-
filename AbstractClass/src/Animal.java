public abstract class Animal {
    private String name;
    private final int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    @Override
    public String toString() {
        return
                "name: " + name + ", legs: " + legs;
    }
}

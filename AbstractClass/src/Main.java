public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Lion("Lion", 4);
        animals[1] = new Tiger("Tiger", 4);
        animals[2] = new Snack("Snack", 0);

        Zoo zoo = new Zoo(animals);
//        System.out.println(zoo);
        zoo.printInfo();
    }
}
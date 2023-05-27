import java.util.Arrays;

public class Zoo {
    private Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

//    @Override
//    public String toString() {
//        return "Zoo{" +
//                "animals=" + Arrays.toString(animals) +
//                '}';
//    }

    public void printInfo()
    {
        System.out.println("Zoo: ");
        for(Animal animal:animals)
        {
            System.out.println(animal.toString());
        }
    }
}

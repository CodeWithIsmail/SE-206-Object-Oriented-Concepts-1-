public class Main {
    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle();
        bicycle1.printfInfo();

        bicycle1.changeCadence(10);
        bicycle1.changeGear(20);
        bicycle1.increaseSpeed(5);
        bicycle1.decreaseSpeed(2);
        bicycle1.printfInfo();
    }
}
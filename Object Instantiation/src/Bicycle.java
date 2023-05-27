public class Bicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    public void changeCadence(int newCadence) {
        cadence = newCadence;
    }

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void increaseSpeed(int increase) {
        speed += increase;
    }

    public void decreaseSpeed(int decrease) {
        speed -= decrease;
    }

    public void printfInfo() {
        System.out.println("Cadence: " + cadence + " Gear: " + gear + " Speed: " + speed);
    }
}

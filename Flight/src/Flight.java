public class Flight {
    private static final int CAPACITY = 200;
    private int totalPassenger;
    private int totalCheckedBags;

    public void addOnePassenger(int bags, int carryOns) {
        int totalBags = bags;
        if (carryOns > 2) {
            totalBags = bags + carryOns - 2;
        }
        addOnePassenger(totalBags);
    }

    public void addOnePassenger(int Bags) {
        if (seatAvailable()) {
            addOnePassenger();
            totalCheckedBags += Bags;
        }
    }

    public void addOnePassenger() {
        if (seatAvailable()) {
            totalPassenger++;
        }
    }

    private boolean seatAvailable() {
        return totalCheckedBags < CAPACITY;
    }

    public int getTotalPassenger() {
        return totalPassenger;
    }

    public int getTotalCheckedBags() {
        return totalCheckedBags;
    }
}

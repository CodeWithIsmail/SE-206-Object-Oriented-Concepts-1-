public class Main {
    public static void main(String[] args)
    {
        Flight flight=new Flight();
        flight.addOnePassenger();
        flight.addOnePassenger(2);
        flight.addOnePassenger(2,3);
        int totalCheck=flight.getTotalCheckedBags();
        int totalPassenger=flight.getTotalPassenger();

        System.out.println("Total Passenger= "+totalPassenger);
        System.out.println("Total Checked Bags= "+totalCheck);
    }
}
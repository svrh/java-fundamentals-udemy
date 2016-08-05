/**
 * Created by svetoslav on 03.08.16.
 */
public class SUVDemo {
    public static void main(String[] args) {
        SUV x6 = new SUV(5, 22, 35, 8.3);
        SUV x3 = new SUV(5, 22, 45, 8.3);

        int range;
        double gallons;
        int dist = 252;

        range = x6.range();
        gallons = x6.fuelNeeded(dist);
        System.out.println("X6 has combined range of " + range + " miles.");
        System.out.println("To go " + dist + " miles (fast ;)), X6 needs " + gallons + " gallons of fuel.\n");

        range = x3.range();
        gallons = x3.fuelNeeded(dist);
        System.out.println("X3 has combined range of " + range + " miles.");
        System.out.println("To go " + dist + " miles, X3 needs " + gallons + " gallons of fuel.");
    }
}

/**
 * Created by svetoslav on 03.08.16.
 */
public class SUV extends Vehicle {
    private double groundClearance;

    public SUV(int passengers, int fuelCap, int mpg, double groundClearance) {
        super(passengers, fuelCap, mpg);
        this.groundClearance = groundClearance;
    }

    public double getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(double groundClearance) {
        this.groundClearance = groundClearance;
    }
}

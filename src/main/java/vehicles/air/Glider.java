package vehicles.air;

import products.IProduct;
import vehicles.Vehicle;

public class Glider extends Vehicle implements IAirVehicle {
    private int gliderSpan;
    private int thrust;
    public Glider(float weight, int maxSpeed, IProduct baseProduct, int gliderSpan, int thrust){
        super(weight, maxSpeed, baseProduct);
        this.gliderSpan = gliderSpan;
        this.thrust = thrust;
    }

    public int getGliderSpan() {
        return gliderSpan;
    }

    public void setGliderSpan(int gliderSpan) {
        this.gliderSpan = gliderSpan;
    }

    @Override
    public int getThrust() {
        return this.thrust;
    }

    @Override
    public void setThrust(int thrust) {
        this.thrust = thrust;
    }
}

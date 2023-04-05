package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle {
    private int numberOfBlades;
    private int bladeSpan;
    private IMotorised aircraftEngine;
    private int thrust;
    public Helicopter(float weight, int maxSpeed, IProduct baseProduct, int numberOfBlades, int bladeSpan, IMotorised aircraftEngine, int thrust){
        super(weight, maxSpeed, baseProduct);
        this.numberOfBlades = numberOfBlades;
        this.bladeSpan = bladeSpan;
        this.aircraftEngine = aircraftEngine;
        this.thrust = thrust;
    }

    public int getNumberOfBlades() {
        return numberOfBlades;
    }

    public void setNumberOfBlades(int numberOfBlades) {
        this.numberOfBlades = numberOfBlades;
    }

    public int getBladeSpan() {
        return bladeSpan;
    }

    public void setBladeSpan(int bladeSpan) {
        this.bladeSpan = bladeSpan;
    }


    @Override
    public void startEngine() {
        this.aircraftEngine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.aircraftEngine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.aircraftEngine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.aircraftEngine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.aircraftEngine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.aircraftEngine.setFuel(fuel);
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

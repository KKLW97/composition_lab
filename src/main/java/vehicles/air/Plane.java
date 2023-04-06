package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Plane extends Vehicle implements IAirVehicle, IMotorised {
    public int numberOfEngines;
    public int wingSpan;
    public int thrust;
    public IMotorised aircraftEngine;

    public Plane(float weight, int maxSpeed, IProduct baseProduct, int numberOfEngines, int wingSpan, int thrust, IMotorised aircraftEngine){
        super(weight, maxSpeed, baseProduct);
        this.numberOfEngines = numberOfEngines;
        this.wingSpan = wingSpan;
        this.thrust = thrust;
        this.aircraftEngine = aircraftEngine;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public int getThrust() {
        return this.thrust;
    }

    @Override
    public void setThrust(int thrust) {
        this.thrust = thrust;
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
}

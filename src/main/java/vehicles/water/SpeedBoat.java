package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;
import vehicles.water.IWaterVehicle;

public class SpeedBoat extends Vehicle implements IWaterVehicle, IMotorised {
    private String hullType;
    private IMotorised motor;

    public SpeedBoat(float weight, int maxSpeed, IProduct baseProduct, IMotorised motor){
        super(weight, maxSpeed, baseProduct);
        this.hullType = "fibreglass";
        this.motor = motor;
    }

    public IMotorised getMotor() {
        return motor;
    }

    public void setMotor(IMotorised motor) {
        this.motor = motor;
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    @Override
    public void startEngine() {
        this.motor.startEngine();
    }

    @Override
    public void stopEngine() {
        this.motor.startEngine();
    }

    @Override
    public int getHp() {
        return this.motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.motor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.motor.setFuel(fuel);
    }

}

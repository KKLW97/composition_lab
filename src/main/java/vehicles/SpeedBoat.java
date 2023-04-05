package vehicles;

import products.IProduct;

public class SpeedBoat extends Vehicle implements IWaterVehicle{
    private String hullType;
    private IMotorised motor;

    public SpeedBoat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motor){
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
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

}

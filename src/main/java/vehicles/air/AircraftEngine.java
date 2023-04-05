package vehicles.air;

import vehicles.IMotorised;

public class AircraftEngine implements IMotorised {
    private int fuel;
    private int hp;

    public AircraftEngine(int fuel, int hp, int numberOfEngines){
        this.fuel = fuel;
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }



    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine eStopped");
    }
}

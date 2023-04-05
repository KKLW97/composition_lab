package vehicles.air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {
        int getThrust();
        void setThrust(int thrust);

}

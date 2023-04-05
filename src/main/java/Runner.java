import products.IProduct;
import products.Product;
import vehicles.Bicycle;
import vehicles.Car;
import vehicles.Engine;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<IProduct> vehicles = new ArrayList<>();

        Bicycle bike = new Bicycle(10, 20, new Product(350, 6, "BMX"));

        vehicles.add(bike);

        Car car = new Car(2000, 120, new Product(500000, 2, "BMW"), new Engine(100, 190));

        vehicles.add(car);


    }

}

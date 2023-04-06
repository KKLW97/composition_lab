import products.IProduct;
import products.Product;
import vehicles.land.Bicycle;
import vehicles.land.Car;
import vehicles.Engine;
import vehicles.water.Kayak;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<IProduct> vehicles = new ArrayList<>();

        Bicycle bike = new Bicycle(10, 20, new Product(350, 6, "BMX"));

        vehicles.add(bike);

        Car car = new Car(2000, 120, new Product(500000, 2, "BMW"), new Engine(100, 190));

        vehicles.add(car);

        Kayak kayak = new Kayak(30,20, new Product(400,8,"9t Sit On Kayak"));
        vehicles.add(kayak);
        kayak.setPrice(500);
        System.out.println(vehicles);
    }

}

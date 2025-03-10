import com.app.Car;
import com.app.Driver;

import java.io.*;

public class Main {
    public static void main(String argv[]) {
        Car car = new Car("Peugeot", "306");
        Driver didier = new Driver("didier");

        car.sitPilot(didier);
        car.unmountWheel(0);
        car.drive();


        System.out.println(car);
    }
}
import com.app.*;
import java.io.*;

public class Main {
    public static void main(String argv[]) {
        Car car = new Car("Peugeot", "306");
        HumanDriver didier = new HumanDriver("didier", "dupont");
        RobotDriver r2d2 = new RobotDriver("r2d2", "1.0");

        car.sitPilot(didier);
        car.sitCopilot(r2d2);

    }
}
import main.core.Airline;
import main.utils.fileHandler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;

public class Main {
    public static void main(String[] args) {
        List<Airline> airlines = new ArrayList<Airline>();

        Airline airline1= new Airline(1, "Iberia", "ES", true);
        airlines.add(airline1);

        fileHandler f1 = new fileHandler();
        f1.loadFi leContent();
    }
}
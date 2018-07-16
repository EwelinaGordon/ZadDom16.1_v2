package SmartHomePackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa {

    public int temperature;
    public boolean isSunny;

    public StacjaPogodowa() {
        this.temperature = getTemperatura();
        this.isSunny = isSunny();
        System.out.println("Stacja pogodowa pobiera informacje o temperaturze");
    }


    public int getTemperatura() {
        return random(-25, 35);
    }

    public boolean isSunny() {
        Random random = new Random();
        return random.nextBoolean();
    }

    private int random(int from, int to) {
        Random random = new Random();
        int a = Math.abs(from);
        return random.nextInt(a + to + 1) - to;
    }
}
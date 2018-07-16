package SmartHomePackage;

import org.springframework.stereotype.Component;

@Component
public class SterownikPieca implements Sterownik {

    public StacjaPogodowa stacjaPogodowa;

    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void action() {

        int temperatura = stacjaPogodowa.temperature;
        if (temperatura > 15) {
            System.out.println("Jest ciepło. Nie uruchamiam pieca.");
        } else {
            System.out.println("Jest zimno. Uruchamiam piec.");
        }
    }
}

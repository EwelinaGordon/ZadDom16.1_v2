package SmartHomePackage;

import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika implements Sterownik {

    public StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void action() {
        int temperatura = stacjaPogodowa.temperature;
        boolean isSunny = stacjaPogodowa.isSunny;

        String text = "";

        if (isSunny) {
            text = "jest";
        } else {
            text = "nie jest";
        }
        System.out.println("Dzień dobry. Dzisiejsza temperatura " + temperatura + "*C i " + text + " słonecznie. " +
                "To będzie dobry dzień!");
    }

}
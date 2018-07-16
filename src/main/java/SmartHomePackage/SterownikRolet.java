package SmartHomePackage;


import org.springframework.stereotype.Component;

@Component
public class SterownikRolet implements Sterownik{

    public StacjaPogodowa stacjaPogodowa;

    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void action() {
        boolean isSunny = stacjaPogodowa.isSunny;
        if (isSunny) {
            System.out.println("Jest słonecznie. Zasłaniam rolety.");
        } else {
            System.out.println("Jest pochmurno. Nie zasłaniam rolety.");
        }
    }
}
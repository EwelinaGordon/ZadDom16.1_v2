package SmartHomePackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SmartHome {

    @Autowired
    List<Sterownik> sterowniki;


    public void uruchomSterowniki() {
        for (Sterownik sterownik : sterowniki) {
            sterownik.action();


        }
    }
}

package SmartHomePackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        SmartHome smartHome = ctx.getBean(SmartHome.class);
        smartHome.uruchomSterowniki();

    }
}

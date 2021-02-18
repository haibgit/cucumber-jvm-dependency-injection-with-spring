package hainv.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.io.File;

@PropertySource("application.properties")
@ComponentScan("hainv.demo")
public class Config {

    public static String getPathApp() {
        String path = System.getProperty("user.dir") + File.separator + "apps" + File.separator;
        System.out.println("->>>> path of app is " + path);
        return path;

    }
}

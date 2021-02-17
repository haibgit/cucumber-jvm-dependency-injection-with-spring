package hainv.demo.aut.implementations.ios;

import hainv.demo.aut.model.CaculatorHomePage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("ios")
public class IOSCaculatorHomePage implements CaculatorHomePage {
    private final WebDriver driver;
    @Value("${aut.urls.home}")
    private String homePageUrl;

    @Autowired
    public IOSCaculatorHomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void tinhTong(int x, int y) {

    }


}

package hainv.demo.aut.implementations.android;

import hainv.demo.aut.model.CaculatorHomePage;
import io.appium.java_client.AppiumDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("android")
public class AndroidCaculatorHomePage implements CaculatorHomePage {
//  @Value("${aut.urls.home}")
//  private String homePageUrl;

    private final AppiumDriver driver;

    @Autowired
    public AndroidCaculatorHomePage(AppiumDriver driver) {
        this.driver = driver;
    }

    @Override
    public void tinhTong(int x, int y) {

    }


}

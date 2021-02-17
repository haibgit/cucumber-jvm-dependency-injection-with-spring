package hainv.demo.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Configuration
public class AndroidDriver {
    @Value("${browser.mobile.width}")
    private int mobileWidth;

    @Value("${browser.mobile.height}")
    private int mobileHeight;

    @Value("${browser.mobile.useragent}")
    private String userAgent;


    @Bean
    @Profile("android")
    public AppiumDriver getDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "platform");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "");
        capabilities.setCapability(MobileCapabilityType.APP, "");
        AppiumDriver driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }
}

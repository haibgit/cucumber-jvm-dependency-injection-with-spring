package hainv.demo.driver;

import hainv.demo.config.Config;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
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
    @Value("${android.app}")
    private String androidApp;

    @Value("${android.version}")
    private String version;

    @Value("${android.deviceName}")
    private String devices;

    @Bean
    @Profile("android")
    public AppiumDriver getDriver() throws MalformedURLException {
        String app = Config.getPathApp() + androidApp;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, devices);
        capabilities.setCapability(MobileCapabilityType.APP, app);
        AppiumDriver driver = new AppiumDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }
}

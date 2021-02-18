package hainv.demo.aut.implementations.android;

import hainv.demo.aut.model.CaculatorHomePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component
//@Profile("android")
public class AndroidCaculatorHomePage extends aaaa implements CaculatorHomePage {
    private final AppiumDriver driver;

    //    @Autowired
    public AndroidCaculatorHomePage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
    }

    @Override
    public void tinhTong(int x, int y) {
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + x)).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + y)).click();
    }

}

package hainv.demo.aut.implementations.android;

import hainv.demo.aut.model.ResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component
//@Profile("android")
public class AndroidResultsPage extends aaaa implements ResultsPage {
    private final WebDriver driver;

    @Autowired
    public AndroidResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getResult() {
        String value = driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
        System.out.println("->>>> result is " + value);
        return value;
    }
}

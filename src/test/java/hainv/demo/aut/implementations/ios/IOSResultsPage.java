package hainv.demo.aut.implementations.ios;

import hainv.demo.aut.model.ResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("ios")
public class IOSResultsPage implements ResultsPage {
    private final WebDriver driver;

    @Autowired
    public IOSResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public String getResult() {
        return driver.findElement(By.cssSelector("ol#b_results > li > h2 > a")).getText();
    }
}

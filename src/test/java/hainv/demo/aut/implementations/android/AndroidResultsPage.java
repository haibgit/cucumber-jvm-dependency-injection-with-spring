package hainv.demo.aut.implementations.android;

import hainv.demo.aut.model.ResultsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("android")
public class AndroidResultsPage implements ResultsPage {
  private final WebDriver driver;

  @Autowired
  public AndroidResultsPage(WebDriver driver) {
    this.driver = driver;
  }

  @Override
  public String getResult() {
    driver.findElement(By.cssSelector("ol#b_results")); //waits for the results to be displayed
    return driver.findElement(By.cssSelector("ol#b_results > li.b_algo > div > a > h2")).getText();
  }
}

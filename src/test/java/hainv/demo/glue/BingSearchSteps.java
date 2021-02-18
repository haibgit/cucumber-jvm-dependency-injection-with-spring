package hainv.demo.glue;

import hainv.demo.aut.model.CaculatorHomePage;
import hainv.demo.aut.model.ResultsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class BingSearchSteps {
    private final CaculatorHomePage caculatorHomePage;
    private final ResultsPage resultsPage;

    @Autowired
    public BingSearchSteps(CaculatorHomePage caculatorHomePage, ResultsPage resultsPage) {
        this.caculatorHomePage = caculatorHomePage;
        this.resultsPage = resultsPage;
    }

    @When("I enter two number is {int} and {int}")
    public void iEnterTwoNumberIsAnd(int num1, int num2) {
        caculatorHomePage.tinhTong(num1, num2);
    }

    @Then("I see result is {int}")
    public void iSeeResultIs(int result) {
        Assert.assertEquals(resultsPage.getResult(), String.valueOf(result));

    }


}

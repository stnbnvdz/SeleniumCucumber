package steps;

import engine.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStepDefs {

    private WebDriver driver;

    public MyStepDefs (Driver driver){
        this.driver = driver.get();
    }


    @Given("I redirect to google page")
    public void iRedirect(){
        driver.get("https://www.google.com/");
    }

    @When("I enter {string}")
    public void iEnter(String arg0) {
        driver.findElement(By.xpath(".//input[@title='Search']"))
                .sendKeys("MST Connect");
        System.out.println("");
    }

    @When("I click search")
    public void iClickSearch() {
        driver.findElement(By.xpath(".//span[text()='mst connect']")).click();
    }

    @Then("the google search should be displayed")
    public void theGoogleSearchShouldBeDisplayed() {
       String verifyFacebookText = driver.findElement(By.
                xpath(".//h3[text()='MST Connect - Home | Facebook']")).getText();
        Assert.assertEquals("MST Connect - Home", verifyFacebookText);
    }
}
package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Steps {

	public static WebDriver driver;

@Given("User is on Register Page")
public void user_is_on_register_page() {
   
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/reg");
}

@When("user enters first name and last name")
public void user_enters_first_name_and_last_name() {
    driver.findElement(By.name("firstname")).sendKeys("vaibhav");
    driver.findElement(By.name("lastname")).sendKeys("patil");
	
}

}

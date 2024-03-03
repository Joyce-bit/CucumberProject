package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginStepDefinition {
	
	WebDriver driver;

	@Given("User is in login page")
	public void user_is_in_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@When("User enter valid email")
	public void user_enter_valid_email() throws InterruptedException {
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}

	@When("User enter valid password")
	public void user_enter_valid_password() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("User should be able to login to the application sucessfully")
	public void user_should_be_able_to_login_to_the_application_sucessfully() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("User has successfully login to the application");
		
		
	}
}

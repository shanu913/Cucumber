package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FeatureSteps {

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		System.out.println("user is on home page");
		
		System.out.println("user is on login page");
	}
	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String username, String password) 
	{
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	}
	@Then("user should be logged in")
	public void user_should_be_logged_in() 
	{
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	}
	@Then("user gets the right title of the page")
	public void user_gets_the_right_title_of_the_page() 
	{
		String ExpetedTitle="Login - My Store";
				
		String ActualTitle=driver.getTitle();
		
		System.out.println("Actual title is =" +ActualTitle);
		
		if (ExpetedTitle.equalsIgnoreCase(ActualTitle))
		{
			System.out.println("Title verified");
		}
		
		else
		{
			System.out.println("Title not verified");
		}
	}


}

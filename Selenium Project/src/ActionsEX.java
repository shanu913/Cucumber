import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsEX {

	@Test

	public void window() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome driver 96\\Chrome 102\\chromedriver_win32\\chromedriver.exe" ); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
		Actions action=new Actions(driver);
		
		WebElement element= driver.findElement(By.xpath("//a[@id='menu_time_viewTimeModule']"));
		
		WebElement buzz= driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		
		Thread.sleep(1000);
		
		
		
		action.moveToElement(element).build().perform();
		
		action.moveToElement(buzz).click().build().perform();
		
		WebElement admin= driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']"));
		
		
		action.moveToElement(admin).click().keyDown(Keys.SHIFT).sendKeys("this is test").build().perform();
	}
}

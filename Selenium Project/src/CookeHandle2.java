import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CookeHandle2 {
	WebDriver driver;
	Set<Cookie> cookies=null;

@Test
	
	public void aindow() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome driver 96\\Chrome 102\\chromedriver_win32\\chromedriver.exe" ); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7827693940");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("9661365370");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		
		
		cookies=driver.manage().getCookies();
		
		System.out.println(cookies);
		driver.close();
		Thread.sleep(1000);
		driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome driver 96\\Chrome 102\\chromedriver_win32\\chromedriver.exe" );
		driver.get("https://www.flipkart.com/");

		//driver.manage().window().maximize();
				
		for(Cookie cookie:cookies)
		  {
		driver.manage().addCookie(cookie);
		 }
		driver.get("https://www.flipkart.com/");

		driver.navigate().refresh();
		}	
}

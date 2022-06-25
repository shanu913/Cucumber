import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {
	
	@Test
	
	public void window() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome driver 96\\chromedriver_win32_100\\chromedriver.exe" ); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.manage().window().getSize());
		
		Dimension d=new Dimension(480, 600);
		
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());
		
		
		}
	
		
		
		
		 
	}



import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class WindowHandles {
	
	@Test
	
	public void window() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome driver 96\\Chrome 102\\chromedriver_win32\\chromedriver.exe" ); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		
		String parent=driver.getWindowHandle();
		//Thread.sleep(1000);
		System.out.println(parent);
		
		Set<String> s= driver.getWindowHandles();
		System.out.println(s);
		
		for (String windows: s)
		{
			System.out.println("child is " + windows);
			String title=driver.switchTo().window(windows).getTitle();
			
			System.out.println("title is = " +title);
			
			if (title.contains("facebook"));
			
			System.out.println(driver.getCurrentUrl());
			
			
			if(!parent.equalsIgnoreCase(windows))
			{
				
				driver.close();
			}
		
		}
		
		driver.switchTo().window(parent);
		String open=driver.getCurrentUrl();
		System.out.println("open window is =" + open);
		
	}
		
		
		
		
		 
	}



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DimensionClass {
@Test
	
	public void window() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium\\\\Chrome driver 96\\\\Chrome 102\\\\chromedriver_win32\\\\chromedriver.exe" ); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.manage().window().getSize());
		
		Dimension d=new Dimension(480, 600);
		
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());
		
		
	}	
		
		
		 
	}





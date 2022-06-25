import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CookieHandle {
	
@Test
	
	public void window() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome driver 96\\Chrome 102\\chromedriver_win32\\chromedriver.exe" ); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//Set<Cookie> cookies=driver.manage().getCookies();
		Cookie cobj= new Cookie("mycookie", "123456");
		driver.manage().addCookie(cobj);
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("Cookie size is " + cookies.size());
		
		for (Cookie getcookie: cookies)
		{
			System.out.println(getcookie.getName() + ":" + getcookie.getValue());
			driver.manage().addCookie(getcookie);
		}
		
		driver.manage().deleteAllCookies();
		
		cookies=driver.manage().getCookies();
		
		System.out.println("Cookeies is = " + cookies);
		
		driver.navigate().refresh();
}

}
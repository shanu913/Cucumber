import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailLogin {
	
	
	/*
	 * @Test
	 * 
	 * public void main() throws InterruptedException { System.setProperty(
	 * "webdriver.chrome.driver","D:\\Selenium\\Chrome driver 96\\chromedriver.exe"
	 * ); WebDriver driver=new ChromeDriver();
	 * driver.get("https://www.facebook.com/");
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys(
	 * "u1tst1@gmail.com");
	 * driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9661365370");
	 * driver.findElement(By.
	 * xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).
	 * click();
	 * 
	 * //Thread.sleep(1000); //System.out.println(driver.getTitle());
	 * 
	 * Thread.sleep(1000);
	 * 
	 * //driver.findElement(By.
	 * xpath("// div [@class='bp9cbjyn j83agx80 datstx6m taijpn5t oi9244e8 d74ut37n dt6l4hlj aferqb4h q5xnexhs']"
	 * )).click();
	 * 
	 * 
	 * if(driver.findElement(By.
	 * xpath("// div [@class='bp9cbjyn j83agx80 datstx6m taijpn5t oi9244e8 d74ut37n dt6l4hlj aferqb4h q5xnexhs']"
	 * )).isDisplayed()) { System.out.println("login success"); }
	 * 
	 * else { System.out.println("login failed"); } }
	 */
	
	@Test(dataProvider="testdata")
	public void Testlogin(String uname,String password){
	 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Chrome driver 96\\chromedriver.exe" ); 
		WebDriver driver=new ChromeDriver();
	 
	 
	// Maximize browser
	driver.manage().window().maximize();
	 
	 
	// Load application
	driver.get("http://www.facebook.com");
	 
	 
	// clear email field
	 
	driver.findElement(By.id("email")).clear();
	 
	 
	// Enter usename
	driver.findElement(By.id("email")).sendKeys(uname);
	 
	 
	 
	// Clear password field
	driver.findElement(By.id("pass")).clear();
	 
	 
	 
	// Enter password
	driver.findElement(By.id("pass")).sendKeys(password);
	}
	 
	// this is DataProvider which actually feed data to our test cases here I have taken 2 D //array with 2 rows and 2 column it means. It will run our test case two times because we //have taken 2 rows. While first iteration this will pass username and password to test //case and in second iteration perform the same for second rows
	//"testdata" is the function name which is passing the data
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
	 
	 
	// Create object array with 2 rows and 2 column- first parameter is row and second is //column
		//Rows - Number of times your test has to be repeated.
		//Columns - Number of parameters in test data.
	Object [][] facebookdata=new Object[1][2];
	 
	 
	 
	// Enter data to row 0 column 0
	facebookdata[0][0]="Selenium1@gmail.com";
	 
	 
	 
	// Enter data to row 0 column 1
	facebookdata[0][1]="Password1";
	 
	 
	 
//	// Enter data to row 1 column 0
//	facebookdata[1][0]="Selenium2@gmail.com";
//	 
//	// Enter data to row 1 column 0
//	facebookdata[1][1]="Password2";
	 
	// return arrayobject to testscript
	return facebookdata;
	}

}

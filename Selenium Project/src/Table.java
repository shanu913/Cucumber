import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {

		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome driver 96\\Chrome 102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowcount= driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		int colcount= driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		
		System.out.println("row= " + rowcount + "col=" + colcount);
		
		boolean flag=false;
		
		for (int i=1; i<rowcount; i++)
		{
			for (int j =1; j<=colcount; j++)
			{
				String actValue=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				if (actValue.equals("Canada"))
				{
					flag=true;
					System.out.println(i+"  :  " +j);
					break;
				}
			}
		}
		
		
	}
}

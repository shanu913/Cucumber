import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebtable {

	public static void main(String[] args) throws InterruptedException {

		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Chrome driver 96\\Chrome 102\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//String input = "Contact";
		
		List<WebElement> rno = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr"));
		
		int rsize=rno.size();
		System.out.println(rsize);

		List<WebElement> cno = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th"));
		
		int csize=cno.size();
		
		System.out.println(csize);
		
		String val=	driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr[2]/td[1]")).getText();
		
		System.out.println(val);
		
		
		  //Print all values 
			
		for (int r=1; r<=rsize; r++) 
		{ 
			for(int c=1; c<=csize; c++) 
			{ 
				String data1=driver.findElement(By.xpath("//table[@class='ws-table-all']//tr["+r+"]/td["+c+"]")).getText(); 
				System.out.println(data1);
			}
	
		}

		
//		for (int r=1; r<=7; r++)
//		{
//			String val1=driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr["+r+"]/td[1]")).getText();
//			
//			if (val1.equals("Alfreds Futterkiste"))
//			{
//				String version=	driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr["+r+"]/td[2]")).getText();
//				String version1=	driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr["+r+"]/td[3]")).getText();
//				
//				System.out.println(val1+""   +version  +version1 );
//			}
//		}

		// List<WebElement> rno=
		// driver.findElements(By.xpath(".//table[@class='ws-table-all']/tbody/tr"));

		// boolean status=false;
		// int size=rno.size();

		// System.out.println(size);

		/*
		 * for (int i = 1; i <= 3; i++) { String sValue = null; sValue =
		 * driver.findElement(By.xpath(".//table[@class='ws-table-all']/tbody/tr[1]/th["
		 * + i + "]")) .getText();
		 * 
		 * System.out.println(sValue);
		 * 
		 * if (sValue.equalsIgnoreCase(input)) { for (int j = 1; j <= 6; j++) { String
		 * sRowValue = driver .findElement(By.xpath(
		 * ".//table[@class='ws-table-all']/tbody/tr[\"+j+\"]/td[\"+i+\"]")) .getText();
		 * System.out.println(sRowValue);
		 * 
		 * } break; } }
		 */
	}

}/*
	 * for (WebElement item:rno ) { String str= item.getText();
	 * 
	 * System.out.println(str);
	 * 
	 * if (str.contains("Ernst Handel Roland Mendel Austria")); { status=true;
	 * break; }
	 */

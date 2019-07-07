package practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");

		WebElement table=driver.findElement(By.id("product"));
		List <WebElement> Rows = table.findElements(By.tagName("tr"));
		int TotalRows = Rows.size();
		System.out.println("Row count: " + (TotalRows-1));
		
		List <WebElement> FirstColumn = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th"));
		System.out.println("Column count: " + FirstColumn.size());

		List<WebElement> Secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(Secondrow.get(0).getText() + " | " + Secondrow.get(1).getText() + " | " + Secondrow.get(2).getText() );
		

		}

		}




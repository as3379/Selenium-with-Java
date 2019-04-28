package testcases;
	import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.apache.commons.io.FileUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Setup{

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
	 //System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Executables\\chromedriver.exe");
						WebDriverManager.chromedriver().setup();
	       ChromeDriver driver = new ChromeDriver();
	       String url = "https://www.wikipedia.org/";
			driver.get(url);;

	// take each and every tag which have id attribute inside the list
	//List<WebElement> Tags = driver.findElements(By.cssSelector("[id]"));
	//List<WebElement> Tags = driver.findElements(By.tagName("div"));
	List<WebElement> Tags = driver.findElements(By.xpath("//*"));
	// if in case you want to work with xpath please use By.xpath("//*[@id]")

	// Print the size of the tags
	System.out.println("Total number of tags in the given website URL:" + Tags.size());
	Date d = new Date();
	String fileName = d.toString().replace(":", "/").replace(" ", "/") + ".jpg";
File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Screenshot, new File(".//screenshot//" + fileName));
	        }
}




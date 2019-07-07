package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Selenium_Executables\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.ksrtc.in/oprs-web/");
WebElement From = driver.findElement(By.id("fromPlaceName"));
From.sendKeys("Beng");

/*From.sendKeys(Keys.DOWN);
From.sendKeys(Keys.DOWN);
From.sendKeys(Keys.DOWN);*/

JavascriptExecutor js = (JavascriptExecutor)driver;
String location = "return document.getElementById(\"fromPlaceName\").value;";
String text = (String) js.executeScript(location);

while(!text.equalsIgnoreCase("CHIKKALSANDRA BENGALURU")) {
	From.sendKeys(Keys.DOWN);
	
	text = (String) js.executeScript(location);
	System.out.println(text);

}

//From.click();
//driver.close();
	}

}

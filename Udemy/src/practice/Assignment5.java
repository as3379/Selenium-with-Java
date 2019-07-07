package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement Suggestive = driver.findElement(By.id("autocomplete"));
		Suggestive.sendKeys("unit");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String location = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(location);
		
		int i=0;

		while(!text.equalsIgnoreCase("United States"))

		{

		i++;

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		text = (String) js.executeScript(location);

		System.out.println(text);

		if(i>10)

		{

		break;

		}
		
		driver.close();

		
	}}}

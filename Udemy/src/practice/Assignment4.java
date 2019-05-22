package practice;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		//System.out.println(driver.findElement(By.linkText("New Window")).getText());
		//System.out.println(driver.getTitle());
		System.out.println("Text from child window: " + driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentid);
		//System.out.println(driver.getTitle());
		System.out.println("Text from parent window: " + driver.findElement(By.xpath("//div/h3")).getText());
		driver.quit();

	}

}

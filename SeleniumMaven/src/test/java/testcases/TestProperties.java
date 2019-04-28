package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestProperties {
	
	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\Properties\\OR.properties");
        OR.load(fis);
       
        fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\Properties\\Config.properties");
        Config.load(fis);
        
		if (Config.getProperty("browser").equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (Config.getProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(Config.getProperty("browser").equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.get(Config.getProperty("testsiteurl"));
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implict.wait")),TimeUnit.SECONDS);
		driver.findElement(By.id(OR.getProperty("email_ID"))).sendKeys("ashrayasd");
		driver.findElement(By.xpath(OR.getProperty("nextBtn_XPATH"))).click();
		driver.findElement(By.xpath(OR.getProperty("password_XPATH"))).sendKeys("abcd");
		
		
	}
}
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Declaring Globally
		//Properties OR = new Properties();
		/* 
 System.out.println(Config.getProperty("testsiteurl"));
	}

}*/
 
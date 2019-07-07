package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class MultipleFrames {



public static void main(String[] args) {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Selenium_Executables\\chromedriver.exe");



WebDriver driver=new ChromeDriver();

driver.get("https://www.spotify.com/ca-en/signup/");

driver.manage().window().maximize();

System.out.println(driver.findElements(By.tagName("iframe")).size());

int count=driver.findElements(By.tagName("iframe")).size();

for(int i=0;i<count;i++)

{

driver.switchTo().frame(i);

int framecount=driver.findElements(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).size();

if(framecount>0)

{

driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();

break;

}

driver.switchTo().defaultContent();

}

driver.switchTo().defaultContent();

int secondcount=driver.findElements(By.tagName("iframe")).size();



for(int i=0;i<secondcount;i++)



{

driver.switchTo().frame(i);

int secframe=driver.findElements(By.xpath("//*[text()='Verify']")).size();

if(secframe>0)

{

driver.findElement(By.xpath("//*[text()='Verify']")).click();

break;

}

driver.switchTo().defaultContent();

}

driver.switchTo().defaultContent();

}



}
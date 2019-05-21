package practice;

import org.openqa.selenium.By;



import org.openqa.selenium.Keys;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;



import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.support.ui.Select;



public class Assignment1 {



public static void main(String[] args) {



// TODO Auto-generated method stub



	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Executables\\chromedriver.exe");


WebDriver driver=new ChromeDriver();



driver.get("http://www.cleartrip.com/");



driver.findElement(By.id("DepartDate")).click();



driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();


Select s = new Select(driver.findElement(By.id("Adults")));

s.selectByValue("2");




Select a = new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));

a.selectByValue("2");



driver.findElement(By.xpath("//a[@title='More search options']")).click();


// Choosing Airline from drop down
driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Air India");


// Final search
driver.findElement(By.id("SearchBtn")).click();

// Getting error message

System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());



}



}
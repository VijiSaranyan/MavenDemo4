package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.redbus.in/");
	       driver.manage().window().maximize();

        //js.executeScript("window.scrollBy(0,4000)");
        
       //Find element by link text and store in variable "Element"   
	      // WebElement a=driver.findElement(By.xpath("//*[@id='our_distribution_div']/div/ul/li[2]/span[1]/span"));
        WebElement a=driver.findElement(By.xpath("//span[@class='flagicon icon-IND']"));
      //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", a);
       //js.executeScript("arguments[0].scrollIntoView();", Element);





}
}

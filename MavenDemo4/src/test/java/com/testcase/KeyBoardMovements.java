package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardMovements {
	@Test(priority=1)
	public void login() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	//driver.manage().window().maximize();
	WebElement a=driver.findElement(By.id("src"));
	WebElement b=driver.findElement(By.id("src"));
	WebElement c=driver.findElement(By.id("src"));
	WebElement d=driver.findElement(By.id("src"));


	Actions action=new Actions(driver);
	action.sendKeys("Chennai");
	action.moveToElement(a).build().perform();
	a.clear();
	a.click();
	Thread.sleep(3000);

	
	action.sendKeys("Koyambedu,Chennai");
	action.moveToElement(b).perform();
     b.clear();
     b.click();
 	 Thread.sleep(3000);

     
     action.sendKeys("CMBT,Chennai");
     action.moveToElement(c).perform();
     c.clear();
     c.click();
  	 Thread.sleep(3000);

     
     
     action.sendKeys("Tambaram","Chennai");
     action.moveToElement(d).perform();
     d.clear();
     d.click();
  	 Thread.sleep(3000);

     
     driver.close();



	

	

}
	
}

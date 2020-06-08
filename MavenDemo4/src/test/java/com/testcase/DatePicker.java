package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	@Test
	public void login() {
	WebDriverManager.chromedriver().setup();

	//WebDriverManager.chromedriver.setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/	");
	driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
	driver.findElement(By.xpath("//td[contains(text(),'16')]")).click();
}
}


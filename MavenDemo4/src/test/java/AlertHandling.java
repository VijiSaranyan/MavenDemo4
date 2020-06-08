import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	@Test
	public void login() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.get("http://demo.guru99.com/test/delete_customer.php");
       driver.manage().window().maximize();
       driver.findElement(By.name("submit")).click();
       Alert alert=driver.switchTo().alert();
    

       System.out.println(alert.getText());
       //alert.accept();
       alert.dismiss();

}
}

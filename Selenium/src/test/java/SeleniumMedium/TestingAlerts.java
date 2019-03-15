package SeleniumMedium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingAlerts {

	public static void main(String[] args) {
		// Testing Alert, confirm and prompt

		WebDriver driver = new FirefoxDriver(); // create a Firefox driver object(driver)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // It will be apply for any element
		driver.get("http://localhost/test/testpage.php");
		// accessing alerts
		driver.findElement(By.id("alert")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		// Accessing confirm
		driver.findElement(By.id("confirm")).click();
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		if (driver.findElement(By.id("demo")).getText().contains("OK")) {
			System.out.println("The confirm OK is work properly");
		} else {
			System.out.println("You did not confirmed");
		}

		// Working by Prompt button
		
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert().sendKeys("Babek");
		driver.switchTo().alert().accept();
		if(driver.findElement(By.id("demo")).getText().contains("Babek")) {
			System.out.println("Prompt with the OK button is working properly");
		}else{
				System.out.println("Prompt with the OK button  is not working properly");

				
			}
		}
	}



package SeleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OverMouseAndGetBackGroundColor {

	public static void main(String[] args) {
		// This program will over mouse on a link and check whether the background color
		// is change to yellow

		WebDriver driver = new ChromeDriver(); // create a Chrome driver object(driver)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // It will be apply for any element

		driver.get("http://localhost/test/testpage.php");
		WebElement googleLink = driver.findElement(By.partialLinkText("Open Google"));
		Actions action = new Actions(driver);
		String bgColor = googleLink.getCssValue("background-color");
		System.out.println("Background color before over mouse  is:" + bgColor);
		action.moveToElement(googleLink).build().perform();
		bgColor = googleLink.getCssValue("background-color");
		System.out.println("Background color after over mouse  is:" + bgColor);

	}

}

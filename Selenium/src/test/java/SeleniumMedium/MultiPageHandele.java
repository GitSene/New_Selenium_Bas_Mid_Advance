package SeleniumMedium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiPageHandele {

	public static void main(String[] args) {
		String YahooID=null ;
				// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); // create a Firefox driver object(driver)
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // It will be apply for any element

		driver.get("http://localhost/test/testpage.php");
		String homePageID = driver.getWindowHandle();
	
		System.out.println("HomePage ID:" + homePageID);
		driver.findElement(By.partialLinkText("open Yahoo page")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String currID : driver.getWindowHandles()) {
			// System.out.println(currID);
			if (! currID.contains(homePageID)) {
				YahooID = currID;
			}
		}
		System.out.println("Yahoo ID:" + YahooID);
		driver.switchTo().window(YahooID);
		driver.findElement(By.id("uh-search-box")).sendKeys("Babek Chalabiyanli");
		driver.findElement(By.id("uh-search-button")).click();
		driver.switchTo().window(homePageID);
		//driver.close(); // close current window
		driver.quit();// close all winodws

	}
}

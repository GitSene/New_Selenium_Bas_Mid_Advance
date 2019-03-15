package advancedJava;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ResizeAndSlider {

	public static void main(String[] args) throws Exception {
		//
		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);
		// driver.get("https://jqueryui.com/resizable/"); // resize
		driver.get("https://jqueryui.com/slider/#colorpicker"); // slide

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		// WebElement drag =
		// driver.findElement(By.xpath("//div[@id='resizable']/div[3]")); // resize

		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		
		action.clickAndHold(drag).moveByOffset(100, 0).build().perform();
		

		File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		Files.copy(scr1, new File("C:\\Users\\Babek Chalabi\\Desktop\\Scr\\screen1.png"));
		
		Thread.sleep(5000);
		
		action.clickAndHold(drag).moveByOffset(-150, 0).build().perform();

		Thread.sleep(5000);
		
		
				
		
		File scr2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		Files.copy(scr2, new File("C:\\Users\\Babek Chalabi\\Desktop\\Scr\\screen2.png"));

		driver.quit();

	}

}

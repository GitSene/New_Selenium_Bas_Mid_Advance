package SeleniumAdvance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotToDownload {

		public static void main(String[] args) throws AWTException {
			// This Selenium Java program is to drag and drop elements using Robot Java Class
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

			driver.get("http://localhost/test/testPage2.php");
			driver.findElement(By.partialLinkText("click to download the lession")).click();	
			
			Robot robot = new Robot();
			robot.delay(4000);
			robot.keyPress(KeyEvent.VK_DOWN); // press down arrow key
			robot.delay(4000);
			//robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB); // press TAB key
			robot.delay(4000);
			robot.keyPress(KeyEvent.VK_ENTER); // Press Enter
	}

}

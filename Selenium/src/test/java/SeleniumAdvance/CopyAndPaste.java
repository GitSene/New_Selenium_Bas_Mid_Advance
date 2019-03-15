package SeleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); // create a Firefox driver object(driver)
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // It will be apply for any element

		driver.get("http://localhost/test/testpage.php");
		WebElement nameElement = driver.findElement(By.name("name"));
		WebElement commentElement = driver.findElement(By.name("comment"));
		
		//using action library copy text from nameElement
		Actions action = new Actions(driver);
		action.moveToElement(nameElement).doubleClick().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").perform();
		action.keyUp(Keys.CONTROL).perform();
		action.click(commentElement).perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").perform();
		action.keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.SHIFT).sendKeys(" Hello").keyUp(Keys.SHIFT).perform();
		
		/*Actions action = new Actions(driver);
		action.moveToElement(nameElement).doubleClick().build();
		action.keyDown(Keys.CONTROL).
		sendKeys("c").
		keyUp(Keys.CONTROL).
		click(commentElement).
		keyDown(Keys.CONTROL).
		sendKeys("v").
		keyUp(Keys.CONTROL).
		keyDown(Keys.SHIFT).
		sendKeys("hello").
		keyUp(Keys.SHIFT).build().perform();*/
		
		
		
		
		
		

		
	  }


	}


	



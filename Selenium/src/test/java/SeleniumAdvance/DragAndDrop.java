package SeleniumAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver.", )

       Actions action = new Actions(driver);
       driver.get("https://jqueryui.com/droppable/");
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.switchTo().frame(0); // there just one frame so its = 0
       
       WebElement drag = driver.findElement(By.id("draggable"));
       WebElement drop = driver.findElement(By.id("droppable"));
       
       action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
       
       //action.doubleClick(drag);
       //Thread.sleep(5000);
       //action.contextClick(drag);
       //Thread.sleep(5000);
       //action.dragAndDrop(drag, drop).perform();
       
       Thread.sleep(5000);
       
       driver.quit();
       

       
       

	}

}

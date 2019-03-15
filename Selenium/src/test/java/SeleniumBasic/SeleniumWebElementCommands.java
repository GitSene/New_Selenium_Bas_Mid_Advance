package SeleniumBasic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebElementCommands {

	public static void main(String[] args) {
		// Learning web element commands
		// System.getProperty("webdriver.gecko.driver", "C:\\Users\\Babek
		// Chalabi\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		WebElement userName = driver.findElement(By.name("userName"));
		userName.clear(); // if it has text, it will clear it
		userName.click(); // clicking the element if it is able to be clicked
		System.out.println("user name box size is: " + userName.getAttribute("size"));// to get attribute value of that
																						// element
		System.out.println("user name input type is: " + userName.getAttribute("type"));
		Point location = userName.getLocation();
		System.out.println("Input box is located at: " + "x=" + location.x + "  and y=" + location.y);
		Dimension size = userName.getSize(); // to get size of the element
		System.out.println("Size of input box is: " + size.height + " , " + size.width);
		System.out.println("Size of the user name element is: " + userName.getTagName());
		System.out.println("Text of Sign on link is: " + driver.findElement(By.linkText("SIGN-ON")).getText());
		if (userName.isDisplayed()) {
			System.out.println("Yes Use Name is visible on the current page");
		} else {
			System.out.println("Element is visible on the current page");
		}
		if (userName.isEnabled()) {
			System.out.println("Element is active on th screen");
		} else {
			System.out.println("Element is not active on th screen");
		}
		if (userName.isSelected()) {
			System.out.println("Element is selected ");
		} else {
			System.out.println("Element is not selected ");
		}
		System.out.println("Bckground color of user name is: " + userName.getCssValue("background-color"));
		userName.sendKeys("Babek"); // to type on the element

	}

}

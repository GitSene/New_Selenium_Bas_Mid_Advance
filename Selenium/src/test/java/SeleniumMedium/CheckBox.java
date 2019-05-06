package SeleniumMedium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); // create a Firefox driver object(driver)
		driver.get("http://localhost/test/testpage.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// It will be apply for any element
		
	     List<WebElement> checkBoxs = driver.findElements(By.cssSelector("input[type ='checkbox']"));
		//WebElement checkBoxs = driver.findElements(By.cssSelector("input[type ='checkbox']"));
		for (WebElement checkBox : checkBoxs) {
			if (checkBox.isSelected()) {
				checkBox.click();
			}
			if (checkBox.getAttribute("value").contains("Bike")) {
				checkBox.click();

			}
		}

	}

}

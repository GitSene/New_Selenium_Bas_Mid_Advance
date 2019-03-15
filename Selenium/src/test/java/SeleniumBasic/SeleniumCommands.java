package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumCommands {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver(); // create a Firefox driver object(driver)
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		/*String title = driver.getTitle(); 
		System.out.println(title);
		Assert.assertEquals(" Welcome: Mercury Tours", title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);*/
		 

		driver.findElement(By.linkText("REGISTER")).click();

		Select dropcountry = new Select(driver.findElement(By.name("country")));

		driver.findElement(By.name("firstName")).sendKeys("Babek");
		driver.findElement(By.name("lastName")).sendKeys("Habibi");
		driver.findElement(By.name("userName")).sendKeys("babek.fr@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("22418 bush");
		driver.findElement(By.name("city")).sendKeys("Aldie");
		driver.findElement(By.name("postalCode")).sendKeys("20105");
		dropcountry.selectByVisibleText("TURKEY");
		// type user name on user name apt box
		driver.findElement(By.name("email")).sendKeys("Babek");
		driver.findElement(By.name("password")).sendKeys("abc");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.RETURN);// to void unsecured connection error
		driver.findElement(By.linkText("register")).submit();
		driver.close();

	}

}

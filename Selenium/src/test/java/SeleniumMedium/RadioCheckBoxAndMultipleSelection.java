package SeleniumMedium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioCheckBoxAndMultipleSelection {

	public static void main(String[] args) {
		// How to test Radio button, check Box, list box and Multiple Selection

		WebDriver driver = new FirefoxDriver(); // create a Firefox driver object(driver)
		driver.get("http://localhost/test/testpage.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// It will be apply for any element

		// Testing radio Box
		driver.findElement(By.name("country")).sendKeys("USA");
		driver.findElement(By.xpath(".//select/option[@value ='INDIA']")).click();
		driver.findElement(By.name("country")).findElement(By.cssSelector("option[value='ETHIOPIA']")).click();

		// multiple selections
		driver.findElement(By.xpath("/html/body/form/select[2]/option[3]")).click();
		driver.findElement(By.xpath("/html/body/form/select[2]/option[4]")).click();

		// selection options
		Select skill = new Select(driver.findElement(By.name("skill")));
		skill.deselectAll();
		skill.selectByIndex(1);
		skill.selectByValue("db");
		skill.selectByVisibleText("Business Administration");
		driver.close();

		System.out.println("Test is passed");

	}

}

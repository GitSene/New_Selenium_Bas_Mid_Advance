package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class SelenioumAssertByTitle {
	public static void  main(String[] args) {
		// Selenioum get title() command and assertion
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		String title = driver.getTitle();
		if(title.contains("Welcome: Mercury Tours")) {
			System.out.println("I am in the right page");
		}else{
			System.out.println("I am in the wrong page");
		}
		
		// special way of assertion
		Assert.assertTrue(title.contains("Welcome: Mercury Tours"));
	            System.out.println(title);
	}

}

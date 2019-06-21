package SeleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	System.getProperty("webdriver.gecko.driver","C:\\Users\\babek\\git\\Selenioum-\\Selenium\\geckodriver.exe");
	 driver.get("http://newtours.demoaut.com/");
	 driver.findElement(By.name("userName")).sendKeys("a");
	 driver.findElement(By.name("password")).sendKeys("a");
	 driver.findElement(By.name("login")).click();
	 try {
		 Thread.sleep(5000);
	 } catch (InterruptedException e) {
		 e.printStackTrace();
	 }
	 
	 if(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed()){
		 System.out.println("Login was successful");
	 
	 }else {
		 System.out.println("Login was not successful");
	 }
	}

}

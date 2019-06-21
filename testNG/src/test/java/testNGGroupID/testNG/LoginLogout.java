package testNGGroupID.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Test
public class LoginLogout {
 @Test(dataProvider = "dp")
  public void logingTestWithCorrectCredentials(String n, String s) {
	 // System.out.println("Open newtours page");
	  //System.out.println("Type UserName="+  n + " and Password=" + s);
	 // System.out.println("Assert login");
	 // System.out.println("Lgout");
	     //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Babek Chalabi\\Desktop\\Selenium\\geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	     driver.get("http://newtours.demoaut.com/");
		 driver.findElement(By.name("userName")).sendKeys(n);
		 driver.findElement(By.name("password")).sendKeys(s);
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
  
 @Parameters({"browserName", "userName"})
 
  @BeforeTest 
  public void SelectBrowser(String broweser, String name ){
	//String broweser ="Fairefox";
	 System.out.println("Hi " + name);
	if(broweser.contains("Fairefox")) {
		System.out.println("Use Firefox");
		
	}else if(broweser.contains("IE")) {
		System.out.println("Use IE");
		
	}else if(broweser.contains("Chorome")) {
		System.out.println("Use Chorome");
	}
}
public void myTestCase() {
System.out.println("----test is runing");
}
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "a", "a" },
      new Object[] { "b", "b" },
      new Object[] { "c", "c" },
      new Object[] { "d", "d" },
    };
  }
}

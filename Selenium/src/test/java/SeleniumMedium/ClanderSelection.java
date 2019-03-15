package SeleniumMedium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClanderSelection {

	public static void main(String[] args) throws Exception {
		// how to test calender 
		
			WebDriver driver = new FirefoxDriver(); // create a Firefox driver object(driver)
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     // It will be apply for any element
            driver.get("https://www.google.com/flights");
			Thread.sleep(5000);
            driver.findElement(By.cssSelector(".gws-flights-form__calendar-icon")).click();
           //Selenium  action class
            //driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div[5]/div/two-month-calendar/div/div/calendar-month[1]/month-header/jsl")).getText();
            //driver.findElement(By.cssSelector("div.gws-travel-calendar__flipper:nth-child(2)"));
            WebElement month = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div[5]/div/two-month-calendar/div/div/calendar-month[1]/month-header/jsl"));
            WebElement next = driver.findElement(By.cssSelector("div.gws-travel-calendar__flipper:nth-child(2)"));
            while(!month.getText().contains("December")) {
            	next.click();
            }
            	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div[5]/div/two-month-calendar/div/div/calendar-month[1]/calendar-week[5]/calendar-day[4]/div[3]")).click();
            	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div[5]/div/two-month-calendar/div/div/calendar-month[1]/calendar-week[5]/calendar-day[4]/div[3]")).click();
                String record = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div[5]/div/div[4]/div[2]/div[1]/date-input/input")).getText();
                	if(record.contains("Wed, Dec 26")) {
                System.out.println("Calendar works successfully");
                	
                	
                }
            
	}

}

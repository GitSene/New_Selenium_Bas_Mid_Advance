package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login_Send_Logout {

	public WebDriver driver;

	public void OpenURL() {
		driver = new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // if you need wait for several elements 
		driver.get("http://gmail.com");
		driver.manage().window().maximize();

	}

	public void Gmail_Login() throws Exception {
		driver.findElement(By.id("identifierId")).sendKeys("babek.fr");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Tabriz1945");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(15000);
		driver.findElement(
				By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.name("to")).sendKeys("babekch@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("subjectbox")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[@id=\":pb\"]")).sendKeys("Hi Babek this is just a Selenium Test");
		Thread.sleep(15000);
		driver.findElement(By.id(":nw")).click();
		Thread.sleep(15000);// explicit 

	}

	public void Gmail_Logout() throws Exception {
		driver.findElement(
				By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/header/div[2]/div[3]/div/div[2]/div/a/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.id("gb_71")).click();

	}

	public static void main(String[] args) throws Exception {
		Gmail_Login_Send_Logout babek = new Gmail_Login_Send_Logout();
		babek.OpenURL();
		babek.Gmail_Login();
		babek.Gmail_Logout();
	}
}

package testNGGroupID.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class loginTest {
@BeforeSuite
public void beforeSuite() {
	System.out.println("/////This suite will run only one time at starting point");
}
@AfterSuite
public void afterSuite() {
	System.out.println("////This suite will run only one time after your suite");
}
@BeforeTest
public void beforeTest() {
	System.out.println("=========This part will run before test is going to be run");
}
@AfterTest
public void AfterTest() {
	System.out.println("=========This code will run after test complete");
}
@BeforeClass
public void beforeClass() {
	System.out.println("++++++This code will run before class begining");
}
@AfterClass
public void afterClass() {
	System.out.println("++++++This code will run after class begining");
}

@BeforeMethod
public void opennewtoursHomePage() {
	System.out.println("Open Firefox");
	System.out.println("Open Newtours page");
	
}
@AfterMethod
public void closenewtoursPage() {
	System.out.println("Close browser");
}
  @Test
  public void loginTestWithCorreentCredencials() {
	  System.out.println(".....Type correct user name =a");
	  System.out.println(".....Type correct password =a");
	  System.out.println(".....Click Sign in button");
	  System.out.println(".....Asserrt login is succesfull");
	  System.out.println(".....Log out from newtours page");
	  
  }
  @Test
  public void loginTestWithWrongCredencials() {
	  System.out.println("-----Type wrong user name =abc");
	  System.out.println("-----Type wrong password =abcd");
	  System.out.println("-----Click Sign in button");
	  System.out.println("-----Asserrt login is not succesfull");
	  System.out.println("-----Log out from newtours page");
	 
  }
  
}

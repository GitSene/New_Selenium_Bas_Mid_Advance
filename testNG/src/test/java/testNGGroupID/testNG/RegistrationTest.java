package testNGGroupID.testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class RegistrationTest {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("/////suite code from registration");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("////suite code from registration");
	}
	@BeforeGroups
	
	public void beforeGroup() {
		System.out.println("////run before group start");
	}
	
  @Test(dependsOnMethods = {"emailTest2"}, priority=4)
  public void emailTest1() {
	  System.out.println("email and phone with the email qwede@gmail.com");
	  
  }
  @Test(priority=1)
  public void emailTest2() {
	  System.out.println("email and phone with the email vdgsdiuhun@gmail.com");
	  Assert.assertEquals("Babek", "John"); // will fail
  }
  
  @Test(dependsOnMethods = {"emailTest2"},priority=2)
  public void emailTest3() {
	  System.out.println("email with the email #@$%^%@gmail.com");
  }
  @Test(priority=2)
  public void emailTest4() {
	  System.out.println("email with the email FTHRNFsgmail.com");
  }
  
  @Test(priority=3)
  public void phoneTest1() {
	  System.out.println("email and phone with the 24hohohi4");
  }
  @Test(priority=4)
  public void phoneTest2() {
	  System.out.println("phone with the ' ' ");
  }
  
  @Test(priority=2)
  public void phoneTest3() {
	  System.out.println("phone and email with the hgjhfjghsg");
  }
  
  @Test(dependsOnMethods = {"emailTest2"},priority=1)
  public void phoneTest4() {
	  System.out.println("phone with the 34527890873");
  }
  
  }
  
  
  
  

  

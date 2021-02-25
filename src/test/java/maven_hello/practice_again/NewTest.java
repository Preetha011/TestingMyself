package maven_hello.practice_again;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest {
	
	WebDriver driver = null;
	
	@BeforeClass
	public void beforeExecute() {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			
		    driver = new ChromeDriver();
	}
	
  @Test(groups = ( "smoke"))
  public void hello() {
	  
	driver.get("https://www.google.com/");
	Assert.assertEquals(driver.getTitle(), "Google");
	System.out.println("Title matches");
		
}
  @Test(groups = ("smoke"))
  public void hi() {
	 driver.get("https://www.facebook.com/");
		
  }
  
  @Test(groups = ("functional"))
  
  public void hey() {
		 driver.get("https://intellipaat.com/");
			
	  }
  
  @Test(groups = ("functional"))
  
  public void heyo() {
	  
	  driver.get("https://www.selenium.dev/");
  }
  
  
  
  @Test
  public void check() {
	  
	  String s1 = "Hello";
	  String s2 = "Hello";
	  //int t1= 10;
	  //int t2= 20;
      Assert.assertEquals(s1, s2);
      //Assert.assertTrue("Condition failed" ,t1>t2);
	  
  }
  
  
  @AfterClass
  public void afterExecute() {
	   driver.close();
  }
  
  

  
  
  
  
  
}

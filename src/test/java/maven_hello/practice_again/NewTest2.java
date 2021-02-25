package maven_hello.practice_again;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest2 {
	
	WebDriver a = null; 
	
	@BeforeClass
	public void beforeExecute() {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			
		   a = new ChromeDriver();
	}
	
  @Test(priority=2)
  public void hello2() {
	  
	a.get("https://www.google.com/");
	Assert.assertEquals(a.getTitle(), "Google");
	System.out.println("Title matches");
		
}
  @Test(priority=1)
  public void hi2() {
	 a.get("https://www.facebook.com/");
		
  }
  
  @Test(priority=3)
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
	   a.close();
  }
  
  

  
  
  
  
  
}

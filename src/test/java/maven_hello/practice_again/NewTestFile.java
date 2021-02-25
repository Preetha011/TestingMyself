package maven_hello.practice_again;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTestFile {
public WebDriver driver;
	
	/*Test Scenario I:  File Upload
Step-1 Launch Chrome Browser
Step-2 Open Test URL https://smallpdf.com/word-to-pdf
Step-3 Click on ChooseFile Button
Step-4 Automate Window Alert by Uploading File  
Step-5 Specify Java Wait to Complete file Conversion and Download button get's displayed 
Step-6 Click on Download Button
Step-5 Close Browser
*/
	@Test (priority =1)
	public void Assignment1() throws InterruptedException, AWTException{
		//Step-1 Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\intellipaat-chat\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe" );
		driver = new ChromeDriver();
		
		//Step-2 Open Test URL https://smallpdf.com/word-to-pdf
		driver.get("https://smallpdf.com/word-to-pdf");
		Thread.sleep(3000);
		
		//Step-3 Click on ChooseFile Button
		driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]")).click();
		
		//Step-4 Automate Window Alert by Uploading File
		StringSelection s = new StringSelection("C:\\Users\\intellipaat-chat\\Desktop\\ToUpload.docx"
				+ "");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		//r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(6000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		
		//Step-5 Specify Java Wait to Complete file Conversion and Download button get's displayed
		
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Thread.sleep(6000);
		//Step-6 Click on Download Button
		driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();
		Thread.sleep(3000);
		
		driver.close();
					
		}
		
	@Test (priority=2)
	public void Assignment2() throws InterruptedException, AWTException {
		
		/* Test Scenario I:  File Upload
Step-1 Launch Chrome Browser
Step-2 Open Test URL https://smallpdf.com/word-to-pdf
Step-3 Click on ChooseFile Button
Step-4 Automate Window Alert by Uploading File  
Step-5 Specify implicit Wait to Complete file Conversion and Download button get's displayed 
Step-6 Click on Download Button
Step-5 Close Browser
*/
		//Step-1 Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\intellipaat-chat\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe" );
				driver = new ChromeDriver();
				
		//Step-2 Open Test URL https://smallpdf.com/word-to-pdf
		driver.get("https://smallpdf.com/word-to-pdf");
		Thread.sleep(3000);
		
		//Step-3 Click on ChooseFile Button
		driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]")).click();
		
		//Step-4 Automate Window Alert by Uploading File
		

		StringSelection str = new StringSelection("C:\\Users\\intellipaat-chat\\Desktop\\ToUpload.docx"
				+ "");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(6000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		
		//Step-5 Specify implicit Wait to Complete file Conversion and Download button get's displayed 
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		//Step-6 Click on Download Button
		driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();
		Thread.sleep(3000);
		
		//Step-5 Close Browser
		driver.close();
		
		
	}


}


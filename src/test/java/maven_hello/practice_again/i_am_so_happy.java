package maven_hello.practice_again;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class i_am_so_happy {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		
		a.sendKeys("mobile phones");
		a.submit();
		
		List <WebElement> my_list = driver.findElements(By.xpath("//*[@id=\"search\"]//h2/a"));
		
		List<WebElement> my_list2 = driver.findElements(By.xpath("//*[@id=\"search\"]//a/span/span[2]/span[2]"));
		
		
		System.out.println(my_list.size());
		
		System.out.println(my_list2.size());
		
		
		
		
		for(int i=0; i<my_list.size(); i++) {
			
			String myString = my_list.get(i).getText();
			System.out.println(myString);
		}
		
		
		for(int j=0; j<my_list2.size(); j++) {
			String mystring2 = my_list2.get(j).getText();
			
			System.out.println(mystring2);
		}
		
		
		WritableWorkbook newFile = Workbook.createWorkbook(new File("C:\\Users\\intellipaat-chat\\eclipse-workspace\\Tours\\src\\Tours_Package\\mynewlist.xls"));
		
		WritableSheet sheet = newFile.createSheet("Amazon Scrapping", 0);
		
		Label value1 = new Label(0,0,"List of Mobile phones");
		Label value2 = new Label(1,0,"Price listings");
		
		sheet.addCell(value1);
		sheet.addCell(value2);
		
		
			for(int k=0; k<my_list.size(); k++) {
					String myString3 = my_list.get(k).getText();
					Label hey = new Label(0,k,myString3);
					sheet.addCell(hey);
			}
			
			for(int n=0; n<my_list2.size(); n++) {
					
					String myString4 = my_list2.get(n).getText();
					Label hello = new Label(1,n,myString4);
					sheet.addCell(hello);
			}
			
			
		newFile.write();
		newFile.close();
		
		

	}

}

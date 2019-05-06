package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class A 
{
   public static void main(String[] args) 
  {
	   System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/webtabble.html");
		driver.manage().window().maximize();
		List<WebElement> ls=driver.findElements(By.tagName("tr"));
		int rows=ls.size();
		System.out.println("no of rows are"+rows);
		
		for(WebElement row:ls)
		{
			List<WebElement> coloumns=row.findElements(By.tagName("td"));
			for(WebElement col:coloumns)
			{
				System.out.println(col.getText());
			}
		}
	
   }

}

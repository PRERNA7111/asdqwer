package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sun2 
{


	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//to find number of frames in webpage
		List<WebElement> ls= driver.findElements(By.tagName("iframe"));
		int count=ls.size();
		System.out.println("no of iframes are=="+count);
		
		//to switch driver focous to java iframe
		driver.switchTo().frame(0);
		
		//use drag and drop(source, target)
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions action =new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
		//to generate javascript alert
		JavascriptExecutor ext=(JavascriptExecutor)driver;
		ext.executeScript("alert('Element drag and drop succesfully');");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//to move focous of driver from java iframe to original webpage
		driver.switchTo().defaultContent();
		
		//to click on about button
		driver.findElement(By.linkText("About"));
		String title=driver.getTitle();
		System.out.println("title of webpage is=="+title);
		
		//to close driver
		driver.close();
		
		
		
		
		
	}

}

package action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//drag and drop by

public class sun1 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
		driver.manage().window().maximize();
		
		//finding element locator
		WebElement draggable=driver.findElement(By.id("dragdiv"));
		
		//MOVE ELEMENT BY 100 PIXEL IN HORIZANTALDRIECTION
		Actions action=new Actions(driver);
		action.dragAndDropBy(draggable,150 , 0).build().perform();
		
		//to generate javascript alert
		JavascriptExecutor javascript=(JavascriptExecutor)driver;
		javascript.executeScript("alert('Element is moved in x direction by 100 pixels');");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);;
		
		//move element in vertival direction by shortcut
		new Actions(driver).dragAndDropBy(draggable, 0, 100).build().perform();
		
		//alert
		javascript.executeScript("alert('Element is moved in y direction by 100 pixels');");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//move element to original position
		new Actions(driver).dragAndDropBy(draggable, -150, -100).build().perform();
		javascript.executeScript("alert('Element is moved in x and y  direction by 100 pixels');");
		driver.switchTo().alert().accept();
		
		
		

	}

}

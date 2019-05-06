package action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sat 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//number of hyperlink
		List<WebElement> ls=driver.findElements(By.tagName("a"));
		int count=ls.size();
		System.out.println("Number of hyperlink on webpage are"+count);
		
		//title
		String title=driver.getTitle();
		System.out.println("Title of webpage is"+title);
		
		//curren url
		String url=driver.getCurrentUrl();
		System.out.println("current url of webpage is"+url);
		
		//for double click on your amazon
		WebElement youramazon=driver.findElement(By.id("nav-your-amazon"));
		Actions action1=new Actions(driver);
		action1.doubleClick(youramazon).build().perform();
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		String title1=driver.getTitle();
		System.out.println("title1 of webpage is"+title1);
		driver.navigate().back();
		
		//right click
		/*WebElement customersc=driver.findElement(By.linkText("Customer Service"));
		Actions action2=new Actions(driver);
		Action rightclick=action2.contextClick(customersc).build();
		rightclick.perform();
		Thread.sleep(500);*/
		
		
		//MOVE TO ELEMENT
		WebElement yourorders=driver.findElement(By.xpath("//span[@class='nav-line-1'][.='Hello, Sign in']"));
		Actions action3=new Actions(driver);
		Action mousehover=action3.moveToElement(yourorders).build();
		Thread.sleep(500);
		mousehover.perform();
		
		driver.findElement(By.xpath("//span[@class='nav-text'][.='Your Orders']"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement email=driver.findElement(By.name("email"));
		boolean act_flag=email.isDisplayed();
		if(act_flag==true)
		{
			email.sendKeys("prerna7111@gmail.com");
		}
		System.out.println("email entered in text box is"+act_flag);
		
		
		
	}

}

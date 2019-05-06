package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//EXPLICIT WAIT
public class C 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		//GET TITLE
		String title=driver.getTitle();
		System.out.println("title of webpage is"+title);
		
		WebDriverWait wait=new WebDriverWait(driver,15);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(//input[@name='firstname']));
		
		//String firstname=driver.findElement(By.xpath(//input[@name='firstname']));
		//firstname.sendKeys("Prerna");
				
		
		
	}

}

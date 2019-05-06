package DAY1;
//facebook login
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class chrome 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title=	driver.getTitle();
		System.out.println(title);
		String url=	driver.getCurrentUrl();
		System.out.println(url);
		/*WebElement e=driver.findElement(By.name("email"));
		e.sendKeys("abc");
		
		WebElement e1=driver.findElement(By.id("u_0_2"));
		e1.click();*/
		
		WebElement e=driver.findElement(By.name("firstname"));
		e.sendKeys("PRERNA");
		
		//WebElement e1=driver.findElement(By.id("u_0_2"));
		//e1.click();
		
		WebElement e1=driver.findElement(By.name("lastname"));
		e1.sendKeys("KUMBHARE");
		
		WebElement e2=driver.findElement(By.name("reg_email__"));
		e2.sendKeys("prernakumbhare@gmail.com");
		
		WebElement e4=driver.findElement(By.name("reg_email_confirmation__"));
		e4.sendKeys("prernakumbhare@gmail.com");
		
		
		WebElement e3=driver.findElement(By.name("reg_passwd__"));
		e3.sendKeys("abcdefgh123");
		
		Select s=new Select(driver.findElement(By.id("day")));
		s.selectByVisibleText("17");
		
		Select s1=new Select(driver.findElement(By.id("month")));
		s1.selectByVisibleText("Aug");
		
		Select s2=new Select(driver.findElement(By.id("year")));
		s2.selectByVisibleText("1992");
		
		driver.findElement(By.cssSelector("label[for='u_0_9']")).click();
		WebElement login = driver.findElement(By.id("Signup"));
		login.click();
		driver.findElement(By.id("Signup")).submit();

		
		
		
	}

}

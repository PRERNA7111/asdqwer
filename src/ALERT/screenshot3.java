package ALERT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot3 {

	public static void main(String[] args) throws InterruptedException
	{   //browser up
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//title and url
		String title=driver.getTitle();
		System.out.println("Webpage title is"+title);
		String url=	driver.getCurrentUrl();
		System.out.println("url of webpage is"+url);
		Thread.sleep(5000);
		
		Screenshotdemo sc=new Screenshotdemo();
		sc.CaptureScreenshot("loginfacebook",".png");
		Config.driver.findElement(By.linkText("forgotten account?"));
		Config.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		sc.CaptureScreenshot("findyraccount", ".png");
		Config.driver.navigate().back();
		
		
		
		
		
	
	}
	

}

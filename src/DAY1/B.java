package DAY1;
import org.openqa.selenium.By;
//inspect html code
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class B 
{
	public static void main(String[] args) 
	{   
		//brower up and maximize
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Newt.html");
		driver.manage().window().maximize();
		String title=	driver.getTitle();
		System.out.println("Title of page is "+title);
		String url=	driver.getCurrentUrl();
		System.out.println("url of current page is"+url);
		
		//label of username
        WebElement unamelb=driver.findElement(By.xpath("//label[@for='Username']"));
        String unlb=unamelb.getText();
        WebElement username=driver.findElement(By.id("Username"));
        username.sendKeys("prerna");
        String ab=username.getAttribute("value");
        System.out.println(ab+"username entered in text box");
        
        
        
        //
        
	}

}

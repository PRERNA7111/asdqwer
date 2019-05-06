package DAY1;
//navigate wala code
//google to naukri then naukri to google

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title=	driver.getTitle();
		System.out.println("Webpage title is"+title);
		String url=	driver.getCurrentUrl();
		System.out.println("the url is"+url);
		String winkey=driver.getWindowHandle();
		System.out.println("the window key is"+winkey);
		//System.out.println("pagesource"+driver.getPageSource());
		driver.navigate().to("https://www.naukri.com");
		String title1=driver.getTitle();
		System.out.println("naukri webpage title"+title1);
		driver.navigate().back();
		String title2=driver.getTitle();
		System.out.println("after navigating from naukri"+title2);
		driver.navigate().forward();
		String title3=driver.getTitle();
		System.out.println("after navigating to naukri from google"+title3);
		driver.quit();
		
		
		
	}

}

package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		
		Set<Cookie> cookies=driver.manage().getCookies();
		for(Cookie cookie:cookies)
		{
			System.out.println("cookie name is"+cookie.getName());
			
			System.out.println("COOKIE VALUE IS"+cookie.getValue());
			
			System.out.println("cookie path is"+cookie.getPath());
			
			System.out.println("domain name of cookie is"+cookie.getDomain());
			
			System.out.println("the expiry date of cookie is"+cookie.getExpiry());
			
			System.out.println("cookie class is "+cookie.getClass());
			
			System.out.println("is http  "+cookie.isHttpOnly());
			
			System.out.println("cookie is secure or not "+cookie.isSecure());	
		}
		
		//here all cookies are deleted
		//driver.manage().deleteAllCookies();
		
		//new cookie is added
		Cookie cookie=new Cookie("username","prerna");
		driver.manage().addCookie(cookie);
		//Cookie name=driver.manage().getCookieNamed("username");
		//System.out.println("name=="+name);*/
		
		//delete one cookie
		driver.manage().deleteCookieNamed("S");
		driver.manage().deleteCookieNamed("SN");
		Cookie cookienm=driver.manage().getCookieNamed("T");
		Thread.sleep(5000);
		System.out.println(cookienm.getName());
		
		
		
	}

}

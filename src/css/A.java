package css;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/TESTING/text%20document/css.html");
		//maximize
		driver.manage().window().maximize();
		
		//to get current url
        String url=driver.getCurrentUrl();
        System.out.println("url 1 is"+url);
        
        //to find no of hyberlinks
        List<WebElement> list=driver.findElements(By.tagName("a"));
        int count=list.size();
        System.out.println("no of hyperlink on webpage are=="+count);
        
        //for username label
        WebElement userlb=driver.findElement(By.cssSelector("label[for='uname']"));
        String usernmlb=userlb.getText();
        System.out.println("username label is=="+usernmlb);
        
        //for username textbox
        WebElement username=driver.findElement(By.cssSelector("input#uid"));
        username.sendKeys("Prerna");
        String usernm=username.getAttribute("value");
        System.out.println("usernam entered in textbox=="+usernm);
        
        //for password label
        WebElement password=driver.findElement(By.cssSelector("label[for='password']"));
        String passlb=password.getText();
        System.out.println("password label is"+passlb);
        
        //for password textbox
        WebElement pass=driver.findElement(By.cssSelector("input#pid"));
        pass.sendKeys("abcde");
        String password1=pass.getAttribute("value");
        System.out.println("password entered is=="+password1);
        
        //for browser
        WebElement obj=driver.findElement(By.cssSelector("Select[id='browser']"));
        Select sel=new Select(obj);
        sel.selectByVisibleText("Firefox");
        
        //for login button
        driver.findElement(By.cssSelector("button[onclick^='alert']")).click();
       
        //handling alert
        driver.switchTo().alert().accept();
        driver.navigate().back();
        
        //cancel button
        driver.findElement(By.cssSelector("button[name$='bt']")).click();
        
        //forgot password
        driver.findElement(By.cssSelector("a[href*='pass']")).click();
        
        String url1=driver.getCurrentUrl();
        System.out.println("url 2 is "+url);
        driver.navigate().back();
        
        
        
        
	}

}

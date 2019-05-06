package ASSIG1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class echoecho {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().window().maximize();
        
        List<WebElement> ls=driver.findElements(By.name("group1"));
        Iterator<WebElement> itr=ls.iterator();
        while(itr.hasNext())
        {
        	WebElement elements=itr.next();
        	Thread.sleep(5000);
        	elements.click();
        	System.out.println("Group1="+elements.getAttribute("value"));
        }
        
        List<WebElement> ls1=driver.findElements(By.name("group2"));
        Iterator<WebElement> itr1=ls1.iterator();
        while(itr1.hasNext())
        {
        	WebElement elements1=itr1.next();
        	Thread.sleep(5000);
        	elements1.click();
        	System.out.println("Group2="+elements1.getAttribute("value"));
        }
        
        WebElement b=driver.findElement(By.xpath("//input[@value='Butter']"));
        b.click();
        if(true)
        {
        	driver.findElement(By.xpath("//input[@value='Water']")).click();
        }
        driver.close();
	}

}

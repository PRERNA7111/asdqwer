package scope;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redscope 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://qaclickacademy.com/practice.php");
	    driver.manage().window().maximize();
	    
	    String title=driver.getTitle();
	    System.out.println("Title of webpage is=="+title);
	    
	    //no of hyperlinks on total page
	    int count=driver.findElements(By.tagName("a")).size();
	    System.out.println("no of hyperlinks on webpage are=="+count);
	    
	    WebElement footerdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
	    int count2=footerdriver.findElements(By.tagName("a")).size();
	    System.out.println("no of hyperlinks on footerdriver are=="+count2);
	    
	    
	    WebElement coloumndriver=driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
	    int count3=coloumndriver.findElements(By.tagName("a")).size();
	    System.out.println("no of hyperlinks on column section are=="+count3);
	    
	    for(int i=1;i<count;i++)
	    {
	    	String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
	    	Thread.sleep(5000);	
	    }
	    //HANDLING MULTIPLE WINDOWS
	    Set<String> abc=driver.getWindowHandles();
	    Iterator<String> itr=abc.iterator();
	    while(itr.hasNext())
	    {
	    	driver.switchTo().window(itr.next());
	    	System.out.println(driver.getTitle());
	    }
	    
	    
	    
	}

}

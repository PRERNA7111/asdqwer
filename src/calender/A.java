package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//coz calender is in frame
		//frame index starts from 0
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input[id='datepicker']")).click();
		
		
		
		
	}	

}

package ALERT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(5000);
		String msg= driver.switchTo().alert().getText();
		System.out.println("alert msg is=="+msg);
		driver.switchTo().alert().accept();
		boolean flag=driver.findElement(By.xpath("//input[@name='proceed']")).isDisplayed();
		System.out.println("go button is diaplyed=="+flag);
		//String val=driver.findElement(By.xpath("//input[@name='proceed']")).getAttribute();
	    //System.out.println("go button value is=="+val);
		

	}

}

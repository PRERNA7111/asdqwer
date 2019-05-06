package day2;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/user/Desktop/New%20Text%20Document2.html");
		driver.manage().window().maximize();
		
		//to fetch label of first name
		//label[@for='uname']/parent::div[@class='container']
		//div[@class='container']/child::input[@id='uid']
		
		//absolute xpath to fetch label of username
		WebElement unamelb=driver.findElement(By.xpath("/html/body/center/form/div/label"));
        String unlb=unamelb.getText();
		System.out.println(unlb);
		
		//relative xpath
		//WebElement username=driver.findElement(By.xpath(//input[@placeholder='Enter Username']));
        
		
	}

}

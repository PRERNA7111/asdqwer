package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class php {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/register");
		driver.manage().window().maximize();
		
		//for first name label
		WebElement namelabel=driver.findElement(By.cssSelector("label[class='go-right']"));
		String namelb=namelabel.getText();
		System.out.println("FIRST NAME LABEL IS "+namelb);
		
		//for firstname textbox
		WebElement firstnm=driver.findElement(By.cssSelector("input[type='text']"));
		firstnm.sendKeys("PRERNA");
		String firstlb=firstnm.getAttribute("value");
		System.out.println("FIRST NAME ENTERED  IS "+firstlb);
		
		//for lastname label
		//not correct
		WebElement lastnmlb=driver.findElement(By.cssSelector("label[class='go-right']"));
		String lastlb=lastnmlb.getText();
		System.out.println("LAST NAME LABE IS "+lastlb);
		
		//for lastname textbox
		WebElement lastnm=driver.findElement(By.cssSelector("input.form-control[name='lastname']"));
		lastnm.sendKeys("KUMBHARE");
		String lastnme=lastnm.getAttribute("value");
		System.out.println("LASTNAME ENTERED IS "+lastnme);
		
		
		//for phone no
		WebElement ph=driver.findElement(By.cssSelector("input[name*='hone']"));
		ph.sendKeys("7020217749");
		String phone=ph.getAttribute("value");
		System.out.println("Enterd phone no is=="+phone);
		
		//for email textbox
		WebElement email=driver.findElement(By.cssSelector("input[name$='mail']"));
	    email.sendKeys("prerna7111@gmail.com");
	    String abc= email.getAttribute("value");
		System.out.println("entered email is=="+abc);
		
		//FOR PASSWORD TEXTBOX
		WebElement password=driver.findElement(By.cssSelector("input[placeholder^='Pass']"));
		password.sendKeys("abcde");
		String pass=password.getAttribute("value");
		System.out.println("ENTERED PASSWORD IS"+pass);
		
		//FOR CONFIRM PASSWORD TEXTBOX
		WebElement password1=driver.findElement(By.cssSelector("input[placeholder^='Con']"));
		password1.sendKeys("abcde");
		String pass1=password.getAttribute("value");
		System.out.println("ENTERED CONFIRM PASSWORD IS"+pass1);
		
		//for submit button
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		String url1=driver.getCurrentUrl();
		System.out.println("URL1 IS"+url1);
		driver.navigate().back();
		String url2=driver.getCurrentUrl();
		System.out.println("url 2 is"+url2);
		

	}

}

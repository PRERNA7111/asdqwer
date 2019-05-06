package ALERT;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot1 
{   
	public void captureScreenshot(String filename,String extension) throws IOException
	{   System.setProperty("webdriver.chrome.driver", "E:\\Cjcsoftware\\TESTING\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	
	String title=driver.getTitle();
    System.out.println("title is=="+title);
    
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String timestamp=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
	FileUtils.copyFile(src, new File("E:\\Neon Workspace\\TESTING\\screenshot\\"+filename+extension+timestamp));
	
	
	}
	public static void main(String args[]) throws IOException
	{
	   screenshot1 sc=new screenshot1();
	   sc.captureScreenshot("loginfacebook", ".jpeg");
	   
	   
        
	}
}

package DAY1;
//not run
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mozilla 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver","E:\\Cjcsoftware\\TESTING\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.mozilla.com");
	    
	}

}

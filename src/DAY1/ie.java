package DAY1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class ie 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.ie.driver", "E:\\Cjcsoftware\\TESTING\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
	    WebDriver driver=new InternetExplorerDriver();
	    driver.get("https://www.InternetExplorer.com");
	}

}

package ALERT;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshotdemo 
{
	public void CaptureScreenshot(String filename,String extension)
	{
		File src=((TakesScreenshot)Config.driver).getScreenshotAs(OutputType.FILE);
		String timestamp=new SimpleDateFormat("yy_MM_dd_hh_mm_ss").format(new Date());
		FileUtils.getFile(src,new File("E:\\Neon Workspace\\TESTING\\screenshot")+filename+timestamp+extension);
	}

}

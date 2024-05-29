package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	
	public static void captureScreen(WebDriver driver, String name) throws IOException {
		String path =System.getProperty("user.dir")+"\\Screenshot\\"+name+"__"+timestamp()+".png";
		TakesScreenshot tss = (TakesScreenshot)driver;
		File sourceFile = tss.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(path);
		FileHandler.copy(sourceFile, destinationFile);
		System.out.println("Screenshot Capture Successfully");
	}
	
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());		
	}

}

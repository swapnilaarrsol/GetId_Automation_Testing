package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonScreenShots {
	
	public static void commonCaptureScreen(WebDriver driver) throws IOException {
		String path =System.getProperty("user.dir")+"\\Screenshot\\Test3.png";
		TakesScreenshot tss = (TakesScreenshot)driver;
		File sourceFile = tss.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(path);
		FileHandler.copy(sourceFile, destinationFile);
		System.out.println("Screenshot Capture Successfully");
	}

}

package listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import pages.ScreenShots;
import tests.LoginTest1;

public class TestngListenerLogin extends LoginTest1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("This is on Test Start Action");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This is on Test Success Action");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		try {
			ScreenShots.captureScreen(driver, name);
		} catch (IOException ex) {			
			ex.printStackTrace();
		}		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This is on Test Skipped Action");
	}
}

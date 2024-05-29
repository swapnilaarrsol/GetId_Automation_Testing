package tests;

import org.testng.Assert;
import org.testng.annotations.*;

import pages.BaseClass;
import pages.LoginPage1;

@Listeners(listeners.TestngListenerLogin.class)
public class LoginTest1 extends BaseClass{
	
	public LoginPage1 lp1;
	public void initObject() {
		lp1 = new LoginPage1(driver);		
	}
	
	@BeforeClass
	public void init() throws InterruptedException {
		launchBrowser();	
		initObject();			
	}	
		
  @Test (priority=1   )
  public void testGetIdLogoDisplayEnabled() throws InterruptedException {
	  lp1.getIdLogoDisplayEnabled();
  }
  
  @Test (priority=2   )
  public void testHeadingText() throws InterruptedException {
	  lp1.headingText();	
  }
  
  @Test (priority=3   )
  public void testFunctionAvailableLoginInField() throws InterruptedException {
	  lp1.functionAvailableLoginInField();
  }
  
  @Test (priority=4   )
  public void testFunctionAvailablePasswordField() throws InterruptedException {
	  lp1.functionAvailablePasswordField();
  }
  
  @Test (priority=5   )
  public void testFunctionAvailablePasswordEyeButton() throws InterruptedException {
	  lp1.functionAvailablePasswordEyeButton();
  }
  
  @Test (priority=6   )
  public void testFunctionAvailableLoginButton() throws InterruptedException {
	  lp1.functionAvailableLoginButton();
  }
  
  @Test //(priority=7   )
  public void testLoginAndValidMessageLoginIdPassBlankData() throws InterruptedException {
	  lp1.LoginAndValidMessageLoginIdPassBlankData();
  }
  
  @Test (priority=8   )
  public void testLoginValidLoginIdPassword() throws InterruptedException {
	  lp1.LoginValidLoginIdPassword();
  }
  
  @Test (priority=9   )
  public void testLoginAndValidMessageInvalidLoginIdPassword() throws InterruptedException {
	  lp1.LoginAndValidMessageInvalidLoginIdPassword();
  }
  
  @Test (priority=10   )
  public void testLoginAndValidMessageInvalidLoginIdValidPassword() throws InterruptedException {
	  lp1.LoginAndValidMessageInvalidLoginIdValidPassword();
  }
  
  @Test (priority=11   )
  public void testLoginAndValidMessageValidLoginIdInValidPassword() throws InterruptedException {
	  lp1.LoginAndValidMessageValidLoginIdInValidPassword();
  }
  
  @Test (priority=12   )
  public void testLoginAndValidMessageValidLoginIdBlankPassword() throws InterruptedException {
	  lp1.LoginAndValidMessageValidLoginIdBlankPassword();
  }
  
  @Test (priority=13   )
  public void testLoginAndValidMessageInvalidLoginIdBlanksPassword() throws InterruptedException {
	  lp1.LoginAndValidMessageInvalidLoginIdBlankPassword();
  }
  
  @Test (priority=14   )
  public void testLoginAndValidMessageBlankLoginIdValidPassword() throws InterruptedException {
	  lp1.LoginAndValidMessageBlankLoginIdValidPassword();
  }
  
  @Test (priority=15   )
  public void testLoginAndValidMessageBlankLoginIdInvalidPassword() throws InterruptedException {
	  lp1.LoginAndValidMessageBlankLoginIdInvalidPassword();
  }
  
  @Test (priority=16, enabled=false )
  public void testPermissinPopNotificationCancleAllow() throws InterruptedException {
	  lp1.PermissinPopNotificationCancleAllow();
  }
  
  @Test (priority=17)
  public void testVerifyTitleBeforeAndAfterLogin() throws InterruptedException {
	//System.out.println("17. Verify Webpage Title Before and After Login");	
	lp1.VerifyTitleBeforeAndAfterLogin();
	
	
//	String actTitleBeforeLogin = driver.getTitle();
//	System.out.println("Actual Title Before Login : "+actTitleBeforeLogin);  Thread.sleep(2000);
//	Assert.assertEquals(actTitleBeforeLogin, "GET-ID");
//	lp1.login();
//	String actTitleAfterLogin = driver.getTitle();
//	System.out.println("Actual Title After Login : "+actTitleAfterLogin);  Thread.sleep(2000);
//	Assert.assertEquals(actTitleAfterLogin, "GET-ID");
//	lp1.logout();
//	Thread.sleep(3000);
  }
 
 @Test (priority=18)
  public void testVerifyUrlBeforeAndAfterLogin() throws InterruptedException {
	// System.out.println("18. Verify Webpage URL  Before and After Login");	
	 lp1.VerifyUrlBeforeAndAfterLogin();
	 
//	String actUrlBeforeLogin = driver.getCurrentUrl();
//	System.out.println("Actual URL : "+actUrlBeforeLogin); Thread.sleep(2000);
//	Assert.assertEquals(actUrlBeforeLogin, "https://taj888.com/login");
//	lp1.login();
//	String actUrlAfterLogin = driver.getCurrentUrl();
//	System.out.println("Actual URL : "+actUrlAfterLogin); Thread.sleep(2000);
//	Assert.assertEquals(actUrlAfterLogin, "https://taj888.com/home");
  }  
 
//// @Test (priority=19)
//// public void testFunctionalityOfButtonsAndFieldsWithTabEnterButton() throws InterruptedException {
////	 lp1.FunctionalityOfButtonsAndFieldsWithTabEnterButton();
//// }
//  
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  tearDown();
  }
  
}

package tests;

import org.testng.annotations.*;

import pages.BaseClass;
import pages.ManageIDPage1;

public class ManageIDTest1 extends BaseClass {
	
	public ManageIDPage1 mp1;
	public void initObject() {
		mp1 = new ManageIDPage1(driver);
	}
	
	@BeforeClass
	public void init() throws InterruptedException {
		launchBrowser();
		initObject();
	}
	
//	
//  @Test (priority=1)
//  public void testFunctionAvailableManageIdModule() throws InterruptedException {
//	  mp1.FunctionAvailableManageIdModule();
//  }
  
//	
//  @Test (priority=2)
//  public void testFunctionAvailableBothLogoutButtonManageID() throws InterruptedException {
//	  mp1.FunctionAvailableBothLogoutButtonManageID();
//  }
  
	
//  @Test (priority=3)
//  public void testFunctionAvailableValidMessageNotificationButtonManageID() throws InterruptedException {
//	  mp1.FunctionAvailableValidMessageNotificationButtonManageID();
//  }
	
//	 @Test (priority=4)
//	  public void testGetIdLogoDisplayedEnabledManageID() throws InterruptedException {
//		  mp1.GetIdLogoDisplayedEnabledManageID();
//	  }
	
//	@Test (priority=5)
//	  public void testFunctionalityAvailabilityPaymentMethodsMenu() throws InterruptedException {
//		  mp1.FunctionalityAvailabilityPaymentMethodsMenu();
//	  }
	
//	@Test (priority=6)
//	  public void testFunctionalityAvailabilityBanksMenu() throws InterruptedException {
//		  mp1.FunctionalityAvailabilityBanksMenu();
//	  }
	
//	@Test (priority=7)
//	  public void testFunctionAvailableSearchBoxAndButtonPaymentMethods() throws InterruptedException {
//		  mp1.FunctionAvailableSearchBoxAndButtonPaymentMethods();
//	  }
	
//	@Test (priority=8)
//	  public void testFunctionalityAvailabilityAddPaymentMethodButton() throws InterruptedException {
//		  mp1.FunctionalityAvailabilityAddPaymentMethodButton();
//	  }
	
	@Test //(priority=9)
	  public void testFunctionalityAvailabilityButtonsFieldsAddPaymentMethodDetails() throws InterruptedException {
		  mp1.FunctionalityAvailabilityButtonsFieldsAddPaymentMethodDetails();
	  }	
  
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  tearDown();
  }
}

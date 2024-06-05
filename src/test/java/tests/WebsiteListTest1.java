package tests;

import java.io.IOException;

import org.testng.annotations.*;

import pages.BaseClass;
import pages.WebsiteListPage1;

public class WebsiteListTest1 extends BaseClass {

	public WebsiteListPage1 wlp1;

	public void initObject() {
		wlp1 = new WebsiteListPage1(driver);
	}

	@BeforeClass
	public void init() throws InterruptedException {
		launchBrowser();
		initObject();
	}

//	@Test (priority=1)
//	public void testFunctionAvailableWebsiteListModule() throws InterruptedException {
//		wlp1.FunctionAvailableWebsiteListModule();
//	}
//
//  @Test (priority=2)
//  public void testFunctionAvailableBothLogoutButton() throws InterruptedException {
//	  wlp1.FunctionAvailableBothLogoutButton();
//  }
// 
//  @Test (priority=3)
//  public void testFunctionAvailableValidMessageNotificationButton() throws InterruptedException {
//	  wlp1.FunctionAvailableValidMessageNotificationButton();
//  }
//
//  @Test (priority=4)
//  public void testFunctionAvailableSearchBoxAndButton() throws InterruptedException {
//	  wlp1.FunctionAvailableSearchBoxAndButton();
//  }
//
//  @Test  (priority=5)
//  public void testGetIdLogoDisplayedEnabled() throws InterruptedException {
//	  wlp1.GetIdLogoDisplayedEnabled();
//  }
//	
//	@Test (priority=6)
//	public void testHeadingText() throws InterruptedException {
//		wlp1.HeadingText();
//	}
//	
//	@Test (priority=7)
//	public void testFunctionAvailableAddWebsiteButton() throws InterruptedException {
//		wlp1.FunctionAvailableAddWebsiteButton();
//	}
//	
//	@Test (priority=8)
//	public void testFieldsAvailabilityAddNewWebsiteAllFields() throws InterruptedException {
//		wlp1.FieldsAvailabilityAddNewWebsiteAllFields();
//	}
//	
//	@Test (priority=9)
//	public void testFieldsEnabledAddNewWebsiteAllFields() throws InterruptedException {
//		wlp1.FieldsEnabledAddNewWebsiteAllFields();
//	}
//	
//	@Test (priority=10)
//	public void testFunctionalityAddNewWebsiteAllFieldsValidData() throws InterruptedException {
//		wlp1.FunctionalityAddNewWebsiteAllFieldsValidData();
//	}
//	
//	@Test (priority=11)
//	public void testFunctionValidMessageOfDuplicateWebSlugDatabaseSecret() throws InterruptedException, IOException {
//		wlp1.FunctionValidMessageOfDuplicateWebSlugDatabaseSecret();
//	}
//	
//	@Test (priority=12)
//	public void testValidationMessageForMandatoryFieldsWithoutData() throws InterruptedException, IOException {
//		wlp1.ValidationMessageForMandatoryFieldsWithoutData();
//	}
//
//	@Test (priority=13)
//	public void testFunctionalityValidationMessageMandatoryFieldsWithInvalidData() throws InterruptedException, IOException {
//		wlp1.FunctionalityValidationMessageMandatoryFieldsWithInvalidData();
//	}
//	
//	@Test (priority=14)
//	public void testFunctionalityValidationMessageForAllFieldsWithInvalidData() throws InterruptedException, IOException {
//		wlp1.FunctionalityValidationMessageForAllFieldsWithInvalidData();
//	}
//	
//	@Test (priority=15)
//	public void testFunctionalityAvailableCancleSubmitCloseButton() throws InterruptedException, IOException {
//		wlp1.FunctionalityAvailableCancleSubmitCloseButton();
//	}
//	
//	@Test (priority=16)
//	public void testValidationMessageAfterCompleteAddWebsiteDetails() throws InterruptedException, IOException {
//		wlp1.ValidationMessageAfterCompleteAddWebsiteDetails();
//	}
//	
//	@Test (priority=17)
//	public void testFunctionalityAvailabilityValidationMessaseStatusToggleKey() throws InterruptedException, IOException {
//		wlp1.FunctionalityAvailabilityValidationMessaseStatusToggleKey();
//	}
//	
//	@Test (priority=18)
//	public void testFunctionalityAvailabilityActionDropdownButton() throws InterruptedException, IOException {
//		wlp1.FunctionalityAvailabilityActionDropdownButton();
//	}
//	
//	@Test (priority=19)
//	public void testFunctionAvailableValidationMessageCopyDetails() throws InterruptedException, IOException {
//		wlp1.FunctionAvailableValidationMessageCopyDetails();
//	}
//	
//	@Test (priority=20)
//	public void testFunctionAvailableValidationMessageEditButton() throws InterruptedException, IOException {
//		wlp1.FunctionAvailableValidationMessageEditButton();
//	}
//	
//	@Test (priority=21)
//	public void testFunctionAvailableValidationMessageDeleteButton() throws InterruptedException, IOException {
//		wlp1.FunctionAvailableValidationMessageDeleteButton();
//	}
//	
//	@Test (priority=22)
//	public void testDeleteButtonIsPresentOnlyStatusIsInactive() throws InterruptedException, IOException {
//		wlp1.DeleteButtonIsPresentOnlyStatusIsInactive();
//	}
//	
//	@Test (priority=23)
//	public void testFunctionAvailabelTotalNumberOfWebsiteEntriesDropdown() throws InterruptedException, IOException {
//		wlp1.FunctionAvailabelTotalNumberOfWebsiteEntriesDropdown();
//	}
//	
//	@Test (priority=24)
//	public void testFunctionAvailabelPagesPreviousNextButton() throws InterruptedException, IOException {
//		wlp1.FunctionAvailabelPagesPreviousNextButton();
//	}
	
//	@Test //(priority=25, enabled=false)
//	public void testFunctionalityOfButtonsFieldsWithTabEnterKeyUptoAddWebsiteDetails() throws InterruptedException, IOException {
//		wlp1.FunctionalityOfButtonsFieldsWithTabEnterKeyUptoAddWebsiteDetails();
//	}
	
//	@Test //(priority=26, enabled=false)
//	public void testFunctionalityOfButtonsFieldsTabEnterKeyStatusAction() throws InterruptedException, IOException {
//		wlp1.FunctionalityOfButtonsFieldsTabEnterKeyStatusAction();
//	}
	
	@Test //(priority=27, enabled=false)
	public void testFunctionalityOfButtonsFieldsTabEnterKeyPagination() throws InterruptedException, IOException {
		wlp1.FunctionalityOfButtonsFieldsTabEnterKeyPagination();
	}
	
//	@AfterClass
//	public void closeBrowser() throws InterruptedException {
//		tearDown();
//	}
}

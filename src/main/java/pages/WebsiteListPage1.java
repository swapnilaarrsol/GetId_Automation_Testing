package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.Assert;

public class WebsiteListPage1 {

	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Enter Login ID']")
	private WebElement LoginIdField;

	@FindBy(xpath = "//input[@placeholder='Enter Password']")
	private WebElement PasswordField;

	@FindBy(xpath = "//button[@class='btn btn-primary w-100']")
	private WebElement LoginButton;

	@FindBy(xpath = "//span[text()='Website List']")
	private WebElement WebsiteList;

	@FindBy(xpath = "//h1[@class='tag-heading']")
	private WebElement HeadingWebsiteList;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement SearchBox;

	@FindBy(xpath = "//img[@alt='search-icon']")
	private WebElement SearchButton;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	private WebElement AddWebsiteButton;

	@FindBy(xpath = "//input[@placeholder='Enter Website Name']")
	private WebElement WebsiteName;

	@FindBy(xpath = "//input[@placeholder='Enter IP']")
	private WebElement IPAddress;

	@FindBy(xpath = "//input[@placeholder='Enter URL']")
	private WebElement URL;

	@FindBy(xpath = "//input[@placeholder='Enter Client Name']")
	private WebElement ClientName;

	@FindBy(xpath = "//input[@id='approve_reject_hook']")
	private WebElement Approve_RejectHookURL;

	@FindBy(xpath = "//input[@id='withdraw_url']")
	private WebElement WithdrawHookURL;

	@FindBy(xpath = "//input[@id='balance_url']")
	private WebElement BalanceHookURL;

	@FindBy(xpath = "//input[@id='agent_login']")
	private WebElement AgentLoginHookURL;

	@FindBy(xpath = "//input[@placeholder='Enter manually transaction hook url']")
	private WebElement ManuallyTransactionHookURL;

	@FindBy(xpath = "//input[@placeholder='Enter user registraction hook url']")
	private WebElement UserRegistractionHookURL;

	@FindBy(xpath = "//input[@placeholder='Enter employee login URL']")
	private WebElement LoginSlug;

	@FindBy(xpath = "//input[@placeholder='Enter database name']")
	private WebElement DatabaseName;

	@FindBy(xpath = "//img[@style='cursor: pointer;']")
	private WebElement SecretKeyButton;

	@FindBy(xpath = "//input[@placeholder='Enter secret name']")
	private WebElement SecretKey;

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
	private WebElement SubmitButton;

	@FindBy(xpath = "(//button[@class='btn btn-secondary'])[1]")
	private WebElement CancelButton;

	@FindBy(xpath = "(//button[@aria-label='Close'])[3]")
	private WebElement CloseForm;

	@FindBy(xpath = "//p[@class='text-danger validation_msg websiteName']")
	private WebElement WebsiteNameValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg ip']")
	private WebElement IPAddressValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg url']")
	private WebElement URLValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg clientName']")
	private WebElement ClientNameValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg approve_reject_hook_url']")
	private WebElement ApproveRejectHookURLValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg balance_hook_url']")
	private WebElement WithdrawHookURLValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg clientName']")
	private WebElement BalanceHookURLValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg agent_login_url']")
	private WebElement AgentLoginURLValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg manually_transaction']")
	private WebElement ManuallyTransactionHookURLValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg user_registractioin']")
	private WebElement UserRegistractionHookURLValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg login_slug']")
	private WebElement LoginSlugValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg database_name']")
	private WebElement DatabaseNameValidMessage;

	@FindBy(xpath = "//p[@class='text-danger validation_msg secret_key']")
	private WebElement SecreteKeyValidMessage;

	@FindBy(xpath = "//label[@class='switch']")
	private List<WebElement> StatusToggleKeys;

	@FindBy(xpath = "//button[@data-bs-toggle='dropdown']")
	private List<WebElement> ActionDropdowns;

	@FindBy(xpath = "//button[@class='dropdown-item' and @data-bs-target='#']")
	private List<WebElement> ActionCopyDetailsEdit;

	@FindBy(xpath = "//button[@data-bs-target='#delete-item-modal']")
	private List<WebElement> ActionDelete;

	@FindBy(xpath = "//button[@id='dropdownMenuButton1']")
	private WebElement Notification;

	@FindBy(xpath = "//div[@class='no-notification-wrapper']")
	private WebElement NotificationMessage;

	@FindBy(xpath = "//span[@class='close-notification-btn']")
	private WebElement NotificationClose;

	@FindBy(xpath = "(//a[@class='admin-logo'])[1]")
	private WebElement GetIdLogo;

	@FindBy(xpath = "//button[@class='log_out_top']")
	private WebElement LogoutTop;

	@FindBy(xpath = "//ul[@class='bottom-logout']")
	private WebElement LogoutBottom;

	@FindBy(xpath = "//div[@class='toasted-container top-right']")
	private WebElement StatusValidationMessage;

	@FindBy(xpath = "//div[@class='toasted-container top-right']")
	private WebElement EditDataValidationMessage;

	@FindBy(xpath = "//div[@class='toasted-container top-right']")
	private WebElement AddCompleteDataValidationMessage;

	@FindBy(xpath = "//h2[text()='Confirmation']")
	private WebElement DeleteHeadingMessage;

	@FindBy(xpath = "//div[@id='swal2-html-container']")
	private WebElement DeleteDescriptionMessage;

	@FindBy(xpath = "//button[@class='swal2-cancel swal2-styled']")
	private WebElement DeleteMessageCancle;

	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	private WebElement DeleteMessageYes;

	@FindBy(xpath = "//h2[@id='swal2-title']")
	private WebElement AfterYesMessageTitle;

	@FindBy(xpath = "//div[@id='swal2-html-container']")
	private WebElement AfterYesMessageDescription;

	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	private WebElement AfterYesMessageOkButton;

	@FindBy(xpath = "//select[@class='form-select']")
	private WebElement WebsiteEntries;

	@FindBy(xpath = "//a[text()='Previous']")
	private WebElement PreviousButton;

	@FindBy(xpath = "//a[text()='Next']")
	private WebElement NextButton;

	@FindBy(xpath = "//a[text()='1']")
	private WebElement Page1;

	@FindBy(xpath = "//a[text()='2']")
	private WebElement Page2;

	@FindBy(xpath = "//a[@tabindex='0']")
	private List<WebElement> PageNumbers;

	@FindBy(xpath = "//div[@class='toasted-container top-right']")
	private WebElement CompleteAddEditDetailsValidationMessage;

	@FindBy(xpath = "//span[text()='Payment Range']")
	private WebElement PaymentRangeModule;

	public WebsiteListPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() throws InterruptedException {
		LoginIdField.sendKeys("admin@getid.com");
		Thread.sleep(1000);
		System.out.println("Enter Valid Username");
		PasswordField.sendKeys("123456");
		Thread.sleep(1000);
		System.out.println("Enter Valid Password");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Login Button");
	}

	public void FunctionAvailableWebsiteListModule() throws InterruptedException {
		System.out.println("1. Verify Functionality and availability of Website List Module");
		login();
		System.out.println("Website List Module is Enabled : " + WebsiteList.isEnabled());
		System.out.println("Website List Module is Displayed : " + WebsiteList.isDisplayed());
		PaymentRangeModule.click();
		Thread.sleep(2000);
		System.out.println("click on Payment Range Module");
		WebsiteList.click();
		Thread.sleep(2000);
		System.out.println("click on Website List Module");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionAvailableBothLogoutButton() throws InterruptedException {
		System.out.println("2. Verify Functionality and avaibality of Both Logout Button");
		login();
		System.out.println("Top Logout Button is Enabled : " + LogoutTop.isEnabled());
		System.out.println("Top Logout Button is Displayed : " + LogoutTop.isDisplayed());
		System.out.println("Bottom Logout Button is Enabled : " + LogoutBottom.isEnabled());
		System.out.println("Bottom Logout Button is Displayed : " + LogoutBottom.isDisplayed());
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Top Logout Top");
		login();
		LogoutBottom.click();
		Thread.sleep(2000);
		System.out.println("Click on Bottom Logout Button");
	}

	public void FunctionAvailableValidMessageNotificationButton() throws InterruptedException {
		System.out.println("3. Verify Functionality, avaibality and validation message of Notification Button");
		login();
		System.out.println("Notification Button is Enabled : " + Notification.isEnabled());
		System.out.println("Notification Button is Displayed : " + Notification.isDisplayed());
		Notification.click();
		Thread.sleep(1000);
		String NotificationMessageText = NotificationMessage.getText();
		System.err.println("Notification Message Text : " + NotificationMessageText);
		Thread.sleep(1000);
		System.out.println("Notification Close Button is Enabled : " + NotificationClose.isEnabled());
		System.out.println("Notification Close Button is Displayed : " + NotificationClose.isDisplayed());
		NotificationClose.click();
		Thread.sleep(2000);
		System.out.println("Click on Notification Message Box Close Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionAvailableSearchBoxAndButton() throws InterruptedException {
		System.out.println("4. Verify Functionality and avaibality of Search Box and Button");
		login();
		Thread.sleep(2000);
		System.out.println("Search Box Field is Enabled : " + SearchBox.isEnabled());
		System.out.println("Search Box Field is Displayed : " + SearchBox.isDisplayed());
		System.out.println("Search Button is Enabled : " + SearchButton.isEnabled());
		System.out.println("Search Button is Displayed : " + SearchButton.isDisplayed());
		Thread.sleep(2000);
		SearchBox.sendKeys("Test");
		Thread.sleep(2000);
		System.out.println("Enter Text into Search Box");
		SearchButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Search Button");
		SearchBox.clear();
		Thread.sleep(2000);
		System.out.println("Cleared Text From Search Box");
		SearchBox.sendKeys("Taj");
		Thread.sleep(1000);
		System.out.println("Enter Text into Search Box");
		SearchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Press Enter Key");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void GetIdLogoDisplayedEnabled() throws InterruptedException {
		System.out.println("5. Verify GetId Logo is Displayed and Enabled on WebList Page");
		login();
		Thread.sleep(2000);
		System.out.println("Get Id Logo is Enabled : " + GetIdLogo.isEnabled());
		System.out.println("Get Id Logo  is Displayed : " + GetIdLogo.isDisplayed());
		PaymentRangeModule.click();
		Thread.sleep(2000);
		System.out.println("click on Payment Range Module");
		GetIdLogo.click();
		Thread.sleep(2000);
		System.out.println("click on Get Id Logo To Check go to Home Page");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void HeadingText() throws InterruptedException {
		System.out.println("6. Verify Heading Text of Website List Page");
		login();
		Thread.sleep(2000);
		System.out.println("Website List Heading is Enabled : " + HeadingWebsiteList.isEnabled());
		System.out.println("Website List Heading is Displayed : " + HeadingWebsiteList.isDisplayed());
		String HeadingWebsiteListText = HeadingWebsiteList.getText();
		System.out.println("Heading Website List Text : " + HeadingWebsiteListText);
		if (HeadingWebsiteListText.equals("Website List")) {
			System.out.println("Heading Website List Test Case Passed");
		} else {
			System.out.println("Heading Website List Test Case Passed");
		}
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionAvailableAddWebsiteButton() throws InterruptedException {
		System.out.println("7. Verify Functionality and avaibality of Add Website Button");
		login();
		Thread.sleep(2000);
		System.out.println("Add Website Button is Enabled : " + AddWebsiteButton.isEnabled());
		System.out.println("Add Website Button is Displayed : " + AddWebsiteButton.isDisplayed());
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		CloseForm.click();
		Thread.sleep(2000);
		System.out.println("Click on Close Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FieldsAvailabilityAddNewWebsiteAllFields() throws InterruptedException {
		System.out.println("8. Verify Fields Availability of Add New Website All Fields ");
		login();
		Thread.sleep(2000);
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		System.out.println("Website Name field is Displayed : " + WebsiteName.isDisplayed());
		System.out.println("IP Address field is Displayed : " + IPAddress.isDisplayed());
		System.out.println("URL field is Displayed : " + URL.isDisplayed());
		System.out.println("Client Name field is Displayed : " + ClientName.isDisplayed());
		System.out.println("Approve_RejectHookURL field is Displayed : " + Approve_RejectHookURL.isDisplayed());
		System.out.println("WithdrawHookURL field is Displayed : " + WithdrawHookURL.isDisplayed());
		System.out.println("BalanceHookURL field is Displayed : " + BalanceHookURL.isDisplayed());
		System.out.println("AgentLoginHookURL field is Displayed : " + AgentLoginHookURL.isDisplayed());
		System.out
				.println("ManuallyTransactionHookURL field is Displayed : " + ManuallyTransactionHookURL.isDisplayed());
		System.out.println("UserRegistractionHookURL field is Displayed : " + UserRegistractionHookURL.isDisplayed());
		System.out.println("LoginSlug field is Displayed : " + LoginSlug.isDisplayed());
		System.out.println("DatabaseName field is Displayed : " + DatabaseName.isDisplayed());
		System.out.println("SecretKeyButton  is Displayed : " + SecretKeyButton.isDisplayed());
		System.out.println("SecretKey field is Displayed : " + SecretKey.isDisplayed());
		CloseForm.click();
		Thread.sleep(2000);
		System.out.println("Click on Close Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FieldsEnabledAddNewWebsiteAllFields() throws InterruptedException {
		System.out.println("9. Verify Fields Enabled of Add New Website All Fields ");
		login();
		Thread.sleep(2000);
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		System.out.println("Website Name field is Enabled : " + WebsiteName.isEnabled());
		System.out.println("IP Address field is Enabled : " + IPAddress.isEnabled());
		System.out.println("URL field is Enabled : " + URL.isEnabled());
		System.out.println("Client Name field is Enabled : " + ClientName.isEnabled());
		System.out.println("Approve_RejectHookURL field is Enabled : " + Approve_RejectHookURL.isEnabled());
		System.out.println("WithdrawHookURL field is Enabled : " + WithdrawHookURL.isEnabled());
		System.out.println("BalanceHookURL field is Enabled : " + BalanceHookURL.isEnabled());
		System.out.println("AgentLoginHookURL field is Enabled : " + AgentLoginHookURL.isEnabled());
		System.out.println("ManuallyTransactionHookURL field is Enabled : " + ManuallyTransactionHookURL.isEnabled());
		System.out.println("UserRegistractionHookURL field is Enabled : " + UserRegistractionHookURL.isEnabled());
		System.out.println("LoginSlug field is Enabled : " + LoginSlug.isEnabled());
		System.out.println("DatabaseName field is Enabled : " + DatabaseName.isEnabled());
		System.out.println("SecretKeyButton  is Enabled : " + SecretKeyButton.isEnabled());
		System.out.println("SecretKey field is Enabled : " + SecretKey.isEnabled());
		CloseForm.click();
		Thread.sleep(2000);
		System.out.println("Click on Close Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionalityAddNewWebsiteAllFieldsValidData() throws InterruptedException {
		System.out.println("10. Verify Functionality of Add New Website All Fields with valid data ");
		login();
		Thread.sleep(2000);
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		WebsiteName.sendKeys("Website Taj222");
		Thread.sleep(1000);
		System.out.println("Entered Valid Website Name");
		IPAddress.sendKeys("35.154.198.195");
		Thread.sleep(1000);
		System.out.println("Entered Valid IP Address");
		URL.sendKeys("https://taj111.com");
		Thread.sleep(1000);
		System.out.println("Entered Valid URL");
		ClientName.sendKeys("Client Taj");
		Thread.sleep(1000);
		System.out.println("Entered Valid Client Name");
		Approve_RejectHookURL.sendKeys("http://43.205.76.84/api/get-id/approve-reject");
		Thread.sleep(1000);
		System.out.println("Entered Valid Approve_RejectHookURL");
		WithdrawHookURL.sendKeys("http://43.205.76.84/api/get-id/withdraw-request");
		Thread.sleep(1000);
		System.out.println("Entered Valid WithdrawHookURL");
		BalanceHookURL.sendKeys("http://43.205.76.84/api/get-id/user-balance");
		Thread.sleep(1000);
		System.out.println("Entered Valid BalanceHookURL");
		AgentLoginHookURL.sendKeys("http://43.205.76.84/api/get-id/agent-login");
		Thread.sleep(1000);
		System.out.println("Entered Valid AgentLoginHookURL");
		ManuallyTransactionHookURL.sendKeys("http://43.205.76.84/api/get-id/manually-transactions");
		Thread.sleep(1000);
		System.out.println("Entered Valid ManuallyTransactionHookURL");
		UserRegistractionHookURL.sendKeys("http://43.205.76.84/api/get-id/user-registration");
		Thread.sleep(1000);
		System.out.println("Entered Valid UserRegistractionHookURL");
		LoginSlug.sendKeys("AarrsolTaj");
		Thread.sleep(1000);
		System.out.println("Entered Valid LoginSlug");
		DatabaseName.sendKeys("AarrsolData");
		Thread.sleep(1000);
		System.out.println("Entered Valid DatabaseName");
		SecretKeyButton.click();
		Thread.sleep(1000);
		System.out.println("Click on Secret Key Button - Automatically create secret key");
		SubmitButton.click();
		Thread.sleep(1000);
		System.out.println("Click on SubmitButton");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionValidMessageOfDuplicateWebSlugDatabaseSecret() throws InterruptedException, IOException {
		System.out.println(
				"11. Verify Valication message for duplicate entry in Add Website details for Website Name, Login Slug, Database Name, Secret Key ");
		login();
		Thread.sleep(2000);
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		WebsiteName.sendKeys("Website Taj888");
		Thread.sleep(1000);
		System.out.println("Entered Duplicate Website Name");
		LoginSlug.sendKeys("LoginSlugTaj");
		Thread.sleep(1000);
		System.out.println("Entered Duplicate LoginSlug");
		DatabaseName.sendKeys("DatabaseTajName");
		Thread.sleep(1000);
		System.out.println("Entered Duplicate DatabaseName");
		SecretKey.sendKeys("8jaEY3s1bjeN");
		Thread.sleep(1000);
		System.out.println("Entered Duplicate SecretKey");
		SubmitButton.click();
		Thread.sleep(2000);
		System.out.println("Click on SubmitButton");
		CommonScreenShots.commonCaptureScreen(driver);
		String WebsiteNameValidMessageText = WebsiteNameValidMessage.getText();
		System.out.println("Website Name Duplicate Entry Message Text : " + WebsiteNameValidMessageText);
		String LoginSlugValidMessageText = LoginSlugValidMessage.getText();
		System.out.println("Login Slug Duplicate Entry Message Text : " + LoginSlugValidMessageText);
		String DatabaseNameValidMessageText = DatabaseNameValidMessage.getText();
		System.out.println("Database Name Duplicate Entry Message Text : " + DatabaseNameValidMessageText);
		String SecreteKeyValidMessageText = SecreteKeyValidMessage.getText();
		System.out.println("Secrete Key Duplicate Entry Message Text : " + SecreteKeyValidMessageText);
		CloseForm.click();
		Thread.sleep(2000);
		System.out.println("Click on Close Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void ValidationMessageForMandatoryFieldsWithoutData() throws InterruptedException, IOException {
		System.out.println("12. Verify Validation Message for mandatory fields without data");
		login();
		Thread.sleep(2000);
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		SubmitButton.click();
		Thread.sleep(2000);
		System.out.println("Click on SubmitButton");
		CommonScreenShots.commonCaptureScreen(driver);
		String WebsiteNameValidMessageText = WebsiteNameValidMessage.getText();
		System.out.println("Website Name Validation Message Text : " + WebsiteNameValidMessageText);
		String IPAddressValidMessageText = IPAddressValidMessage.getText();
		System.out.println("IP Address Validation Message Text : " + IPAddressValidMessageText);
		String URLValidMessageText = URLValidMessage.getText();
		System.out.println("URL Validation Message Text : " + URLValidMessageText);
		String ClientNameValidMessageText = ClientNameValidMessage.getText();
		System.out.println("Client Name Validation Message Text : " + ClientNameValidMessageText);
		String LoginSlugValidMessageText = LoginSlugValidMessage.getText();
		System.out.println("Login Slug Validation Message Text : " + LoginSlugValidMessageText);
		String DatabaseNameValidMessageText = DatabaseNameValidMessage.getText();
		System.out.println("Database Name Validation Message Text : " + DatabaseNameValidMessageText);
		String SecreteKeyValidMessageText = SecreteKeyValidMessage.getText();
		System.out.println("Secrete Key Validation Message Text : " + SecreteKeyValidMessageText);
		Thread.sleep(2000);
		CloseForm.click();
		Thread.sleep(2000);
		System.out.println("Click on Close Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionalityValidationMessageMandatoryFieldsWithInvalidData() throws InterruptedException {
		System.out.println("13. Verify Functionality and Validation Message for mandatory fields with Invalid data ");
		login();
		Thread.sleep(2000);
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		WebsiteName.sendKeys("123");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Website Name with 3 Numbers");
		IPAddress.sendKeys("123");
		Thread.sleep(1000);
		System.out.println("Entered Invalid IP Address  with 3 Numbers");
		URL.sendKeys("123");
		Thread.sleep(1000);
		System.out.println("Entered Invalid URL  with 3 Numbers");
		ClientName.sendKeys("123");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Client Name  with 3 Numbers");
		LoginSlug.sendKeys("123");
		Thread.sleep(1000);
		System.out.println("Entered Invalid LoginSlug  with 3 Numbers");
		DatabaseName.sendKeys("123");
		Thread.sleep(1000);
		System.out.println("Entered Invalid DatabaseName  with 3 Numbers");
		SecretKey.sendKeys("123");
		System.out.println("Entered Invalid Secret Key  with 3 Numbers");
		SubmitButton.click();
		Thread.sleep(2000);
		System.out.println("Click on SubmitButton");

		String WebsiteNameValidMessageText = WebsiteNameValidMessage.getText();
		System.out.println("Website Name  with 3 Numbers Invalid Message Text : " + WebsiteNameValidMessageText);
		String IPAddressValidMessageText = IPAddressValidMessage.getText();
		System.out.println("IP Address  with 3 Numbers Invalid Message Text : " + IPAddressValidMessageText);
		String URLValidMessageText = URLValidMessage.getText();
		System.out.println("URL   with 3 Numbers Invalid Message Text : " + URLValidMessageText);
		String ClientNameValidMessageText = ClientNameValidMessage.getText();
		System.out.println("Client Name  with 3 Numbers Invalid Message Text : " + ClientNameValidMessageText);
		String LoginSlugValidMessageText = LoginSlugValidMessage.getText();
		System.out.println("Login Slug  with 3 Numbers Invalid Message Text : " + LoginSlugValidMessageText);
		String DatabaseNameValidMessageText = DatabaseNameValidMessage.getText();
		System.out.println("Database Name  with 3 Numbers Invalid Message Text : " + DatabaseNameValidMessageText);
		String SecreteKeyValidMessageText = SecreteKeyValidMessage.getText();
		System.out.println("Secrete Key  with 3 Numbers Invalid Message Text : " + SecreteKeyValidMessageText);
		Thread.sleep(3000);

		CancelButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Cancle Button");

		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		WebsiteName.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Website Name  with 5 Numbers");
		IPAddress.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid IP Address with 5 Numbers");
		URL.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid URL with 5 Numbers");
		ClientName.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Client Name with 5 Numbers");
		LoginSlug.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid LoginSlug with 5 Numbers");
		DatabaseName.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid DatabaseName with 5 Numbers");
		SecretKey.sendKeys("12345");
		System.out.println("Entered Invalid Secret Key with 5 Numbers");
		SubmitButton.click();
		Thread.sleep(2000);
		System.out.println("Click on SubmitButton");

		String WebsiteNameValidMessage1Text = WebsiteNameValidMessage.getText();
		System.out.println("Website Name with 5 Numbers Invalid Message Text : " + WebsiteNameValidMessage1Text);
		String IPAddressValidMessage1Text = IPAddressValidMessage.getText();
		System.out.println("IP Address with 5 Numbers Invalid Message Text : " + IPAddressValidMessage1Text);
		String URLValidMessage1Text = URLValidMessage.getText();
		System.out.println("URL with 5 Numbers Invalid Message Text : " + URLValidMessage1Text);
		String ClientNameValidMessage1Text = ClientNameValidMessage.getText();
		System.out.println("Client Name with 5 Numbers Invalid Message Text : " + ClientNameValidMessage1Text);
		String LoginSlugValidMessage1Text = LoginSlugValidMessage.getText();
		System.out.println("Login Slug with 5 Numbers Invalid Message Text : " + LoginSlugValidMessage1Text);
		String DatabaseNameValidMessage1Text = DatabaseNameValidMessage.getText();
		System.out.println("Database Name with 5 Numbers Invalid Message Text : " + DatabaseNameValidMessage1Text);
		String SecreteKeyValidMessage1Text = SecreteKeyValidMessage.getText();
		System.out.println("Secrete Key with 5 Numbers Invalid Message Text : " + SecreteKeyValidMessage1Text);
		Thread.sleep(2000);
		
		CloseForm.click();
		Thread.sleep(2000);
		System.out.println("Click on Close Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionalityValidationMessageForAllFieldsWithInvalidData() throws InterruptedException {
		System.out.println("14. Verify Functinality and Validation Message for All fields with Invalid data");
		login();
		Thread.sleep(2000);
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		WebsiteName.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Website Name");
		IPAddress.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid IP Address");
		URL.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid URL");
		ClientName.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Client Name");
		Approve_RejectHookURL.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Approve_RejectHookURL");
		WithdrawHookURL.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid WithdrawHookURL");
		BalanceHookURL.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid BalanceHookURL");
		AgentLoginHookURL.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid AgentLoginHookURL");
		ManuallyTransactionHookURL.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid ManuallyTransactionHookURL");
		UserRegistractionHookURL.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid UserRegistractionHookURL");
		LoginSlug.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid LoginSlug");
		DatabaseName.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid DatabaseName");
		SecretKey.sendKeys("12345");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Secret Key");
		SubmitButton.click();
		Thread.sleep(1000);
		System.out.println("Click on SubmitButton");

		String WebsiteNameValidMessage1Text = WebsiteNameValidMessage.getText();
		System.out.println("Website Name with Invalid Message Text : " + WebsiteNameValidMessage1Text);
		String IPAddressValidMessage1Text = IPAddressValidMessage.getText();
		System.out.println("IP Address with Invalid Message Text : " + IPAddressValidMessage1Text);
		String URLValidMessage1Text = URLValidMessage.getText();
		System.out.println("URL with Invalid Message Text : " + URLValidMessage1Text);
		String ClientNameValidMessage1Text = ClientNameValidMessage.getText();
		System.out.println("Client Name with Invalid Message Text : " + ClientNameValidMessage1Text);
		String LoginSlugValidMessage1Text = LoginSlugValidMessage.getText();
		String ApproveRejectHookURLValidMessageText = ApproveRejectHookURLValidMessage.getText();
		System.out.println("ApproveRejectHookURL Invalid Message Text : " + ApproveRejectHookURLValidMessageText);
		String WithdrawHookURLValidMessageText = WithdrawHookURLValidMessage.getText();
		System.out.println("WithdrawHookURL Invalid Message Text : " + WithdrawHookURLValidMessageText);
		String BalanceHookURLValidMessageText = BalanceHookURLValidMessage.getText();
		System.out.println("BalanceHookURL Invalid Message Text : " + BalanceHookURLValidMessageText);
		String AgentLoginURLValidMessageText = AgentLoginURLValidMessage.getText();
		System.out.println("AgentLoginHookURL Invalid Message Text : " + AgentLoginURLValidMessageText);
		String ManuallyTransactionHookURLValidMessageText = ManuallyTransactionHookURLValidMessage.getText();
		System.out.println(
				"ManuallyTransactionHookURL Invalid Message Text : " + ManuallyTransactionHookURLValidMessageText);
		String UserRegistractionHookURLValidMessageText = UserRegistractionHookURLValidMessage.getText();
		System.out
				.println("UserRegistractionHookURL Invalid Message Text : " + UserRegistractionHookURLValidMessageText);
		System.out.println("Login Slug with Invalid Message Text : " + LoginSlugValidMessage1Text);
		String DatabaseNameValidMessage1Text = DatabaseNameValidMessage.getText();
		System.out.println("Database Name Invalid Message Text : " + DatabaseNameValidMessage1Text);
		String SecreteKeyValidMessage1Text = SecreteKeyValidMessage.getText();
		System.out.println("Secrete Key with Invalid Message Text : " + SecreteKeyValidMessage1Text);
		Thread.sleep(2000);
		
		CloseForm.click();
		Thread.sleep(2000);
		System.out.println("Click on Close Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionalityAvailableCancleSubmitCloseButton() throws InterruptedException {
		System.out.println("15. Verify Functionality and Availability of  Cancle, Submit and Close  Button");
		login();
		Thread.sleep(2000);
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		System.out.println("SubmitButton  is Enabled : " + SubmitButton.isEnabled());
		System.out.println("SubmitButton  is Displayed : " + SubmitButton.isDisplayed());
		System.out.println("CancelButton  is Enabled : " + CancelButton.isEnabled());
		System.out.println("CancelButton  is Displayed : " + CancelButton.isDisplayed());
		System.out.println("CloseForm Button  is Enabled : " + CloseForm.isEnabled());
		System.out.println("CloseForm  Button Displayed : " + CloseForm.isDisplayed());
		CloseForm.click();
		Thread.sleep(2000);
		System.out.println("Click on Click on Button");
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		CancelButton.click();
		System.out.println("Click on Cancel Button");
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		SubmitButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Submit Button");
		CloseForm.click();
		Thread.sleep(2000);
		System.out.println("Click on Close Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void ValidationMessageAfterCompleteAddWebsiteDetails() throws InterruptedException {
		System.out.println("16. Verify validation message after complete add Website Details ");
		login();
		Thread.sleep(2000);
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		WebsiteName.sendKeys("Aarrsol Website");
		Thread.sleep(1000);
		System.out.println("Entered Valid Website Name");
		IPAddress.sendKeys("35.154.198.195");
		Thread.sleep(1000);
		System.out.println("Entered Valid IP Address");
		URL.sendKeys("https://taj111.com");
		Thread.sleep(1000);
		System.out.println("Entered Valid URL");
		ClientName.sendKeys("Client Taj111");
		Thread.sleep(1000);
		System.out.println("Entered Valid Client Name");
		Approve_RejectHookURL.sendKeys("http://43.205.76.84/api/get-id/approve-reject");
		Thread.sleep(1000);
		System.out.println("Entered Valid Approve_RejectHookURL");
		WithdrawHookURL.sendKeys("http://43.205.76.84/api/get-id/withdraw-request");
		Thread.sleep(1000);
		System.out.println("Entered Valid WithdrawHookURL");
		BalanceHookURL.sendKeys("http://43.205.76.84/api/get-id/user-balance");
		Thread.sleep(1000);
		System.out.println("Entered Valid BalanceHookURL");
		AgentLoginHookURL.sendKeys("http://43.205.76.84/api/get-id/agent-login");
		Thread.sleep(1000);
		System.out.println("Entered Valid AgentLoginHookURL");
		ManuallyTransactionHookURL.sendKeys("http://43.205.76.84/api/get-id/manually-transactions");
		Thread.sleep(1000);
		System.out.println("Entered Valid ManuallyTransactionHookURL");
		UserRegistractionHookURL.sendKeys("http://43.205.76.84/api/get-id/user-registration");
		Thread.sleep(1000);
		System.out.println("Entered Valid UserRegistractionHookURL");
		LoginSlug.sendKeys("JaipurSlug");
		Thread.sleep(1000);
		System.out.println("Entered Valid LoginSlug");
		DatabaseName.sendKeys("JaipurData");
		Thread.sleep(1000);
		System.out.println("Entered Valid DatabaseName");
		SecretKeyButton.click();
		Thread.sleep(1000);
		System.out.println("Click on Secret Key Button - Automatically create secret key");
		SubmitButton.click();
		Thread.sleep(1000);
		System.out.println("Click on SubmitButton");
		String CompleteAddEditDetailsValidationMessageText = CompleteAddEditDetailsValidationMessage.getText();
		System.out.println(
				"CompleteAddEditDetailsValidationMessageText : " + CompleteAddEditDetailsValidationMessageText);
		Thread.sleep(2000);		
		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionalityAvailabilityValidationMessaseStatusToggleKey() throws InterruptedException {
		System.out.println("17. Verify Functionality, availability and validation message of Status toggle key ");
		login();
		Thread.sleep(2000);
		System.out.println("Status Toggle Key is Enabled : " + StatusToggleKeys.get(0).isEnabled());
		System.out.println("Status Toggle Key is Displayed : " + StatusToggleKeys.get(0).isDisplayed());
		StatusToggleKeys.get(0).click();
		Thread.sleep(2000);
		System.out.println("Click on Status Toggle key");
		String StatusValidationMessage1Text = StatusValidationMessage.getText();
		System.out
				.println("Toggle Key Change Status Inactive Validation Message Text : " + StatusValidationMessage1Text);
		StatusToggleKeys.get(0).click();
		Thread.sleep(2000);
		System.out.println("Click on Status Toggle key");
		String StatusValidationMessage2Text = StatusValidationMessage.getText();
		System.out.println("Toggle Key Change Status Active Validation Message Text : " + StatusValidationMessage2Text);
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionalityAvailabilityActionDropdownButton() throws InterruptedException {
		System.out.println("18. Verify Functionality and availability Action Dropdown Button");
		login();
		Thread.sleep(2000);		
		System.out.println("Action Dropdown Button is Enabled : " + ActionDropdowns.get(0).isEnabled());
		System.out.println("Action Dropdown Button is Displayed : " + ActionDropdowns.get(0).isDisplayed());
		ActionDropdowns.get(1).click();
		Thread.sleep(2000);
		System.out.println("Click on Action Dropdown Button of First Website");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionAvailableValidationMessageCopyDetails() throws InterruptedException, IOException {
		System.out.println("19. Verify Functionality, Avaibality and Validation message of Copy Details");
		login();
		Thread.sleep(2000);
		StatusToggleKeys.get(0).click();
		Thread.sleep(2000);
		System.out.println("Click on Status Toggle key");
		ActionDropdowns.get(1).click();
		Thread.sleep(2000);
		System.out.println("Click on Action Dropdown Button of First Website");
		System.out.println("Action Copy Details is Enabled : " + ActionCopyDetailsEdit.get(0).isEnabled());
		System.out.println("Action Copy Details  is Displayed : " + ActionCopyDetailsEdit.get(0).isDisplayed());
		ActionCopyDetailsEdit.get(0).click();
		Thread.sleep(2000);
		Alert al1 = driver.switchTo().alert();
		Thread.sleep(1000);
		String alertText = al1.getText();
		System.out.println("Alert Text of Copy Details : " + alertText);
		al1.accept();
		Thread.sleep(2000);

		// For paste copied texts
		AddWebsiteButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Add Website Button");
		Actions act = new Actions(driver);
		act.click(WebsiteName).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		System.out.println("Paste Copied Text into Website Name Field");
		String CopyDetailsText = WebsiteName.getText();
		System.out.println("Copy Details Text : " + CopyDetailsText);
		Thread.sleep(2000);
		CommonScreenShots.commonCaptureScreen(driver);
		CloseForm.click();
		Thread.sleep(2000);
		System.out.println("Click on Close Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
		
	}

	public void FunctionAvailableValidationMessageEditButton() throws InterruptedException {
		System.out.println("20. Verify Functionality, Availability and Validation message Edit Button");
		login();
		Thread.sleep(2000);
		StatusToggleKeys.get(0).click();
		Thread.sleep(2000);
		System.out.println("Click on Status Toggle key");
		ActionDropdowns.get(1).click();
		Thread.sleep(2000);
		System.out.println("Click on Action Dropdown Button of First Website");
		System.out.println("Action Edit Button is Enabled : " + ActionCopyDetailsEdit.get(1).isEnabled());
		System.out.println("Action Edit Button is Displayed : " + ActionCopyDetailsEdit.get(1).isDisplayed());
		ActionCopyDetailsEdit.get(1).click();
		Thread.sleep(2000);
		SecretKeyButton.click();
		Thread.sleep(2000);
		SubmitButton.click();
		Thread.sleep(1000);
		String EditDataValidationMessageText = EditDataValidationMessage.getText();
		System.out.println("Edit Data Validation Message Text : " + EditDataValidationMessageText);
		Thread.sleep(2000);
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionAvailableValidationMessageDeleteButton() throws InterruptedException {
		System.out.println("21. Verify Functionality, Availability and Validation message Delete Button");
		login();
		Thread.sleep(2000);
		StatusToggleKeys.get(0).click();
		Thread.sleep(2000);
		System.out.println("Click on Status Toggle key");
		ActionDropdowns.get(1).click();
		Thread.sleep(2000);
		System.out.println("Click on Action Dropdown Button of First Website");
		System.out.println("Action Delete Button is Enabled : " + ActionDelete.get(0).isEnabled());
		System.out.println("Action Delete Button is Displayed : " + ActionDelete.get(0).isDisplayed());
		ActionDelete.get(0).click();
		Thread.sleep(2000);
		System.out.println("Click on Delete Button");
		String DeleteHeadingMessageText = DeleteHeadingMessage.getText();
		System.out.println("Delete Heading Message Text : " + DeleteHeadingMessageText);
		String DeleteDescriptionMessageText = DeleteDescriptionMessage.getText();
		System.out.println("Delete Description Message Text : " + DeleteDescriptionMessageText);
		DeleteMessageCancle.click();
		Thread.sleep(2000);
		System.out.println("Click on Cancle Button of Delele Message");
		ActionDropdowns.get(1).click();
		Thread.sleep(2000);
		System.out.println("Click on Action Dropdown Button of First Website");
		ActionDelete.get(0).click();
		Thread.sleep(2000);
		System.out.println("Click on Delete Button");
		DeleteMessageYes.click();
		Thread.sleep(2000);
		System.out.println("Click on Yes Button of Delele Message");
		String AfterYesMessageTitleText = AfterYesMessageTitle.getText();
		System.out.println("After Clicking on Yes Button  Message Title Text : " + AfterYesMessageTitleText);
		String AfterYesMessageDescriptionText = AfterYesMessageDescription.getText();
		System.out
				.println("After Clicking on Yes Button  Message Description Text : " + AfterYesMessageDescriptionText);
		System.out.println(
				"After Clicking on Yes Button - Ok Button is Enabled : " + AfterYesMessageOkButton.isEnabled());
		System.out.println(
				"After Clicking on Yes Button - Ok Button is Displayed : " + AfterYesMessageOkButton.isDisplayed());
		AfterYesMessageOkButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Ok Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void DeleteButtonIsPresentOnlyStatusIsInactive() throws InterruptedException {
		System.out.println("22. Verify Delete button is present only status is Inactive of Website");
		login();
		Thread.sleep(2000);
		StatusToggleKeys.get(0).click();
		Thread.sleep(2000);
		System.out.println("Click on Status Toggle key");
		String StatusValidationMessage1Text = StatusValidationMessage.getText();
		System.out
				.println("Toggle Key Change Status Inactive Validation Message Text : " + StatusValidationMessage1Text);
		ActionDropdowns.get(1).click();
		Thread.sleep(2000);
		System.out.println("Click on Action Dropdown Button of First Website");
		System.out.println(
				"Action Delete Button is Displayed When Status is Inactive : " + ActionDelete.get(0).isDisplayed());
		StatusToggleKeys.get(0).click();
		Thread.sleep(2000);
		System.out.println("Click on Status Toggle key");
		String StatusValidationMessage2Text = StatusValidationMessage.getText();
		System.out.println("Toggle Key Change Status Active Validation Message Text : " + StatusValidationMessage2Text);
		ActionDropdowns.get(1).click();
		Thread.sleep(2000);
		System.out.println("Click on Action Dropdown Button of First Website");
		System.out.println(
				"Action Delete Button is Displayed  When Status is Active : " + ActionDelete.get(0).isDisplayed());
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionAvailabelTotalNumberOfWebsiteEntriesDropdown() throws InterruptedException {
		System.out.println("23. Verify Functionality and availability of  total Number of Website Entries dropdown");
		login();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", WebsiteEntries);
		System.out.println("Website Entries Dropdown is Enabled : " + WebsiteEntries.isEnabled());
		System.out.println("Website Entries Dropdown is Displayed : " + WebsiteEntries.isDisplayed());
		Select sel1 = new Select(WebsiteEntries);
		sel1.selectByVisibleText("50");
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()", WebsiteEntries);
		sel1.selectByIndex(2);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()", WebsiteEntries);
		sel1.selectByValue("200");
		Thread.sleep(2000);
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FunctionAvailabelPagesPreviousNextButton() throws InterruptedException {
		System.out.println("24. Verify Functionality and availability of Pages, Previous and next button");
		login();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Page Number 2 is Enabled : " + PageNumbers.get(1).isEnabled());
		System.out.println("Page Number 2 is Displayed : " + PageNumbers.get(1).isDisplayed());
		System.out.println("Page Number 1 is Enabled : " + PageNumbers.get(0).isEnabled());
		System.out.println("Page Number 1 is Displayed : " + PageNumbers.get(0).isDisplayed());
		System.out.println("Next Button is Enabled : " + NextButton.isEnabled());
		System.out.println("Next Button is Displayed : " + NextButton.isDisplayed());
		Thread.sleep(2000);

		NextButton.click();
		Thread.sleep(4000);
		System.out.println("Click on Next Button");
		System.out.println("Previous Button is Enabled : " + PreviousButton.isEnabled());
		System.out.println("Previous Button is Displayed : " + PreviousButton.isDisplayed());
		Page1.click();
		Thread.sleep(4000);
		System.out.println("Click on Page Number 1");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Page2.sendKeys(Keys.ENTER);;
		Thread.sleep(4000);
		System.out.println("Click on Page Number 2");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		PreviousButton.click();
		Thread.sleep(4000);
		System.out.println("Click on Previous Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");		
	}
	
	public void FunctionalityOfButtonsAndFieldsWithTabEnterButton() throws InterruptedException {
		System.out.println("25. Verify Functionality of Button and fields with Tab and Enter Button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		act.sendKeys(Keys.TAB).sendKeys("admin@getid.com").build().perform();
		System.out.println("Cursor on Login Id Field By Tab Key");
		System.out.println("Entered Valid Login Id");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys("123456").build().perform();
		System.out.println("Cursor on Password Field By Tab Key");
		System.out.println("Entered Valid Password");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Eye Password Field By Tab Key");
		System.out.println("Press Enter Key");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Press Again Enter Key");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Login Button By Tab Key");
		System.out.println("Press Enter Key");
		System.out.println("Successfully Login Get Id Provider Panel");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Notification Button By Tab Key");
		System.out.println("Press Enter Key");
		System.out.println("Open Notification Pop-up");
		Thread.sleep(2000);	
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Press Enter Key");
		System.out.println("Close Notification Pop-up");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Top Logout Button By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Website List Module By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Manage ID Module By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Payment Range Module By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Remarks Module By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Profile Module By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Bottom Logout Module By TAB Key");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Search Box Field By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys("Website").perform();		
		System.out.println("Entered Website Text into Search Box");		
		Thread.sleep(2000);	
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Searched Website by Press ENTER Key");
		Thread.sleep(2000);	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		System.out.println("Select all text from Search Box");
		Thread.sleep(2000);	
		act.sendKeys(Keys.BACK_SPACE).perform();
		System.out.println("Erased all text from Search Box by Back_SPACE Key");	
		Thread.sleep(2000);	
		act.sendKeys("Test").perform();		
		System.out.println("Again Entered Test Text into Search Box");		
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Search Button By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Again Searched Website by Press Enter Key");
		Thread.sleep(2000);	
		act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).build().perform();
		System.out.println("Press SHIFT and TAB Keys for Reversing go to Search Box");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		System.out.println("Select all text from Search Box");
		Thread.sleep(2000);	
		act.sendKeys(Keys.BACK_SPACE).perform();
		System.out.println("Again Erased all text from Search Box by Back_SPACE Key");	
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Again Cursor on Search Button By TAB Key");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Add Website Button By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Key for open Add Website Details");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Close Form Button By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Key for closing Website Add Details");
		for(int i=0; i<=12; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}
		Thread.sleep(2000);	
		
		//Add Website Details in the form
		
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Again Press ENTER Key for open Add Website Details");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Again Cursor on Close Form Button By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Website Name Field By TAB Key");		
		act.sendKeys("GautamWeb").perform();
		System.out.println("Entered Website Name : GautamWeb");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on IP Address Field By TAB Key");		
		act.sendKeys("35.154.182.198").perform();
		System.out.println("Entered IP Address : 35.154.182.198");
		Thread.sleep(2000);			
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on URL Field By TAB Key");		
		act.sendKeys("https://victoryexch9.com").perform();
		System.out.println("Entered URL : https://victoryexch9.com");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Client Name Field By TAB Key");		
		act.sendKeys("Gautam Marg").perform();
		System.out.println("Entered Client Name : Gautam Marg");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Approve/Reject Hook URL Field By TAB Key");		
		act.sendKeys("http://43.205.76.84/api/get-id/approve-reject").perform();
		System.out.println("Entered Approve/Reject Hook URL : http://43.205.76.84/api/get-id/approve-reject");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Withdraw Hook URL Field By TAB Key");		
		act.sendKeys("http://43.205.76.84/api/get-id/withdraw-request").perform();
		System.out.println("Entered Withdraw Hook URL : http://43.205.76.84/api/get-id/withdraw-request");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Balance Hook URL Field By TAB Key");		
		act.sendKeys("http://43.205.76.84/api/get-id/user-balance").perform();
		System.out.println("Entered Balance Hook URL : http://43.205.76.84/api/get-id/user-balance");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Agent Login Hook URL Field By TAB Key");		
		act.sendKeys("http://43.205.76.84/api/get-id/agent-login").perform();
		System.out.println("Entered Agent Login Hook URL : http://43.205.76.84/api/get-id/agent-login");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Manually Transaction Hook URL Field By TAB Key");		
		act.sendKeys("http://43.205.76.84/api/get-id/manually-transactions").perform();
		System.out.println("Entered Manually Transaction Hook URL : http://43.205.76.84/api/get-id/manually-transactions");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on User Registraction Hook URL Field By TAB Key");		
		act.sendKeys("http://43.205.76.84/api/get-id/user-registration").perform();
		System.out.println("Entered User Registraction Hook URL : http://43.205.76.84/api/get-id/user-registration");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Login Slug Field By TAB Key");		
		act.sendKeys("GautamSlug").perform();
		System.out.println("Entered Login Slug : GautamSlug");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Database Name Field By TAB Key");		
		act.sendKeys("GautamData").perform();
		System.out.println("Entered Database Name : GautamData");
		Thread.sleep(2000);			
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Secret Key Button By TAB Key");		
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Key to Enter Secret key Automatically");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Secret Key Field By TAB Key");	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Cancle Button By TAB Key");	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Submit Button By TAB Key");	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Keys for Submit Website Details");	
		
		//After Add Website Details Go to Status, Action and Pagination
		for(int i=0; i<=12; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Status Toggle Key of First Website By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER for Change Status of Active/Inactive");
		Thread.sleep(2000);	
	}
}

package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageIDPage1 {

	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Enter Login ID']")
	private WebElement LoginIdField;

	@FindBy(xpath = "//input[@placeholder='Enter Password']")
	private WebElement PasswordField;

	@FindBy(xpath = "//button[@class='btn btn-primary w-100']")
	private WebElement LoginButton;

	@FindBy(xpath = "//a[@href='/manage-id']")
	private WebElement ManageIDModule;

	@FindBy(xpath = "(//a[@class='admin-logo'])[1]")
	private WebElement GetIdLogo;

	@FindBy(xpath = "//button[@class='log_out_top']")
	private WebElement LogoutTop;

	@FindBy(xpath = "//ul[@class='bottom-logout']")
	private WebElement LogoutBottom;

	@FindBy(xpath = "//button[@id='dropdownMenuButton1']")
	private WebElement Notification;

	@FindBy(xpath = "//div[@class='no-notification-wrapper']")
	private WebElement NotificationMessage;

	@FindBy(xpath = "//span[@class='close-notification-btn']")
	private WebElement NotificationClose;
	
	@FindBy(xpath = "//button[text()='Payment Methods']")
	private WebElement PaymentMethodsMenu;

	@FindBy(xpath = "(//input[@placeholder='Search'])[1]")
	private WebElement SearchBoxPaymentMethods;

	@FindBy(xpath = "(//img[@alt='search-icon'])[1]")
	private WebElement SearchButtonPaymentMethods;

	@FindBy(xpath = "//a[text()='Add Payment Method']")
	private WebElement AddPaymentMethodButton;

	@FindBy(xpath = "//h5[text()='Add Payment Method']")
	private WebElement HeadingAddPaymentMethod;

	@FindBy(xpath = "(//button[@class='btn-close'])[2]")
	private WebElement CloseButtonAddEditPaymentMethod;

	@FindBy(xpath = "//label[text()='Method Name ']")
	private WebElement MethodNameLabelAddEditPaymentMethod;

	@FindBy(xpath = "//input[@id='methodName']")
	private WebElement MethodNameFieldAddEditPaymentMethod;

	@FindBy(xpath = "//p[@class='text-danger validation_msg name']")
	private WebElement ValidationMessageMethodNameAddEditPaymentMethod;

	@FindBy(xpath = "//label[text()='Payment Icon']")
	private WebElement PaymentIconLabelAddEditPaymentMethod;

	@FindBy(xpath = "//input[@id='paymentIcon']")
	private WebElement PaymentIconFieldBrowseAddEditPaymentMethod;

	@FindBy(xpath = "//p[@class='text-danger validation_msg method_icon']")
	private WebElement ValidationMessagePaymentIconAddEditPaymentMethod;

	@FindBy(xpath = "//label[text()='Dynamic Fields']")
	private WebElement DynamicFieldsLabelAddEditPaymentMethod;
	
	@FindBy(xpath = "//input[@type='checkbox' and @class='form-check-input']")
	private List<WebElement> DynamicFieldsCheckBoxsInPaymentMethods;

	@FindBy(xpath = "//label[text()='Bank List']")
	private WebElement BankListLabelAndCheckBoxAddEditPaymentMethod;

	@FindBy(xpath = "//label[text()='Wallet ID']")
	private WebElement WalletIDLabelAndCheckBoxAddEditPaymentMethod;

	@FindBy(xpath = "//label[text()='UPI ID']")
	private WebElement UPIIDLabelAndCheckBoxAddEditPaymentMethod;

	@FindBy(xpath = "//label[text()='Phone No']")
	private WebElement PhoneNoLabelAndCheckBoxAddEditPaymentMethod;

	@FindBy(xpath = "//label[text()='QR Code']")
	private WebElement QRCodeLabelAndCheckBoxAddEditPaymentMethod;

	@FindBy(xpath = "//label[text()='Account No.']")
	private WebElement AccountNoLabelAndCheckBoxAddEditPaymentMethod;

	@FindBy(xpath = "(//button[text()='Cancel'])[2]")
	private WebElement CancelButtonAddEditPaymentMethod;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement SubmitButtonAddEditPaymentMethod;	

	@FindBy(xpath = "//div[@class='swich-container']")
	private List<WebElement> StatusToggleKeyPaymentMethods;
	
//	@FindBy(xpath = "//div[@class='toasted-container top-right']")
//	private WebElement ValidationMessageStatusChangePaymentMethod;	

	@FindBy(xpath = "//div[@id='nVFpdgcH6' and @class='toasted-container top-right']")
	private WebElement ValidationMessageStatusChangePaymentMethod;	
	
	@FindBy(xpath = "//div[@class='btn-group option-dd']")
	private List<WebElement> ActionDropdownPaymentMethods;

	@FindBy(xpath = "//i[@class='edit-icon']")
	private List<WebElement> ActionEditIconsPaymentMethods;
	
	@FindBy(xpath = "//h5[text()='Edit Payment Method']")
	private WebElement HeadingEdigPaymentMethod;

	@FindBy(xpath = "//img[@alt='india-flag']")
	private WebElement PaymentIconImageAddEditPaymentMethod;
	
	@FindBy(xpath = "(//select[@id='entries_select'])[1]")
	private WebElement EntriesQtySelectFieldPaymentMethods;
	
	@FindBy(xpath = "//a[@tabindex='0']")
	private List<WebElement> PagesPaymentMethods;
	
	@FindBy(xpath = "(//a[text()='Previous'])[1]")
	private WebElement PreviousButtonPaymentMethods;
	
	@FindBy(xpath = "(//a[text()='Next'])[1]")
	private WebElement NextButtonPaymentMethods;
	
	@FindBy(xpath = "//div[@class='toasted-container top-right']")
	private WebElement ValidationMessageAddEditPaymentMethodCompleted;
	
	//Bank Menu
	@FindBy(xpath = "//button[text()='Banks']")
	private WebElement BanksMenu;
	
	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	private WebElement SearchBoxBanks;

	@FindBy(xpath = "(//img[@alt='search-icon'])[2]")
	private WebElement SearchButtonBanks;
	
	@FindBy(xpath = "//a[text()='Add Bank']")
	private WebElement AddBankButton;
	
	@FindBy(xpath = "//h5[text()='Add Bank']")
	private WebElement HeadingAddBank;	
	
	@FindBy(xpath = "(//button[@class='btn-close'])[3]")
	private WebElement CloseButtonAddEditBank;	
	
	@FindBy(xpath = "//label[text()='Bank Name']")
	private WebElement BankNameLabelAddEditBank;	
	
	@FindBy(xpath = "//input[@id='bank_name']")
	private WebElement BankNameFieldAddEditBank;
	
	@FindBy(xpath = "//p[@class='text-danger validation_msg bank_name']")
	private WebElement ValidationMessageBankNameField;
	
	@FindBy(xpath = "//label[@for='country']")
	private WebElement CountryLabelAddEditBank;	
	
	@FindBy(xpath = "//select[@name='country']")
	private WebElement SelectCountryDropdownAddEditBank;
	
	@FindBy(xpath = "//p[@class='text-danger validation_msg country']")
	private WebElement ValidationMessageSelectBankCountryName;
	
	@FindBy(xpath = "//span[text()='Automation']")
	private WebElement AutomationLabelAddEditBank;	
	
	@FindBy(xpath = "//input[@id='isAutomationAllow']")
	private WebElement AutomationCheckBoxAddEditBank;	
	
	@FindBy(xpath = "//label[text()='Bank Icon']")
	private WebElement BankIconLabelAddEditBank;	
	
	@FindBy(xpath = "//input[@id='icon']")
	private WebElement BankIconFieldChooseFileAddEditBank;		

	@FindBy(xpath = "//p[@class='text-danger validation_msg']")
	private WebElement ValidationMessageBankIconChooseFile;
	
	@FindBy(xpath = "(//button[@class='btn btn-secondary'])[2]")
	private WebElement CancleButtonAddEditBank;	
	
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
	private WebElement SubmitButtonAddEditBank;	
	
	@FindBy(xpath = "//div[@class='toasted-container top-right']")
	private WebElement ValidationMessageAddEditBankDetails;	
	
	@FindBy(xpath = "//span[text()='Add Label']")
	private WebElement AddLabelButtonAddEditBank;	
	
	@FindBy(xpath = "//h5[text()='Add Field']")
	private WebElement AddLabelPopupHeadingAddEditBank;	
	
	@FindBy(xpath = "//label[@for='addLabel']")
	private WebElement AddLabelPopupFieldLebelAddEditBank;	
	
	@FindBy(xpath = "//input[@placeholder='Enter here']")
	private WebElement TextBoxAddFieldAddEditBank;	
	
	@FindBy(xpath = "(//button[@class='btn-close'])[4]")
	private WebElement CloseButtonAddFieldAddEditBank;	
	
	@FindBy(xpath = "(//button[@class='btn btn-secondary'])[3]")
	private WebElement CancelButtonAddFieldAddEditBank;	
	
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
	private WebElement SubmitButtonAddFieldAddEditBank;
	
	@FindBy(xpath = "//label[text()='Address']")
	private WebElement AddressNewFieldAdd;
	
	@FindBy(xpath = "//label[text()='IFSC Code']")
	private WebElement IFSCCodeNewFieldAdd;
	
	@FindBy(xpath = "//a[text()='Remove']")
	private List<WebElement> RemoveFieldsAddBank;
	
	@FindBy(xpath = "//div[@class='swich-container']")
	private List<WebElement> StatusToggleKeyBanks;
	
	@FindBy(xpath = "//div[@id='nVFpdgcH6' and @class='toasted-container top-right']")
	private WebElement ValidationMessageStatusChangeBank;	
	
	@FindBy(xpath = "//div[@class='btn-group option-dd']")
	private List<WebElement> ActionDropdownBanks;
	
	@FindBy(xpath = "//i[@class='edit-icon']")
	private List<WebElement> ActionEditIconsBanks;
	
	@FindBy(xpath = "(//select[@id='entries_select'])[2]")
	private WebElement EntriesQtySelectFieldBanks;
	
	@FindBy(xpath = "//h5[text()='Edit Bank']")
	private WebElement HeadingEditBank;	
	
	@FindBy(xpath = "//a[@tabindex='0']")
	private List<WebElement> PagesBanks;
	
	@FindBy(xpath = "(//a[text()='Previous'])[2]")
	private WebElement PreviousButtonBanks;
	
	@FindBy(xpath = "(//a[text()='Next'])[2]")
	private WebElement NextButtonBanks;
	
	@FindBy(xpath = "//span[text()='Payment Range']")
	private WebElement PaymentRangeModule;
	
	@FindBy(xpath = "//label[@for='exampleInputEmail1']")
	private WebElement NewAddFieldLabel;
	
	
	
	public ManageIDPage1(WebDriver driver) {
		this.driver=driver;
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
	
	public void FunctionAvailableManageIdModule() throws InterruptedException {
	System.out.println("1. Verify Functionality and availability of Manage ID Module");
	login();
	Thread.sleep(2000);	
	System.out.println("Manage ID Module is Enabled : " + ManageIDModule.isEnabled());
	System.out.println("Manage ID Module is Displayed : " + ManageIDModule.isDisplayed());
	String ManageIDModuleText = ManageIDModule.getText();
	System.out.println("Manage ID Module Text : " + ManageIDModuleText);
	if(ManageIDModuleText.equals("Manage ID")) {
		System.out.println("Manage ID Module Text is CORRECT");
	}
	else {
		System.out.println("Manage ID Module Text is WRONG");
	}
	System.out.println();
	PaymentRangeModule.click();
	Thread.sleep(2000);
	System.out.println("click on Payment Range Module");
	ManageIDModule.click();
	Thread.sleep(2000);
	System.out.println("click on Manage ID Module");
	LogoutTop.click();
	Thread.sleep(2000);
	System.out.println("click on Logout Top Button");	
	}
	
	public void FunctionAvailableBothLogoutButtonManageID() throws InterruptedException {
		System.out.println("2. Verify Functionality and avaibality of Both Logout Button Manage ID Module");
		login();
		ManageIDModule.click();
		Thread.sleep(2000);
		System.out.println("click on Manage ID Module");
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
	
	public void FunctionAvailableValidMessageNotificationButtonManageID() throws InterruptedException {
		System.out.println("3. Verify Functionality, avaibality and validation message of Notification Button Manage ID Module");
		login();
		ManageIDModule.click();
		Thread.sleep(2000);
		System.out.println("click on Manage ID Module");
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
	
	public void GetIdLogoDisplayedEnabledManageID() throws InterruptedException {
		System.out.println("4. Verify GetId Logo is Displayed and Enabled on Manage Id Page");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		Thread.sleep(2000);
		System.out.println("click on Manage ID Module");
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
	
	public void FunctionalityAvailabilityPaymentMethodsMenu() throws InterruptedException {
		System.out.println("5. Verify Functionality and avaibality of Payment Methods Menu");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		Thread.sleep(2000);
		System.out.println("click on Manage ID Module");		
		System.out.println("Payment Methods Menu is Enabled : " + PaymentMethodsMenu.isEnabled());
		System.out.println("Payment Methods Menu is Displayed : " + PaymentMethodsMenu.isDisplayed());
		BanksMenu.click();
		Thread.sleep(2000);
		System.out.println("click on Banks Menu");	
		PaymentMethodsMenu.click();
		Thread.sleep(2000);
		System.out.println("click on Payment Methods Menu ");	
		String PaymentMethodsMenuText = PaymentMethodsMenu.getText();
		System.out.println("Payment Methods Menu Text : " + PaymentMethodsMenuText);
		if(PaymentMethodsMenuText.equals("Payment Methods")) {
			System.out.println("Payment Methods Menu Text is CORRECT");
		}
		else {
			System.out.println("Payment Methods Menu Text is WRONG");
		}
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}
	
	public void FunctionalityAvailabilityBanksMenu() throws InterruptedException {
		System.out.println("6. Verify Functionality and avaibality of Banks Menu");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		Thread.sleep(2000);
		System.out.println("click on Manage ID Module");
		BanksMenu.click();
		Thread.sleep(2000);
		System.out.println("click on Banks Menu");	
		System.out.println("Banks Menu is Enabled : " + BanksMenu.isEnabled());
		System.out.println("Banks Menu is Displayed : " + BanksMenu.isDisplayed());		
		String BanksMenuText = BanksMenu.getText();
		System.out.println("Banks Menu Text : " + BanksMenuText);
		if(BanksMenuText.equals("Banks")) {
			System.out.println("Banks Menu Text is CORRECT");
		}
		else {
			System.out.println("Banks Menu Text is WRONG");
		}
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}
	
	public void FunctionAvailableSearchBoxAndButtonPaymentMethods() throws InterruptedException {
		System.out.println("7. Verify Functionality and avaibality of Search Box and Button in Payment Methods Menu");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		Thread.sleep(2000);
		System.out.println("click on Manage ID Module");
		System.out.println("Search Box Field in Payment Methods is Enabled : " + SearchBoxPaymentMethods.isEnabled());
		System.out.println("Search Box Field in Payment Methods is Displayed : " + SearchBoxPaymentMethods.isDisplayed());
		System.out.println("Search Button in Payment Methods is Enabled : " + SearchButtonPaymentMethods.isEnabled());
		System.out.println("Search Button in Payment Methods is Displayed : " + SearchButtonPaymentMethods.isDisplayed());
		Thread.sleep(2000);
		SearchBoxPaymentMethods.sendKeys("OnlinePay");
		Thread.sleep(2000);
		System.out.println("Enter Text into Search Box");
		SearchButtonPaymentMethods.click();
		Thread.sleep(2000);
		System.out.println("Click on Search Button");
		SearchBoxPaymentMethods.clear();
		Thread.sleep(2000);
		System.out.println("Cleared Text From Search Box");
		SearchBoxPaymentMethods.sendKeys("Test122");
		Thread.sleep(1000);
		System.out.println("Enter Text into Search Box");
		SearchBoxPaymentMethods.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Press Enter Key for showing search result");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}
	
	public void FunctionalityAvailabilityAddPaymentMethodButton() throws InterruptedException {
		System.out.println("8. Verify Functionality and avaibality of Add Payment Method Button");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		Thread.sleep(2000);
		System.out.println("click on Manage ID Module");
		System.out.println("Add Payment Method Button is Enabled : " + AddPaymentMethodButton.isEnabled());
		System.out.println("Add Payment Method Button is Displayed : " + AddPaymentMethodButton.isDisplayed());
		Thread.sleep(2000);
		String AddPaymentMethodButtonText = AddPaymentMethodButton.getText();
		System.out.println("Add Payment Method Button Text : " + AddPaymentMethodButtonText);
		Thread.sleep(2000);
		if(AddPaymentMethodButtonText.equals("Add Payment Method")) {
			System.out.println("Add Payment Method Button text is CORRECT");
		}
		else {
			System.out.println("Add Payment Method Button text is WRONG");
		}
		Thread.sleep(2000);
		AddPaymentMethodButton.click();
		System.out.println("click on Add Payment Method Button");
		Thread.sleep(2000);
		CloseButtonAddEditPaymentMethod.click();
		System.out.println("click on CloseButton AddEditPaymentMethod ");
		Thread.sleep(2000);
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}
	
	public void FunctionalityAvailabilityButtonsFieldsAddPaymentMethodDetails() throws InterruptedException {
		System.out.println("9. Verify Functionality and avaibality of Button and Fields in Add Payment Method Details form");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		Thread.sleep(2000);
		System.out.println("click on Manage ID Module");
		AddPaymentMethodButton.click();
		System.out.println("click on Add Payment Method Button");
		Thread.sleep(2000);
		String HeadingAddPaymentMethodText = HeadingAddPaymentMethod.getText();
		System.out.println("Heading Add Payment Method Text : " + HeadingAddPaymentMethodText);
		if(HeadingAddPaymentMethodText.equals("Add Payment Method")) {
			System.out.println("Add Payment Method Heading Text is CORRECT");
		}
		else {
			System.out.println("Add Payment Method Heading Text is WRONG");
		}
		Thread.sleep(2000);
		String MethodNameLabelAddEditPaymentMethodText = MethodNameLabelAddEditPaymentMethod.getText();
		System.out.println("Method Name Label in Add Payment Method Text : " + MethodNameLabelAddEditPaymentMethodText);
		if(MethodNameLabelAddEditPaymentMethodText.equals("Method Name")) {
			System.out.println("Method Name Label in Add Payment Method Text is CORRECT ");
		}
		else {
			System.out.println("Method Name Label in Add Payment Method Text is WRONG ");
		}
		Thread.sleep(2000);
		System.out.println("Method Name Field in Add Payment Method is Enabled : " + MethodNameFieldAddEditPaymentMethod.isEnabled());
		System.out.println("Method Name Field in Add Payment Method is Displayed : " + MethodNameFieldAddEditPaymentMethod.isDisplayed());
		Thread.sleep(2000);
		
		String PaymentIconLabelAddEditPaymentMethodText = PaymentIconLabelAddEditPaymentMethod.getText();
		System.out.println("Payment Icon Label in Add Payment Method Text : " + PaymentIconLabelAddEditPaymentMethodText);
		if(PaymentIconLabelAddEditPaymentMethodText.equals("Payment Icon")) {
			System.out.println("Payment Icon Label in Add Payment Method Text is CORRECT ");
		}
		else {
			System.out.println("Payment Icon Label in Add Payment Method Text is WRONG ");
		}
		Thread.sleep(2000);
		System.out.println("Payment Icon Browse Field in Add Payment Method is Enabled : " + PaymentIconFieldBrowseAddEditPaymentMethod.isEnabled());
		System.out.println("Payment Icon Browse Field in Add Payment Method is Displayed : " + PaymentIconFieldBrowseAddEditPaymentMethod.isDisplayed());
		Thread.sleep(2000);
		
		//Dynamic Fields
		String DynamicFieldsLabelAddEditPaymentMethodText = DynamicFieldsLabelAddEditPaymentMethod.getText();
		System.out.println("Dynamic Fields Label in Add Payment Method Text : " + DynamicFieldsLabelAddEditPaymentMethodText);
		if(DynamicFieldsLabelAddEditPaymentMethodText.equals("Dynamic Fields")) {
			System.out.println("Dynamic Fields Label in Add Payment Method Text is CORRECT");
		}
		else {
			System.out.println("Dynamic Fields Label in Add Payment Method Text is WRONG");
		}
		Thread.sleep(2000);
		
		System.out.println("Bank List Label And CheckBox in Add Payment Method is Enabled : " + BankListLabelAndCheckBoxAddEditPaymentMethod.isEnabled());
		System.out.println("Bank List Label And CheckBox in Add Payment Method is Displayed : " + BankListLabelAndCheckBoxAddEditPaymentMethod.isDisplayed());
		String BankListLabelAndCheckBoxAddEditPaymentMethodText = BankListLabelAndCheckBoxAddEditPaymentMethod.getText();
		System.out.println("Bank List Label And CheckBox in Add Payment Method Text : " + BankListLabelAndCheckBoxAddEditPaymentMethodText);		
		Thread.sleep(2000);		
		if(BankListLabelAndCheckBoxAddEditPaymentMethodText.equals("Bank List")) {
			System.out.println("Bank List Label And CheckBox in Add Payment Method Text is CORRECT");
		}
		else {
			System.out.println("Bank List Label And CheckBox in Add Payment Method Text is WRONG");
		}
		Thread.sleep(2000);
		
		System.out.println("Wallet ID Label And CheckBox in Add Payment Method is Enabled : " + WalletIDLabelAndCheckBoxAddEditPaymentMethod.isEnabled());
		System.out.println("Wallet ID Label And CheckBox in Add Payment Method is Displayed : " + WalletIDLabelAndCheckBoxAddEditPaymentMethod.isDisplayed());
		String WalletIDLabelAndCheckBoxAddEditPaymentMethodText = WalletIDLabelAndCheckBoxAddEditPaymentMethod.getText();
		System.out.println("Bank List Label And CheckBox in Add Payment Method Text : " + WalletIDLabelAndCheckBoxAddEditPaymentMethodText);		
		Thread.sleep(2000);
		if(WalletIDLabelAndCheckBoxAddEditPaymentMethodText.equals("Wallet ID")) {
			System.out.println("Wallet ID Label And CheckBox in Add Payment Method Text is CORRECT");
		}
		else {
			System.out.println("Wallet ID Label And CheckBox in Add Payment Method Text is WRONG");
		}
		Thread.sleep(2000);

		System.out.println("UPI ID Label And CheckBox in Add Payment Method is Enabled : " + UPIIDLabelAndCheckBoxAddEditPaymentMethod.isEnabled());
		System.out.println("UPI ID Label And CheckBox in Add Payment Method is Displayed : " + UPIIDLabelAndCheckBoxAddEditPaymentMethod.isDisplayed());
		String UPIIDLabelAndCheckBoxAddEditPaymentMethodText = UPIIDLabelAndCheckBoxAddEditPaymentMethod.getText();
		System.out.println("UPI ID Label And CheckBox in Add Payment Method Text : " + UPIIDLabelAndCheckBoxAddEditPaymentMethodText);		
		Thread.sleep(2000);
		if(WalletIDLabelAndCheckBoxAddEditPaymentMethodText.equals("UPI ID")) {
			System.out.println("UPI ID Label And CheckBox in Add Payment Method Text is CORRECT");
		}
		else {
			System.out.println("UPI ID Label And CheckBox in Add Payment Method Text is WRONG");
		}
		Thread.sleep(2000);
		
		System.out.println("Phone No Label And CheckBox in Add Payment Method is Enabled : " + PhoneNoLabelAndCheckBoxAddEditPaymentMethod.isEnabled());
		System.out.println("Phone No Label And CheckBox in Add Payment Method is Displayed : " + PhoneNoLabelAndCheckBoxAddEditPaymentMethod.isDisplayed());
		String PhoneNoLabelAndCheckBoxAddEditPaymentMethodText = PhoneNoLabelAndCheckBoxAddEditPaymentMethod.getText();
		System.out.println("Phone No Label And CheckBox in Add Payment Method Text : " + PhoneNoLabelAndCheckBoxAddEditPaymentMethodText);		
		Thread.sleep(2000);
		if(PhoneNoLabelAndCheckBoxAddEditPaymentMethodText.equals("Phone No")) {
			System.out.println("Phone No Label And CheckBox in Add Payment Method Text is CORRECT");
		}
		else {
			System.out.println("Phone No Label And CheckBox in Add Payment Method Text is WRONG");
		}
		Thread.sleep(2000);
		
		System.out.println("QR Code Label And CheckBox in Add Payment Method is Enabled : " + QRCodeLabelAndCheckBoxAddEditPaymentMethod.isEnabled());
		System.out.println("QR Code Label And CheckBox in Add Payment Method is Displayed : " + QRCodeLabelAndCheckBoxAddEditPaymentMethod.isDisplayed());
		String QRCodeLabelAndCheckBoxAddEditPaymentMethodText = QRCodeLabelAndCheckBoxAddEditPaymentMethod.getText();
		System.out.println("QR Code Label And CheckBox in Add Payment Method Text : " + QRCodeLabelAndCheckBoxAddEditPaymentMethodText);		
		Thread.sleep(2000);
		if(QRCodeLabelAndCheckBoxAddEditPaymentMethodText.equals("QR Code")) {
			System.out.println("QR Code Label And CheckBox in Add Payment Method Text is CORRECT");
		}
		else {
			System.out.println("QR Code Label And CheckBox in Add Payment Method Text is WRONG");
		}
		Thread.sleep(2000);
		
		System.out.println("Account No. Label And CheckBox in Add Payment Method is Enabled : " + AccountNoLabelAndCheckBoxAddEditPaymentMethod.isEnabled());
		System.out.println("Account No. Label And CheckBox in Add Payment Method is Displayed : " + AccountNoLabelAndCheckBoxAddEditPaymentMethod.isDisplayed());
		String AccountNoLabelAndCheckBoxAddEditPaymentMethodText = AccountNoLabelAndCheckBoxAddEditPaymentMethod.getText();
		System.out.println("Account No. Label And CheckBox in Add Payment Method Text : " + AccountNoLabelAndCheckBoxAddEditPaymentMethodText);		
		Thread.sleep(2000);
		if(AccountNoLabelAndCheckBoxAddEditPaymentMethodText.equals("Account No.")) {
			System.out.println("Account No. Label And CheckBox in Add Payment Method Text is CORRECT");
		}
		else {
			System.out.println("Account No. Label And CheckBox in Add Payment Method Text is WRONG");
		}
		Thread.sleep(2000);
		
		System.out.println("Close Button in Add Payment Method is Enabled : " + CloseButtonAddEditPaymentMethod.isEnabled());
		System.out.println("Close Button in Add Payment Method is Displayed : " + CloseButtonAddEditPaymentMethod.isDisplayed());
		Thread.sleep(2000);
		CloseButtonAddEditPaymentMethod.click();
		System.out.println("Click on Close Button in Payment Add Method");
		Thread.sleep(2000);
		AddPaymentMethodButton.click();
		System.out.println("click on Add Payment Method Button");
		Thread.sleep(2000);
		System.out.println("Cancel Button in Add Payment Method is Enabled : " + CancelButtonAddEditPaymentMethod.isEnabled());
		System.out.println("Cancel Button in Add Payment Method is Displayed : " + CancelButtonAddEditPaymentMethod.isDisplayed());
		
		String SubmitButtonAddEditPaymentMethodText = SubmitButtonAddEditPaymentMethod.getText();
		System.out.println("Submit Button Text in Add Payment Method : " + SubmitButtonAddEditPaymentMethodText);
		if(SubmitButtonAddEditPaymentMethodText.equals("Submit")) {
			System.out.println("Submit Button Text in Add Payment Method is CORRECT");
		}
		else {
			System.out.println("Submit Button Text in Add Payment Method is WRONG");
		}
		
		System.out.println("Cancel Button in Add Payment Method is Enabled : " + CancelButtonAddEditPaymentMethod.isEnabled());
		System.out.println("Cancel Button in Add Payment Method is Displayed : " + CancelButtonAddEditPaymentMethod.isDisplayed());
		
		String CancelButtonAddEditPaymentMethodText = CancelButtonAddEditPaymentMethod.getText();
		System.out.println("Cancel Button Text in Add Payment Method : " + CancelButtonAddEditPaymentMethodText);
		if(CancelButtonAddEditPaymentMethodText.equals("Cancel")) {
			System.out.println("Cancel Button Text in Add Payment Method is CORRECT");
		}
		else {
			System.out.println("Cancel Button Text in Add Payment Method is WRONG");
		}
		Thread.sleep(2000);
		CancelButtonAddEditPaymentMethod.click();
		System.out.println("Click on Close Button in Payment Add Method");
		Thread.sleep(2000);
		AddPaymentMethodButton.click();
		System.out.println("click on Add Payment Method Button");
		Thread.sleep(2000);
		
		MethodNameFieldAddEditPaymentMethod.sendKeys("TestOnline1");
		System.out.println("Entered TestOnline Text into Method Name Field");
		Thread.sleep(2000);
		PaymentIconFieldBrowseAddEditPaymentMethod.sendKeys("C:\\Users\\aarrsol\\Downloads\\PayMoney.png");
		System.out.println("Import Payment Icon from given path");
		Thread.sleep(2000);
		
		BankListLabelAndCheckBoxAddEditPaymentMethod.click();
		Thread.sleep(1000);
		System.out.println("Bank List CheckBox in Add Payment Method is Selected : " + DynamicFieldsCheckBoxsInPaymentMethods.get(0).isSelected());
		Thread.sleep(1000);
		WalletIDLabelAndCheckBoxAddEditPaymentMethod.click();
		Thread.sleep(1000);
		System.out.println("Wallet ID CheckBox in Add Payment Method is Selected : " + DynamicFieldsCheckBoxsInPaymentMethods.get(1).isSelected());
		Thread.sleep(1000);
		UPIIDLabelAndCheckBoxAddEditPaymentMethod.click();
		Thread.sleep(1000);
		System.out.println("UPI ID CheckBox in Add Payment Method is Selected : " + DynamicFieldsCheckBoxsInPaymentMethods.get(2).isSelected());
		Thread.sleep(1000);
		PhoneNoLabelAndCheckBoxAddEditPaymentMethod.click();
		Thread.sleep(1000);
		System.out.println("Phone No CheckBox in Add Payment Method is Selected : " + DynamicFieldsCheckBoxsInPaymentMethods.get(3).isSelected());
		Thread.sleep(1000);
		QRCodeLabelAndCheckBoxAddEditPaymentMethod.click();
		Thread.sleep(1000);
		System.out.println("QR Code CheckBox in Add Payment Method is Selected : " + DynamicFieldsCheckBoxsInPaymentMethods.get(4).isSelected());
		Thread.sleep(1000);
		AccountNoLabelAndCheckBoxAddEditPaymentMethod.click();
		Thread.sleep(1000);
		System.out.println("Account No CheckBox in Add Payment Method is Selected : " + DynamicFieldsCheckBoxsInPaymentMethods.get(5).isSelected());
		Thread.sleep(2000);
		SubmitButtonAddEditPaymentMethod.click();
		System.out.println("Click on Submit Button in Add Payment Method");
		Thread.sleep(2000);
		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}
	
	public void FunctionalityValidationMessageWithBlankDataMandatoryFieldsAddPaymentMethodsForm() throws InterruptedException {
		System.out.println("10. Verify Validation Message Mandatory  Fields with blank data in Add Payment Method Details form");		
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		Thread.sleep(2000);
		System.out.println("click on Manage ID Module");
		AddPaymentMethodButton.click();
		System.out.println("click on Add Payment Method Button");
		Thread.sleep(2000);
		SubmitButtonAddEditPaymentMethod.click();
		System.out.println("click on Submit Button Add Payment Method ");
		Thread.sleep(2000);
		String ValidationMessageMethodNameAddEditPaymentMethodText = ValidationMessageMethodNameAddEditPaymentMethod.getText();
		System.out.println("Validation Message of Method Name in Add Payment Method Text : " + ValidationMessageMethodNameAddEditPaymentMethodText);
		if(ValidationMessageMethodNameAddEditPaymentMethodText.equals("Method name field is required.")) {
			System.out.println("Validation Message of Method Name in Add Payment Method Text is CORRECT");
		}
		else {
			System.out.println("Validation Message of Method Name in Add Payment Method Text is WRONG");
		}	
		Thread.sleep(2000);
		
		String ValidationMessagePaymentIconAddEditPaymentMethodText=ValidationMessagePaymentIconAddEditPaymentMethod.getText();
		System.out.println("Validation Message of Payment Icon in Add Payment Method Text : " + ValidationMessagePaymentIconAddEditPaymentMethodText);
		if(ValidationMessagePaymentIconAddEditPaymentMethodText.equals("Payment icon field is required.")) {
			System.out.println("Validation Message of Payment Icon in Add Payment Method Text is CORRECT");
		}
		else {
			System.out.println("Validation Message of Payment Icon in Add Payment Method Text is WRONG");
		}	
		Thread.sleep(2000);
		CloseButtonAddEditPaymentMethod.click();
		System.out.println("click on Close Button Add Payment Method ");
		Thread.sleep(2000);
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}
	
	public void FunctionlityValidationMessageWithInvlidDataMandatoryFieldsAddPaymentMethodsForm() throws InterruptedException {
		System.out.println("11. Verify Validation Message Mandatory  Fields with invalid data in Add Payment Method Details form");		
		login();
		Thread.sleep(2000);
		ManageIDModule.click();		
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);
		AddPaymentMethodButton.click();
		System.out.println("click on Add Payment Method Button");
		Thread.sleep(2000);
		MethodNameFieldAddEditPaymentMethod.sendKeys("123");
		System.out.println("Entered Invalid Method Name");
		Thread.sleep(2000);
		SubmitButtonAddEditPaymentMethod.click();
		System.out.println("click on Submit Button Add Payment Method ");
		Thread.sleep(2000);
		String ValidationMessageMethodNameAddEditPaymentMethodText=ValidationMessageMethodNameAddEditPaymentMethod.getText();
		System.out.println("Validation Message With Invalid Method Name in Add Payment Method Text : " + ValidationMessageMethodNameAddEditPaymentMethodText);
		if(ValidationMessageMethodNameAddEditPaymentMethodText.equals("Invalid method name")) {
			System.out.println("Validation Message With Invalid Method Name in Add Payment Method Text is CORRECT");
		}
		else {
			System.out.println("Validation Message With Invalid Method Name in Add Payment Method Text is WRONG");
		}
		Thread.sleep(2000);
		
		PaymentIconFieldBrowseAddEditPaymentMethod.sendKeys("C:\\Users\\aarrsol\\Downloads\\PayMoney.png");
		System.out.println("Inport Payment icon from specified path");
		Thread.sleep(2000);
		SubmitButtonAddEditPaymentMethod.click();
		System.out.println("Again click on Submit Button Add Payment Method ");
		Thread.sleep(2000);
		String ValidationMessageMethodNameAddEditPaymentMethod1Text=ValidationMessageMethodNameAddEditPaymentMethod.getText();
		System.out.println("Validation Message With Invalid Method Name in Add Payment Method Text : " + ValidationMessageMethodNameAddEditPaymentMethod1Text);
		if(ValidationMessageMethodNameAddEditPaymentMethod1Text.equals("Invalid method name")) {
			System.out.println("Validation Message With Invalid Method Name in Add Payment Method Text is CORRECT");
		}
		else {
			System.out.println("Validation Message With Invalid Method Name in Add Payment Method Text is WRONG");
		}
		Thread.sleep(2000);
		CloseButtonAddEditPaymentMethod.click();
		System.out.println("click on Close Button Add Payment Method ");
		Thread.sleep(2000);
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}
	
	public void FunctionlityValidationMessageWithValidDataMandatoryFieldsAddPaymentMethodsForm() throws InterruptedException {
		System.out.println("12. Verify Functionality and  Validation Message Mandatory  Fields with Ialid Data in Add Payment Method Details form");		
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);
		
		AddPaymentMethodButton.click();
		System.out.println("click on Add Payment Method Button");
		Thread.sleep(2000);
		MethodNameFieldAddEditPaymentMethod.sendKeys("RuPay");
		System.out.println("Entered Valid Method Name");
		Thread.sleep(2000);		

		PaymentIconFieldBrowseAddEditPaymentMethod.sendKeys("C:\\Users\\aarrsol\\Downloads\\PayMoney.png");
		System.out.println("Inport Payment icon from specified path");
		Thread.sleep(2000);		
		UPIIDLabelAndCheckBoxAddEditPaymentMethod.click();
		System.out.println("Click on UPI ID Check Box");
		Thread.sleep(1000);
		PhoneNoLabelAndCheckBoxAddEditPaymentMethod.click();
		System.out.println("Click on Phone No Check Box");
		Thread.sleep(1000);
		QRCodeLabelAndCheckBoxAddEditPaymentMethod.click();
		System.out.println("Click on QR Code Check Box");
		Thread.sleep(1000);
		SubmitButtonAddEditPaymentMethod.click();
		System.out.println("Click on Submit Button Add Payment Method ");
		Thread.sleep(2000);	
		
		String ValidationMessageAddEditPaymentMethodCompletedText=ValidationMessageAddEditPaymentMethodCompleted.getText();
		System.out.println("Validation Message After Add Payment Methods Details Completed Text : " + ValidationMessageAddEditPaymentMethodCompletedText);
		if(ValidationMessageAddEditPaymentMethodCompletedText.equals("Payment method updated successfully.")) {
			System.out.println("Validation Message After Add Payment Methods Details Completed Text is CORRECT");
		}
		else {
			System.out.println("Validation Message After Add Payment Methods Details Completed Text is WRONG");
		}
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}
	
	public void FuncitonalityAvailabityValidationMessageStatusToggleKeyPaymentMethodsMenu() throws InterruptedException {
		System.out.println("13. Verify Functionality, Avaibality and Validation Message of Status toggle key of Payment Methods Menu");		
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(5000);
		
		StatusToggleKeyPaymentMethods.get(0).click();
		System.out.println("Click on Toggle key of First Payment Method");
		Thread.sleep(2000);		
		String ValidationMessageStatusChangePaymentMethodText=ValidationMessageStatusChangePaymentMethod.getText();
		System.out.println("Validation Message Inactive Status Change Text in Payment Method : " + ValidationMessageStatusChangePaymentMethodText);
		if(ValidationMessageStatusChangePaymentMethodText.equals("Payment method status is inactive updated successfully.")) {
			System.out.println("Validation Message Inactive Status Change Text in Payment Method is CORRECT");
		}
		else {
			System.out.println("Validation Message Inactive Status Change Text in Payment Method is WRONG");
		}
		
		StatusToggleKeyPaymentMethods.get(0).click();
		System.out.println("Click on Toggle key of First Payment Method");
		Thread.sleep(2000);		
		String ValidationMessageStatusChangePaymentMethod1Text=ValidationMessageStatusChangePaymentMethod.getText();
		System.out.println("Validation Message Active Status Change Text in Payment Method : " + ValidationMessageStatusChangePaymentMethod1Text);
		if(ValidationMessageStatusChangePaymentMethod1Text.equals("Payment method status is active updated successfully.")) {
			System.out.println("Validation Message Active Status Change Text in Payment Method is CORRECT");
		}
		else {
			System.out.println("Validation Message Active Status Change Text in Payment Method is WRONG");
		}
		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}

	public void FuncitonalityAvailabityValidationMessageActionDropdownEditButtonPaymentMethod() throws InterruptedException {
		System.out.println("14. Verify Functionality, Avaibality and Validation Message of  Action Dropdown and Edit Button of Payment Methods Menu");		
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);
		
		System.out.println("Action Dropdown is Enabled : "+ActionDropdownPaymentMethods.get(0).isEnabled());
		System.out.println("Action Dropdown is Dispalyed : "+ActionDropdownPaymentMethods.get(0).isDisplayed());
		Thread.sleep(2000);
		ActionDropdownPaymentMethods.get(0).click();
		System.out.println("click on Action Dropdown of Payment Method");
		Thread.sleep(2000);
		
		System.out.println("Edit Button is Enabled : "+ActionEditIconsPaymentMethods.get(0).isEnabled());
		System.out.println("Edit Button is Dispalyed : "+ActionEditIconsPaymentMethods.get(0).isDisplayed());
		ActionEditIconsPaymentMethods.get(0).click();
		System.out.println("click on Edit Icon of Payment Method");
		Thread.sleep(2000);
		UPIIDLabelAndCheckBoxAddEditPaymentMethod.click();
		System.out.println("click on UPI ID CheckBox of Payment Method");
		Thread.sleep(2000);		
		SubmitButtonAddEditPaymentMethod.click();
		System.out.println("click on Submit Button of Payment Method");
		Thread.sleep(2000);
		
		String ValidationMessageAddEditPaymentMethodCompletedText=ValidationMessageAddEditPaymentMethodCompleted.getText();
		System.out.println("Validation Message Text  of Edit Payment Method Completed : " + ValidationMessageAddEditPaymentMethodCompletedText);
		if(ValidationMessageAddEditPaymentMethodCompletedText.equals("Payment method updated successfully.")) {
			System.out.println("Validation Message Text  of Edit Payment Method Completed is CORRECT");
		}
		else {
			System.out.println("Validation Message Text  of Edit Payment Method Completed is WRONG");
		}
		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}
	
	public void FunctionalityAvailabilityNoEntriesDropdownPaymentMethodsMenu() throws InterruptedException {
		System.out.println("15. Verify Functionality and availability of  total Number of Entries dropdown of Payment Methods Menu");		
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");
		System.out.println("Qty Entries Select Dropdown of Payment Method is Enabled : "+EntriesQtySelectFieldPaymentMethods.isEnabled());
		System.out.println("Qty Entries Select Dropdown of Payment Method is Dispalyed : "+EntriesQtySelectFieldPaymentMethods.isDisplayed());
		Thread.sleep(2000);
		
		Select sel1 = new Select(EntriesQtySelectFieldPaymentMethods);
		sel1.selectByIndex(1);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");
		String EntriesQtySelectFieldPaymentMethodsText = EntriesQtySelectFieldPaymentMethods.getText();
		System.out.println("Entries Qty Select Dropdown of Payment Methods Text : " + EntriesQtySelectFieldPaymentMethodsText);
		Thread.sleep(3000);
		sel1.selectByVisibleText("100");
		String EntriesQtySelectFieldPaymentMethods1Text = EntriesQtySelectFieldPaymentMethods.getText();
		System.out.println("Entries Qty Select Dropdown of Payment Methods Text : " + EntriesQtySelectFieldPaymentMethods1Text);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");
		Thread.sleep(3000);
		
		sel1.selectByValue("25");
		String EntriesQtySelectFieldPaymentMethods2Text = EntriesQtySelectFieldPaymentMethods.getText();
		System.out.println("Entries Qty Select Dropdown of Payment Methods Text : " + EntriesQtySelectFieldPaymentMethods2Text);
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");		
	}
		
	public void FunctionalityAvailabilityPagesPreviousNextButtonOfPaymentMethods() throws InterruptedException {
		System.out.println("16. Verify Functionality and availability of Pages, Previous and next button of  Payment Methods Menu");		
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");	
		
		System.out.println("Page Number 2 of Payment Methods is Enabled : " + PagesPaymentMethods.get(1).isEnabled());
		System.out.println("Page Number 2 of Payment Methods is Displayed : " + PagesPaymentMethods.get(1).isDisplayed());
		System.out.println("Page Number 1 of Payment Methods is Enabled : " + PagesPaymentMethods.get(0).isEnabled());
		System.out.println("Page Number 1 of Payment Methods is Displayed : " + PagesPaymentMethods.get(0).isDisplayed());
		System.out.println("Next Button of Payment Methods is Enabled : " + NextButtonPaymentMethods.isEnabled());
		System.out.println("Next Button of Payment Methods is Displayed : " + NextButtonPaymentMethods.isDisplayed());
		Thread.sleep(2000);

		NextButtonPaymentMethods.click();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");	
		Thread.sleep(4000);
		System.out.println("Click on Next Button of Payment Methods ");
		System.out.println("Previous Button of Payment Methods is Enabled : " + PreviousButtonPaymentMethods.isEnabled());
		System.out.println("Previous Button of Payment Methods is Displayed : " + PreviousButtonPaymentMethods.isDisplayed());
		PagesPaymentMethods.get(0).click();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");	
		Thread.sleep(4000);		
		PagesPaymentMethods.get(1).sendKeys(Keys.ENTER);
		System.out.println("Click on Page Number 2 of Payment Methods");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");	
		PreviousButtonPaymentMethods.click();
		System.out.println("Click on Previous Button of Payment Methods");		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");	
		Thread.sleep(4000);		
		
		Thread.sleep(4000);
		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");	
	}	
	
	public void FunctionAvailableSearchBoxAndButtonBanks() throws InterruptedException {
		System.out.println("17. Verify Functionality and avaibality of Search Box and Button in Bank Menu");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);		
		BanksMenu.click();
		System.out.println("click on Banks Menu");
		Thread.sleep(2000);		
		System.out.println("Search Box Field in Banks is Enabled : " + SearchBoxBanks.isEnabled());
		System.out.println("Search Box Field in Banks is Displayed : " + SearchBoxBanks.isDisplayed());
		System.out.println("Search Button in Banks is Enabled : " + SearchButtonBanks.isEnabled());
		System.out.println("Search Button in Banks is Displayed : " + SearchButtonBanks.isDisplayed());
		Thread.sleep(2000);
		SearchBoxBanks.sendKeys("Axis Bank");
		System.out.println("Enter Text into Search Box");
		Thread.sleep(2000);		
		SearchButtonBanks.click();
		System.out.println("Click on Search Button");
		Thread.sleep(2000);		
		SearchBoxBanks.clear();
		System.out.println("Cleared Text From Search Box");
		Thread.sleep(2000);		
		SearchBoxBanks.sendKeys("Canara Bank");
		System.out.println("Again Enter Text into Search Box");
		Thread.sleep(1000);		
		SearchBoxBanks.sendKeys(Keys.ENTER);
		System.out.println("Press Enter Key for showing search result");
		Thread.sleep(2000);		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Logout Top Button");
	}
		
	public void FunctionalityAvailabilityAddBankButton() throws InterruptedException	{
		System.out.println("18. Verify Functionality and avaibality of Add Bank Button");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);		
		BanksMenu.click();
		System.out.println("click on Banks Menu");
		Thread.sleep(2000);			
		System.out.println("Add Bank Button in Banks is Enabled : " + AddBankButton.isEnabled());
		System.out.println("Add Bank Button in Banks is Displayed : " + AddBankButton.isDisplayed());
		String AddBankButtonText = AddBankButton.getText();
		System.out.println("Add Bank Button Text : " + AddBankButtonText);
		if(AddBankButtonText.equals("Add Bank")) {
			System.out.println("Add Bank button text is CORRECT");
		}
		else {
			System.out.println("Add Bank button text is WRONG");
		}
		AddBankButton.click();
		System.out.println("click on Add Bank Button");
		Thread.sleep(2000);	
		CloseButtonAddEditBank.click();
		System.out.println("click on Close Button of Add Bank Details");
		Thread.sleep(2000);
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Logout Top Button");		
		
	}
		
	public void FunctionalityAvailabilityButtonAndFieldsAddBankDetailsForm() throws InterruptedException	{
		System.out.println("19. Verify Functionality and avaibality of Button and Fields in Add Bank Details form");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);		
		BanksMenu.click();
		System.out.println("click on Banks Menu");
		Thread.sleep(2000);	
		AddBankButton.click();
		System.out.println("click on Add Bank Button");
		Thread.sleep(2000);	
		
		//Add Bank Heading
		String HeadingAddBankText = HeadingAddBank.getText();
		System.out.println("Heading Text of Add Bank Details form : " + HeadingAddBankText);
		if(HeadingAddBankText.equals("Add Bank")) {
			System.out.println("Heading Text of Add Bank Details form is CORRECT");
		}
		else {
			System.out.println("Heading Text of Add Bank Details form is WRONG");
		}
		Thread.sleep(2000);	
		
		//Bank Name Label
		String BankNameLabelAddEditBankText = BankNameLabelAddEditBank.getText();
		System.out.println("Bank Name Label Text in Add Bank Form : " + BankNameLabelAddEditBankText);
		if(BankNameLabelAddEditBankText.equals("Bank Name")) {
			System.out.println("Bank Name Label Text in Add Bank Form is CORRECT");
		}
		else {
			System.out.println("Bank Name Label Text in Add Bank Form is WRONG");
		}
		Thread.sleep(2000);		
		
		//Bank Name Field
		System.out.println("Bank Name Field in Add Bank Form is Enabled : " + BankNameFieldAddEditBank.isEnabled());
		System.out.println("Bank Name Field in Add Bank Form is Displayed : " + BankNameFieldAddEditBank.isDisplayed());
		BankNameFieldAddEditBank.sendKeys("Test Bank");
		System.out.println("Entered Bank Name in Bank Name Field");
		Thread.sleep(2000);	
		BankNameFieldAddEditBank.clear();
		System.out.println("Cleared Bank Name from Bank Name Field");
		Thread.sleep(2000);	
		
		//Country Label
		String CountryLabelAddEditBankText = CountryLabelAddEditBank.getText();
		System.out.println("Bank Name Label Text in Add Bank Form : " + CountryLabelAddEditBankText);
		if(CountryLabelAddEditBankText.equals("Country ")) {
			System.out.println("Country Label Text in Add Bank Form is CORRECT");
		}
		else {
			System.out.println("Country Label Text in Add Bank Form is WRONG");
		}
		Thread.sleep(2000);	
		
		//Select Country Dropdown filed 
		System.out.println("Select Country Dropdown in Add Bank Form is Enabled : " + SelectCountryDropdownAddEditBank.isEnabled());
		System.out.println("Select Country Dropdown in Add Bank Form is Displayed : " + SelectCountryDropdownAddEditBank.isDisplayed());
		String SelectCountryDropdownAddEditBankText = SelectCountryDropdownAddEditBank.getText();
		System.out.println("Select Country Dropdown Field Text : " + SelectCountryDropdownAddEditBankText);
		if(SelectCountryDropdownAddEditBankText.equals("Select Country")) {
			System.out.println("Select Country Dropdown Field Text is CORRECT");
		}
		else {
			System.out.println("Select Country Dropdown Field Text is WRONG");
		}
		
		Select sel1 = new Select(SelectCountryDropdownAddEditBank);
		List<WebElement> AllCountryName = sel1.getOptions();
		System.out.println("Total Size of Countries are : " +  AllCountryName.size());
		for(WebElement ele : AllCountryName) {
			String CountryText = ele.getText();
			System.out.println(CountryText);
		}
		
		Thread.sleep(2000);	
		sel1.selectByVisibleText("India");
		System.out.println("Select India Country from Select Dropdown");
		Thread.sleep(2000);	
		
		//Automation Label
		String AutomationLabelAddEditBankText = AutomationLabelAddEditBank.getText();
		System.out.println("Automation Label Text in Add Bank Form : " + AutomationLabelAddEditBankText);
		if(AutomationLabelAddEditBankText.equals("Automation")) {
			System.out.println("Automation Label Text in Add Bank Form is CORRECT");
		}
		else {
			System.out.println("Automation Label Text in Add Bank Form is WRONG");
		}		
		
		//Automation Checkbox
		System.out.println("Automation Checkbox in Add Bank Form is Enabled : " + AutomationCheckBoxAddEditBank.isEnabled());
		System.out.println("Automation Checkbox in Add Bank Form is Displayed : " + AutomationCheckBoxAddEditBank.isDisplayed());
		AutomationCheckBoxAddEditBank.click();
		System.out.println("Click on Automation Checkbox");
		Thread.sleep(2000);	
		System.out.println("Automation Checkbox is Selected : " + AutomationCheckBoxAddEditBank.isSelected());
		Thread.sleep(2000);	
		AutomationCheckBoxAddEditBank.click();
		System.out.println("Again Click on Automation Checkbox");
		Thread.sleep(2000);	
		System.out.println("Again Automation Checkbox is Selected : " + AutomationCheckBoxAddEditBank.isSelected());
		Thread.sleep(2000);	
		//Bank Icon Label
		String BankIconLabelAddEditBankText = BankIconLabelAddEditBank.getText();
		System.out.println("Automation Label Text in Add Bank Form : " + BankIconLabelAddEditBankText);
		if(BankIconLabelAddEditBankText.equals("Bank Icon")) {
			System.out.println("Bank Icon Label Text in Add Bank Form is CORRECT");
		}
		else {
			System.out.println("Bank Icon Label Text in Add Bank Form is WRONG");
		}
		
		//Bank Icon Choose File Button
		System.out.println("Bank Icon Field Choose File Button in Add Bank Form is Enabled : " + BankIconFieldChooseFileAddEditBank.isEnabled());
		System.out.println("Bank Icon Field Choose File Button in Add Bank Form is Displayed : " + BankIconFieldChooseFileAddEditBank.isDisplayed());		
		Thread.sleep(2000);	
		BankIconFieldChooseFileAddEditBank.sendKeys("C:\\Users\\aarrsol\\Downloads\\PayMoney.png");
		System.out.println("Import Bank Icom image from required destination");
		Thread.sleep(2000);	
		
		//Add Label
		System.out.println("Add Label Button in Add Bank Form is Enabled : " + AddLabelButtonAddEditBank.isEnabled());
		System.out.println("Add Label Button Button in Add Bank Form is Displayed : " + AddLabelButtonAddEditBank.isDisplayed());
		String AddLabelButtonAddEditBankText = AddLabelButtonAddEditBank.getText();
		System.out.println("Add Label Button Choose File Button Text : " + AddLabelButtonAddEditBankText);
		if(AddLabelButtonAddEditBankText.equals("Add Label")) {
			System.out.println("Add Label Button Text is CORRECT");
		}
		else {
			System.out.println("Add Label Button Text is WRONG");
		}
		Thread.sleep(2000);	
		AddLabelButtonAddEditBank.click();
		System.out.println("Click on Add Label Button in Add Bank Form");
		Thread.sleep(2000);	
		CloseButtonAddFieldAddEditBank.click();
		System.out.println("Click on Add Label Button in Add Bank Form");
		Thread.sleep(2000);	
		CloseButtonAddEditBank.click();
		System.out.println("click on Close Button of Add Bank Form");
		Thread.sleep(2000);
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Logout Top Button");	
	}
		
	public void FunctionAvailabelAddLabelCloseCancleAndSubmitButtonOfAddBankDetailsForm() throws InterruptedException {
		System.out.println("20. Verify Functionality and Availability of Add Label, Close, Cancel and Submit Button of Add Bank Details Form");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);		
		BanksMenu.click();
		System.out.println("click on Banks Menu");
		Thread.sleep(2000);	
		AddBankButton.click();
		System.out.println("click on Add Bank Button");
		Thread.sleep(2000);	
		
		//Add Label
		System.out.println("Add Label Button in Add Bank Form is Enabled : " + AddLabelButtonAddEditBank.isEnabled());
		System.out.println("Add Label Button Button in Add Bank Form is Displayed : " + AddLabelButtonAddEditBank.isDisplayed());
		String AddLabelButtonAddEditBankText = AddLabelButtonAddEditBank.getText();
		System.out.println("Add Label Button Choose File Button Text : " + AddLabelButtonAddEditBankText);
		if(AddLabelButtonAddEditBankText.equals("Add Label")) {
			System.out.println("Add Label Button Text is CORRECT");
		}
		else {
			System.out.println("Add Label Button Text is WRONG");
		}
		Thread.sleep(2000);	
		AddLabelButtonAddEditBank.click();
		System.out.println("Click on Add Label button");
		Thread.sleep(2000);	
		String AddLabelPopupHeadingAddEditBankText = AddLabelPopupHeadingAddEditBank.getText();
		System.out.println("Add Label Popup Heading Text of Add Bank Form : " + AddLabelPopupHeadingAddEditBankText);
		if(AddLabelPopupHeadingAddEditBankText.equals("Add Field")) {
			System.out.println("Add Label Popup Heading Text of Add Bank Form is CORRECT");
		}
		else {
			System.out.println("Add Label Popup Heading Text of Add Bank Form is WRONG");
		}
		Thread.sleep(2000);	
		
		String AddLabelPopupFieldLebelAddEditBankText = AddLabelPopupFieldLebelAddEditBank.getText();
		System.out.println("Field Label Text : " + AddLabelPopupFieldLebelAddEditBankText);
		if(AddLabelPopupFieldLebelAddEditBankText.equals("Field Label ")) {
			System.out.println("Field Label Text is CORRECT");
		}
		else {
			System.out.println("Field Label Text is WRONG");
		}
		Thread.sleep(2000);	
		
		System.out.println("TextBox Field of Add Field in Add Bank Form is Enabled : " + TextBoxAddFieldAddEditBank.isEnabled());
		System.out.println("TextBox Field of Add Field in Add Bank Form is Displayed : " + TextBoxAddFieldAddEditBank.isDisplayed());
		TextBoxAddFieldAddEditBank.sendKeys("Address");
		System.out.println("Entered 'Address' Text into Add field textbox");
		Thread.sleep(2000);	
		TextBoxAddFieldAddEditBank.clear();
		System.out.println("Cleared 'Address' Text from Add field textbox");
		Thread.sleep(2000);			
		
		System.out.println("Close Button of Add Field in Add Bank Form is Enabled : " + CloseButtonAddFieldAddEditBank.isEnabled());
		System.out.println("Close Button of Add Field in Add Bank Form is Displayed : " + CloseButtonAddFieldAddEditBank.isDisplayed());
		CloseButtonAddFieldAddEditBank.click();
		System.out.println("Click on Close Button of Add Field Popup");
		Thread.sleep(2000);	
		
		AddLabelButtonAddEditBank.click();
		System.out.println("Again Click on Add Label button");
		Thread.sleep(2000);	
		System.out.println("Cancel Button of Add Field in Add Bank Form is Enabled : " + CancelButtonAddFieldAddEditBank.isEnabled());
		System.out.println("Cancel Button of Add Field in Add Bank Form is Displayed : " + CancelButtonAddFieldAddEditBank.isDisplayed());
		String CancelButtonAddFieldAddEditBankText = CancelButtonAddFieldAddEditBank.getText();
		System.out.println("Cancel Button Text of Add Field : " + CancelButtonAddFieldAddEditBankText );
		if(CancelButtonAddFieldAddEditBankText.equals("Cancel")) {
			System.out.println("Cancel Button Text of Add Field is CORRECT");
		}
		else {
			System.out.println("Cancel Button Text of Add Field is WRONG");
		}
		CancelButtonAddFieldAddEditBank.click();
		System.out.println("Click on Close Button of Add Field Popup");
		Thread.sleep(2000);	
		
		AddLabelButtonAddEditBank.click();
		System.out.println("Again Click on Add Label button");
		Thread.sleep(2000);	
		TextBoxAddFieldAddEditBank.sendKeys("Address");
		System.out.println("Entered 'Address' Text into Add field textbox");
		Thread.sleep(2000);	
		System.out.println("Submit Button of Add Field in Add Bank Form is Enabled : " + SubmitButtonAddFieldAddEditBank.isEnabled());
		System.out.println("Submit Button of Add Field in Add Bank Form is Displayed : " + SubmitButtonAddFieldAddEditBank.isDisplayed());
		String SubmitButtonAddFieldAddEditBankText = SubmitButtonAddFieldAddEditBank.getText();
		System.out.println("Submit Button Text of Add Field : " + SubmitButtonAddFieldAddEditBankText );
		if(SubmitButtonAddFieldAddEditBankText.equals("Submit")) {
			System.out.println("Submit Button Text of Add Field is CORRECT");
		}
		else {
			System.out.println("Submit Button Text of Add Field is WRONG");
		}
		SubmitButtonAddFieldAddEditBank.click();
		System.out.println("Click on Close Button of Add Field Popup");
		Thread.sleep(2000);	
		
		String NewAddFieldLabelText = NewAddFieldLabel.getText();
		System.out.println("New Add Field Label Text : " + NewAddFieldLabelText);
		if(NewAddFieldLabelText.equals("Address")) {
			System.out.println("New Add Field Label Text is CORRECT");
		}
		else {
			System.out.println("New Add Field Label Text is WRONG");
		}
		Thread.sleep(2000);	
		
		System.out.println("Remove Button in Add Bank Form is Enabled : " + RemoveFieldsAddBank.get(0).isEnabled());
		System.out.println("Remove Button in Add Bank Form is Displayed : " + RemoveFieldsAddBank.get(0).isDisplayed());
		RemoveFieldsAddBank.get(0).click();
		System.out.println("Click on remove for deleting new added field");
		Thread.sleep(2000);			
		
		//Close Button in Add Bank
		System.out.println("Close Button in Add Bank Form is Enabled : " + CloseButtonAddEditBank.isEnabled());
		System.out.println("Close Button in Add Bank Form is Displayed : " + CloseButtonAddEditBank.isDisplayed());
		CloseButtonAddEditBank.click();
		System.out.println("Click on Close Button of Add Bank Form");
		Thread.sleep(2000);			
		
		//Cancel Button in add Bank
		AddBankButton.click();
		System.out.println("Click on Add Bank Button");
		Thread.sleep(2000);	
		System.out.println("Cancel Button in Add Bank Form is Enabled : " + CancleButtonAddEditBank.isEnabled());
		System.out.println("Cancel Button in Add Bank Form is Displayed : " + CancleButtonAddEditBank.isDisplayed());
		String CancleButtonAddEditBankText = CancleButtonAddEditBank.getText();
		System.out.println("Cancle Button Add Bank Text : " + CancleButtonAddEditBankText);
		if(CancleButtonAddEditBankText.equals("Cancel")) {
			System.out.println("Cancle Button of Add Bank Text is CORRECT");
		}
		else {
			System.out.println("Cancle Button Add of Bank Text is WRONG");
		}
		Thread.sleep(2000);	
		CancleButtonAddEditBank.click();
		System.out.println("Click on Cancel Button of Add Bank Form");
		Thread.sleep(2000);	
		
		//Submit Button in Add Bank
		AddBankButton.click();
		System.out.println("Click on Add Bank Button");
		Thread.sleep(2000);	
		System.out.println("Submit Button in Add Bank Form is Enabled : " + SubmitButtonAddEditBank.isEnabled());
		System.out.println("Submit Button in Add Bank Form is Displayed : " + SubmitButtonAddEditBank.isDisplayed());
		String SubmitButtonAddEditBankText = SubmitButtonAddEditBank.getText();
		System.out.println("Submit Button Add Bank Text : " + SubmitButtonAddEditBankText);
		if(SubmitButtonAddEditBankText.equals("Submit")) {
			System.out.println("Submit Button of Add Bank Text is CORRECT");
		}
		else {
			System.out.println("Submit Button Add of Bank Text is WRONG");
		}
		Thread.sleep(2000);	
		SubmitButtonAddEditBank.click();
		System.out.println("Click on Submit Button of Add Bank Form");
		Thread.sleep(2000);	
		CancleButtonAddEditBank.click();
		System.out.println("Click on Cancel Button of Add Bank Form");
		Thread.sleep(2000);	
		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Logout Top Button");	
	}
	
	public void FunctionValidationMessageOfMandatoryFieldsWithBlankDataInAddBanksDetailsForm() throws InterruptedException {
		System.out.println("21. Verify Functionality and Validation Message Mandatory  Fields with blank data in Add Banks Details form");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);		
		BanksMenu.click();
		System.out.println("click on Banks Menu");
		Thread.sleep(2000);	
		AddBankButton.click();
		System.out.println("click on Add Bank Button");
		Thread.sleep(2000);	
		SubmitButtonAddEditBank.click();
		System.out.println("click on Submit Button of Add Bank Details Form");
		Thread.sleep(2000);
		System.out.println("Validation Message for Bank Name field is Displayed : " + ValidationMessageBankNameField.isDisplayed());
		String ValidationMessageBankNameFieldText = ValidationMessageBankNameField.getText();
		System.out.println("Validation Message Bank Name Field Text : " + ValidationMessageBankNameFieldText);
		if(ValidationMessageBankNameFieldText.equals("Bank name field is required.")) {
			System.out.println("Validation Message Bank Name Field Text is CORRECT");
		}
		else {
			System.out.println("Validation Message Bank Name Field Text is WRONG");
		}
		Thread.sleep(2000);
		
		System.out.println("Validation Message for Select Country Field is Displayed : " + ValidationMessageSelectBankCountryName.isDisplayed());
		String ValidationMessageSelectBankCountryNameText = ValidationMessageSelectBankCountryName.getText();
		System.out.println("Validation Message for Select Country Field Text : " + ValidationMessageSelectBankCountryNameText);
		if(ValidationMessageSelectBankCountryNameText.equals("Please select bank country name.")) {
			System.out.println("Validation Message for Select Country Field Test is CORRECT");
		}
		else {
			System.out.println("Validation Message for Select Country Field Text is WRONG");
		}
		Thread.sleep(2000);
		
		System.out.println("Validation Message for Bank Icon field is Displayed : " + ValidationMessageBankIconChooseFile.isDisplayed());
		String ValidationMessageBankIconChooseFileText = ValidationMessageBankIconChooseFile.getText();
		System.out.println("Validation Message Bank Icon Choose File Field Text : " + ValidationMessageBankIconChooseFileText);
		if(ValidationMessageBankIconChooseFileText.equals("Bank icon field is required.")) {
			System.out.println("Validation Message Bank Icon Choose File Field Text is CORRECT");
		}
		else {
			System.out.println("Validation Message Bank Icon Choose File Field Text is WRONG");
		}
		Thread.sleep(2000);
		
		CancleButtonAddEditBank.click();
		System.out.println("Click on Cancel Button of Add Bank Form");
		Thread.sleep(2000);	
		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Logout Top Button");		
		
	}
		
	public void FunctionValidationMessageOfBankNameWithInvalidDataInAddBanksDetailsForm() throws InterruptedException {
		System.out.println("22. Verify Functionality and Validation Message Bank Name with Invalid Data in Add Banks Details form");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);		
		BanksMenu.click();
		System.out.println("click on Banks Menu");
		Thread.sleep(2000);	
		AddBankButton.click();
		System.out.println("click on Add Bank Button");
		Thread.sleep(2000);	
		
		BankNameFieldAddEditBank.sendKeys("123");
		System.out.println("Entered Invalid Bank Name");
		Thread.sleep(2000);	
		SubmitButtonAddEditBank.click();
		System.out.println("click on Submit Button of Add Bank Details Form");
		Thread.sleep(2000);
		
		String ValidationMessageBankNameFieldText = ValidationMessageBankNameField.getText();
		System.out.println("Validation Message for Invalid Bank Name : " + ValidationMessageBankNameFieldText);
		if(ValidationMessageBankNameFieldText.equals("Invalid bank name.")) {
			System.out.println("Validation Message for Invalid Bank Name is CORRECT");
		}
		else {
			System.out.println("Validation Message for Invalid Bank Name is WRONG");
		}
		

		System.out.println("Validation Message for Select Country Field is Displayed : " + ValidationMessageSelectBankCountryName.isDisplayed());
		String ValidationMessageSelectBankCountryNameText = ValidationMessageSelectBankCountryName.getText();
		System.out.println("Validation Message for Select Country Field Text : " + ValidationMessageSelectBankCountryNameText);
		if(ValidationMessageSelectBankCountryNameText.equals("Please select bank country name.")) {
			System.out.println("Validation Message for Select Country Field Test is CORRECT");
		}
		else {
			System.out.println("Validation Message for Select Country Field Text is WRONG");
		}
		Thread.sleep(2000);
		
		System.out.println("Validation Message for Bank Icon field is Displayed : " + ValidationMessageBankIconChooseFile.isDisplayed());
		String ValidationMessageBankIconChooseFileText = ValidationMessageBankIconChooseFile.getText();
		System.out.println("Validation Message Bank Icon Choose File Field Text : " + ValidationMessageBankIconChooseFileText);
		if(ValidationMessageBankIconChooseFileText.equals("Bank icon field is required.")) {
			System.out.println("Validation Message Bank Icon Choose File Field Text is CORRECT");
		}
		else {
			System.out.println("Validation Message Bank Icon Choose File Field Text is WRONG");
		}
		Thread.sleep(2000);
		
		CancleButtonAddEditBank.click();
		System.out.println("Click on Cancel Button of Add Bank Form");
		Thread.sleep(2000);	
		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Logout Top Button");			
		
	}
		
	public void FunctionValidationMessageOfAllFieldsWithValidDataInAddBanksDetailsForm() throws InterruptedException {
		System.out.println("23. Verify Functionality and Validation Message All Fields with Valid Data in Add Banks Details form");
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);		
		BanksMenu.click();
		System.out.println("click on Banks Menu");
		Thread.sleep(2000);	
		AddBankButton.click();
		System.out.println("click on Add Bank Button");
		Thread.sleep(2000);	
		
		BankNameFieldAddEditBank.sendKeys("Test Bank");
		System.out.println("Entered Invalid Bank Name");
		Thread.sleep(2000);	
		
		Select sel2 = new Select(SelectCountryDropdownAddEditBank);
		sel2.selectByValue("Sri Lanka");
		System.out.println("Select 'Sri Lanka' Country from Dropdown");
		Thread.sleep(2000);	
		
		AutomationCheckBoxAddEditBank.click();
		System.out.println("Click on Automation CheckBox");
		Thread.sleep(2000);	
		BankIconFieldChooseFileAddEditBank.sendKeys("C:\\Users\\aarrsol\\Downloads\\PayMoney.png");
		System.out.println("Import Bank Icon From required destination");
		Thread.sleep(2000);	
		AddLabelButtonAddEditBank.click();
		System.out.println("Click on Add Label Button in Add Bank Details Form");
		Thread.sleep(2000);	
		TextBoxAddFieldAddEditBank.sendKeys("IFSC Code");
		System.out.println("Entered 'IFSC Code' Text into Fiel of Add Field in Add Bank Details Form");
		Thread.sleep(2000);	
		SubmitButtonAddFieldAddEditBank.click();
		System.out.println("Click on Submit Button of Add Field in Add Bank Details Form");
		Thread.sleep(2000);			
		SubmitButtonAddEditBank.click();
		System.out.println("click on Submit Button of Add Bank Details Form");
		Thread.sleep(2000);
		
		String ValidationMessageAddEditBankDetailsText = ValidationMessageAddEditBankDetails.getText();
		System.out.println("Validation Message Text of Add Bank Details  : " + ValidationMessageAddEditBankDetailsText);
		if(ValidationMessageAddEditBankDetailsText.equals("Bank updated successfully.")) {
			System.out.println("Validation Message Text of Add Bank Details is CORRECT");
		}
		else {
			System.out.println("Validation Message Text of Add Bank Details is WRONG");
		}
		
		Thread.sleep(5000);
		LogoutTop.click();
		System.out.println("Click on Logout Top Button");				
	}
	
	public void FuncitonalityAvailabityValidationMessageStatusToggleKeyBanksMenu() throws InterruptedException {
		System.out.println("24. Verify Functionality, Avaibality and Validation Message of Status toggle key of Banks Menu");		
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(5000);
		BanksMenu.click();
		System.out.println("click on Banks Menu");
		Thread.sleep(2000);	
		
		StatusToggleKeyBanks.get(25).click();
		System.out.println("Click on Toggle key of First Bank");
		Thread.sleep(2000);		
		String ValidationMessageStatusChangeBankText=ValidationMessageStatusChangeBank.getText();
		System.out.println("Validation Message Inactive Status Change Text in Banks : " + ValidationMessageStatusChangeBankText);
		if(ValidationMessageStatusChangeBankText.equals("Bank status is inactive updated successfully.")) {
			System.out.println("Validation Message Inactive Status Change Text in Bank is CORRECT");
		}
		else {
			System.out.println("Validation Message Inactive Status Change Text in Bank is WRONG");
		}
		Thread.sleep(2000);	
		
		StatusToggleKeyBanks.get(25).click();
		System.out.println("Click on Toggle key of First Bank");
		Thread.sleep(2000);		
		String ValidationMessageStatusChangeBank1Text=ValidationMessageStatusChangeBank.getText();
		System.out.println("Validation Message Active Status Change Text in Payment Method : " + ValidationMessageStatusChangeBank1Text);
		if(ValidationMessageStatusChangeBank1Text.equals("Bank status is active updated successfully.")) {
			System.out.println("Validation Message Active Status Change Text in Payment Method is CORRECT");
		}
		else {
			System.out.println("Validation Message Active Status Change Text in Payment Method is WRONG");
		}
		Thread.sleep(2000);
		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}
		
	public void FuncitonalityAvailabityValidationMessageActionDropdownEditButtonBank() throws InterruptedException {
		System.out.println("25. Verify Functionality, Avaibality and Validation Message of  Action Dropdown and Edit Button of Banks Menu");		
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);
		BanksMenu.click();
		System.out.println("click on Banks Menu");
		Thread.sleep(2000);	
		
		System.out.println("Action Dropdown is Enabled : "+ActionDropdownBanks.get(25).isEnabled());
		System.out.println("Action Dropdown is Dispalyed : "+ActionDropdownBanks.get(25).isDisplayed());
		Thread.sleep(2000);
		ActionDropdownBanks.get(25).click();
		System.out.println("click on Action Dropdown of Bank");
		Thread.sleep(2000);
		
		System.out.println("Edit Button is Enabled : "+ActionEditIconsBanks.get(25).isEnabled());
		System.out.println("Edit Button is Dispalyed : "+ActionEditIconsBanks.get(25).isDisplayed());
		ActionEditIconsBanks.get(25).click();
		System.out.println("click on Edit Icon of Bank");
		Thread.sleep(2000);
		AutomationCheckBoxAddEditBank.click();
		System.out.println("Click on Automation Checkbox");
		Thread.sleep(2000);
		SubmitButtonAddEditBank.click();
		System.out.println("Click on Submit Button of Add Bank");
		Thread.sleep(2000);
		
		String ValidationMessageAddEditPaymentMethodCompletedText=ValidationMessageAddEditPaymentMethodCompleted.getText();
		System.out.println("Validation Message Text  of Edit Bank Completed : " + ValidationMessageAddEditPaymentMethodCompletedText);
		if(ValidationMessageAddEditPaymentMethodCompletedText.equals("Bank updated successfully.")) {
			System.out.println("Validation Message Text  of Edit Bank Completed is CORRECT");
		}
		else {
			System.out.println("Validation Message Text  of Edit Bank Completed is WRONG");
		}
		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");
	}	
		
	public void FunctionalityAvailabilityNoEntriesDropdownBanksMenu() throws InterruptedException {
		System.out.println("26. Verify Functionality and availability of  total Number of Banks Entries dropdown of Banks Menu");		
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");
		Thread.sleep(2000);
		BanksMenu.click();
		System.out.println("click on Banks Menu");
		Thread.sleep(2000);			
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");
		System.out.println("Qty Entries Select Dropdown of Payment Method is Enabled : "+EntriesQtySelectFieldBanks.isEnabled());
		System.out.println("Qty Entries Select Dropdown of Payment Method is Dispalyed : "+EntriesQtySelectFieldBanks.isDisplayed());
		Thread.sleep(2000);
		
		Select sel1 = new Select(EntriesQtySelectFieldBanks);
		sel1.selectByIndex(1);
		System.out.println("Select Second value from Dropdown");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");
		String EntriesQtySelectFieldBanksText = EntriesQtySelectFieldBanks.getText();
		System.out.println("Entries Qty Select Dropdown of Banks Text : " + EntriesQtySelectFieldBanksText+ ", ");
		Thread.sleep(2000);
		sel1.selectByVisibleText("100");
		System.out.println("Select 100 value from Dropdown");
		Thread.sleep(2000);
		String EntriesQtySelectFieldBanks1Text = EntriesQtySelectFieldBanks.getText();
		System.out.println("Entries Qty Select Dropdown of Payment Methods Text : " + EntriesQtySelectFieldBanks1Text+", ");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");
		Thread.sleep(3000);
		
		sel1.selectByValue("200");
		System.out.println("Select 200 value from Dropdown");
		Thread.sleep(2000);
		String EntriesQtySelectFieldBanks2Text = EntriesQtySelectFieldBanks.getText();
		System.out.println("Entries Qty Select Dropdown of Payment Methods Text : " + EntriesQtySelectFieldBanks2Text + ", ");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");		
	}
		
	public void FunctionalityAvailabilityPagesPreviousNextButtonOfBanks() throws InterruptedException {
		System.out.println("27. Verify Functionality and availability of Pages, Previous and next button of Banks Menu");		
		login();
		Thread.sleep(2000);
		ManageIDModule.click();
		System.out.println("click on Manage ID Module");		
		Thread.sleep(2000);
		BanksMenu.click();
		System.out.println("click on Banks Menu");
		Thread.sleep(2000);	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");	
		
		System.out.println("Page Number 2 of Banks is Enabled : " + PagesBanks.get(4).isEnabled());
		System.out.println("Page Number 2 of Banks  is Displayed : " + PagesBanks.get(4).isDisplayed());
		System.out.println("Page Number 1 of Banks  is Enabled : " + PagesBanks.get(3).isEnabled());
		System.out.println("Page Number 1 of Banks  is Displayed : " + PagesBanks.get(3).isDisplayed());
		System.out.println("Next Button of Banks is Enabled : " + NextButtonBanks.isEnabled());
		System.out.println("Next Button of Banks is Displayed : " + NextButtonBanks.isDisplayed());
		Thread.sleep(2000);

		NextButtonBanks.click();
		System.out.println("Click on Next Button of Banks");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");	
		Thread.sleep(4000);		
		System.out.println("Previous Button of Banks is Enabled : " + PreviousButtonBanks.isEnabled());
		System.out.println("Previous Button of Banks is Displayed : " + PreviousButtonBanks.isDisplayed());
		PagesPaymentMethods.get(3).click();
		System.out.println("Click on Page Number 1 of Banks");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");	
		Thread.sleep(4000);		
		PagesPaymentMethods.get(4).sendKeys(Keys.ENTER);
		System.out.println("Click on Page Number 2 of Banks");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");
		Thread.sleep(4000);		
		PreviousButtonBanks.click();
		System.out.println("Click on Previous Button of Banks");		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Scroll Vertical Bar upto total height");	
		Thread.sleep(4000);		
		
		Thread.sleep(4000);
		
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("click on Logout Top Button");	
	}		
		
	public void FunctionalityOfButtonsFieldsWithTabEnterKeyOfSearchBoxAndButtonPaymentMethods() throws InterruptedException {
		System.out.println("28. Verify Functionality of Button and fields with Tab and Enter Button of Search Box and Button of Payment Methods Menu");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		
		//Login Get ID
		act.sendKeys(Keys.TAB).sendKeys("admin@getid.com").build().perform();
		System.out.println("Cursor on Login Id Field By Tab Key");
		System.out.println("Entered Valid Login Id");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys("123456").build().perform();
		System.out.println("Cursor on Password Field By Tab Key");
		System.out.println("Entered Valid Password");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Password Eye Button");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Login Button By Tab Key");
		System.out.println("Press Enter Key");
		System.out.println("Successfully Login Get Id Provider Panel");
		Thread.sleep(2000);	
		
		//After Login
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Notification Button By Tab Key");
		System.out.println("Press Enter Key");
		System.out.println("Open Notification Pop-up");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Press Enter Key");
		System.out.println("Close Notification Pop-up");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Top Logout Button By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Website List Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Manage ID Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Key for Open Manage Id Module");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Payment Range Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Remarks Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Profile Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Bottom Logout Module By TAB Key");
		Thread.sleep(1000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Payment Methods Menu By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Banks Menu By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Frame By TAB Key");
		Thread.sleep(1000);	
		
		//Search Box and Button
		JavascriptExecutor js5 = (JavascriptExecutor)driver;
		js5.executeScript("arguments[0].scrollIntoView()", SearchBoxPaymentMethods);
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Search Box Field By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys("TestOnline").perform();		
		System.out.println("Entered Website Text into Search Box");		
		Thread.sleep(3000);	
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Searched Website by Press ENTER Key");
		Thread.sleep(3000);	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		System.out.println("Select all text from Search Box");
		Thread.sleep(3000);	
		act.sendKeys(Keys.BACK_SPACE).perform();
		System.out.println("Erased all text from Search Box by Back_SPACE Key");	
		Thread.sleep(3000);	
		act.sendKeys("RuPay").perform();		
		System.out.println("Again Entered Test Text into Search Box");		
		Thread.sleep(3000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Search Button By TAB Key");
		Thread.sleep(3000);	
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Again Searched Website by Press Enter Key");
		Thread.sleep(3000);	
		act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).build().perform();
		System.out.println("Press SHIFT and TAB Keys for Reversing go to Search Box");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		System.out.println("Select all text from Search Box");
		Thread.sleep(3000);	
		act.sendKeys(Keys.BACK_SPACE).perform();
		System.out.println("Again Erased all text from Search Box by Back_SPACE Key");	
		Thread.sleep(3000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Again Cursor on Search Button By TAB Key");
		Thread.sleep(3000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Add Payment Method By TAB Key");
		Thread.sleep(3000);
		
		act.keyDown(Keys.SHIFT).perform();
		Thread.sleep(1000);
		for (int i=1; i<=6; i++) {
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(200);
		}
		System.out.println("Cursor on Add Payment Method By TAB Key");	
		Thread.sleep(2000);
		act.keyUp(Keys.SHIFT).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER for Logout");
	}	
		
	public void FunctionalityOfButtonsFieldsWithTabEnterKeyOfAddPaymentMethod() throws InterruptedException {
		System.out.println("29. Verify Functionality of Button and fields with Tab and Enter Button of  Add Payment Method of Payment Methods Menu");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		
		//Login Get ID
		act.sendKeys(Keys.TAB).sendKeys("admin@getid.com").build().perform();
		System.out.println("Cursor on Login Id Field By Tab Key");
		System.out.println("Entered Valid Login Id");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys("123456").build().perform();
		System.out.println("Cursor on Password Field By Tab Key");
		System.out.println("Entered Valid Password");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Password Eye Button");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Login Button By Tab Key");
		System.out.println("Press Enter Key");
		System.out.println("Successfully Login Get Id Provider Panel");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Notification Button By Tab Key");		
		Thread.sleep(1000);			
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Top Logout Button By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Website List Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Manage ID Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Key for Open Manage Id Module");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Payment Range Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Remarks Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Profile Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Bottom Logout Module By TAB Key");
		Thread.sleep(1000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Payment Methods Menu By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Banks Menu By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Frame By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor Search Box By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Search Button By TAB Key");
		Thread.sleep(1000);	
		
		//Add Payment Method
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Add Payment Method Button By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Key for Open Add Payment Method Details");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Close Button of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Method Name Field of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys("AarrsolPay").perform();
		System.out.println("Enter 'AarrsolPay' Text in Method Name Field");
		Thread.sleep(2000);	
		BankIconFieldChooseFileAddEditBank.sendKeys("C:\\Users\\aarrsol\\Downloads\\PayMoney.png");
//		act.sendKeys(Keys.TAB).sendKeys("C:\\Users\\aarrsol\\Downloads\\PayOnline.jpeg").perform();	
//		System.out.println("Cursor on Payment Icon Field of Add Payment Method Details By TAB Key");
//		Thread.sleep(3000);	
		//act.sendKeys("C:\\Users\\aarrsol\\Downloads\\PayMoney.png").perform();
		System.out.println("Import Payment Icon from required location");
		Thread.sleep(3000);	
		
		//Select CheckBoxes
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Bank List CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select Bank List CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Wallet ID CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select Wallet ID CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on UPI ID CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select UPI ID CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Phone No CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select Phone No CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on QR Code CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select QR Code CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Account No CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select Account No CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		
		//UnSelect CheckBoXes
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("UnSelect Account No CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		act.keyDown(Keys.SHIFT).perform();
		System.out.println("Press Shift for reversing");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on QR Code CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("UnSelect QR Code CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Phone No CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("UnSelect Phone No CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on UPI ID CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("UnSelect UPI ID CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Wallet ID CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("UnSelect Wallet ID CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Bank List CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("UnSelect Bank List CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(2000);	
		
		//Again Select All Checkboxes		
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select Bank List CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Wallet ID CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select Wallet ID CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on UPI ID CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select UPI ID CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Phone No CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select Phone No CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on QR Code CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select QR Code CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Account No CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select Account No CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(1000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Cancel Button of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Submit Button of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for Save Payment Method Details");
		Thread.sleep(1000);	
		
		for (int i=1; i<=4; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);	
		}
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for Logout");
		Thread.sleep(2000);			
	}	
		
	public void FunctionalityOfButtonsFieldsWithTabEnterKeyOfStatusActionButtonPaymentMethods() throws InterruptedException {
		System.out.println("30. Verify Functionality of Button and fields with Tab and Enter Button of Status and Action in Payment Methods Menu");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		
		//Login Get ID
		act.sendKeys(Keys.TAB).sendKeys("admin@getid.com").build().perform();
		System.out.println("Cursor on Login Id Field By Tab Key");
		System.out.println("Entered Valid Login Id");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys("123456").build().perform();
		System.out.println("Cursor on Password Field By Tab Key");
		System.out.println("Entered Valid Password");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Password Eye Button");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Login Button By Tab Key");
		System.out.println("Press Enter Key");
		System.out.println("Successfully Login Get Id Provider Panel");
		Thread.sleep(2000);	
		
		for(int i=1; i<=5; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}
		Thread.sleep(1000);	
		
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Manage Id Module");
		Thread.sleep(2000);
		for(int i=1; i<=11; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}
		Thread.sleep(1000);	
		act.sendKeys(Keys.SPACE).perform();
		System.out.println("Press SPACE_BAR for Change Status of Payment Method");
		Thread.sleep(2000);
		act.sendKeys(Keys.SPACE).perform();
		System.out.println("Again Press SPACE_BAR for Change Status of Payment Method");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Action Dropdown Button");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Action Dropdown options");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Edit Button of Action Dropdown");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Editing Payment Method");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Close  Button of Edit Payment Method");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Method Name Field of Edit Payment Method");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Payment Icon Field of Edit Payment Method");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Bank List CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);			
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Wallet ID CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);			
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on UPI ID CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select UPI ID CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Phone No CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select Phone No CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on QR Code CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.SPACE).perform();	
		System.out.println("Select QR Code CheckBox of Add Payment Method Details By SPACE_BAR Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Account No CheckBox of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Cancel Button of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Submit Button of Add Payment Method Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for Save Payment Method Details");
		Thread.sleep(1000);	
		
		for(int i=1; i<=4; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}
		Thread.sleep(1000);		
		
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for Logout");
		Thread.sleep(1000);			
	}	
	
	public void FunctionOfButtonsFieldsWithTabEnterKeyOfEntriesPagesNextPreviousButtonPaymentMethods() throws InterruptedException {
		System.out.println("31. Verify Functionality of Button and fields with Tab and Enter Button of Select Qty Entries and Pages, Next Previous Button in Payment Methods Menu");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		
		//Login Get ID
		act.sendKeys(Keys.TAB).sendKeys("admin@getid.com").build().perform();
		System.out.println("Cursor on Login Id Field By Tab Key");
		System.out.println("Entered Valid Login Id");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys("123456").build().perform();
		System.out.println("Cursor on Password Field By Tab Key");
		System.out.println("Entered Valid Password");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Password Eye Button");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Login Button By Tab Key");
		System.out.println("Press Enter Key");
		System.out.println("Successfully Login Get Id Provider Panel");
		Thread.sleep(2000);	
		
		for(int i=1; i<=5; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}
		Thread.sleep(1000);	
		
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Manage Id Module");
		Thread.sleep(2000);
		for(int i=1; i<=60; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(300);	
		}
		JavascriptExecutor js6 = (JavascriptExecutor)driver;
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Select Qty Entries Dropdown");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		System.out.println("Press DOWN_ARROW for Selection 50 Entries");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		System.out.println("Again Press DOWN_ARROW for Selection 100 Entries");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		System.out.println("Press UP_ARROW for Selection 50 Entries");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		System.out.println("Again Press UP_ARROW for Selection 25 Entries");
		Thread.sleep(2000);
		
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Page Numbe 1");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Page Numbe 2");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Next Button");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Next Page");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).build().perform();
		System.out.println("Cursor on Page Numbe 1");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Page Numbe 1");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();
		System.out.println("Cursor on Page Numbe 2");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Page Numbe 2");
		Thread.sleep(2000);	
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).build().perform();
		System.out.println("Cursor on Previous Button");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Previous Page");
		Thread.sleep(2000);	
		
		act.keyDown(Keys.SHIFT).perform();
		for(int i=1; i<=58; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(200);	
		}
		Thread.sleep(2000);		
		
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for Logout");
		Thread.sleep(1000);			
	}
		
	public void FunctionalityOfButtonsFieldsWithTabEnterKeyOfSearchBoxAndButtonBanks() throws InterruptedException {
		System.out.println("32. Verify Functionality of Button and fields with Tab and Enter Button of Search Box and Button of Banks Menu");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		
		//Login Get ID
		act.sendKeys(Keys.TAB).sendKeys("admin@getid.com").build().perform();
		System.out.println("Cursor on Login Id Field By Tab Key");
		System.out.println("Entered Valid Login Id");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys("123456").build().perform();
		System.out.println("Cursor on Password Field By Tab Key");
		System.out.println("Entered Valid Password");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Password Eye Button");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Login Button By Tab Key");
		System.out.println("Press Enter Key");
		System.out.println("Successfully Login Get Id Provider Panel");
		Thread.sleep(2000);	
		
		//After Login
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();
		System.out.println("Cursor on Notification Button By Tab Key");		
		Thread.sleep(1000);			
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Top Logout Button By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Website List Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Manage ID Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Key for Open Manage Id Module");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Payment Range Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Remarks Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Profile Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Bottom Logout Module By TAB Key");
		Thread.sleep(1000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Payment Methods Menu By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Banks Menu By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Key for Open Banks Menu");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Frame By TAB Key");
		Thread.sleep(1000);	
		
		//Search Box and Button
		JavascriptExecutor js5 = (JavascriptExecutor)driver;
		js5.executeScript("arguments[0].scrollIntoView()", SearchBoxPaymentMethods);
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Search Box Field By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys("Test Bank").perform();		
		System.out.println("Entered Website Text into Search Box");		
		Thread.sleep(3000);	
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Searched Website by Press ENTER Key");
		Thread.sleep(3000);	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		System.out.println("Select all text from Search Box");
		Thread.sleep(3000);	
		act.sendKeys(Keys.BACK_SPACE).perform();
		System.out.println("Erased all text from Search Box by Back_SPACE Key");	
		Thread.sleep(3000);	
		act.sendKeys("Axis Bank").perform();		
		System.out.println("Again Entered Test Text into Search Box");		
		Thread.sleep(3000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Search Button By TAB Key");
		Thread.sleep(3000);	
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Again Searched Website by Press Enter Key");
		Thread.sleep(3000);	
		act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).build().perform();
		System.out.println("Press SHIFT and TAB Keys for Reversing go to Search Box");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		System.out.println("Select all text from Search Box");
		Thread.sleep(3000);	
		act.sendKeys(Keys.BACK_SPACE).perform();
		System.out.println("Again Erased all text from Search Box by Back_SPACE Key");	
		Thread.sleep(3000);		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Again Cursor on Search Button By TAB Key");
		Thread.sleep(3000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Add Bank By TAB Key");
		Thread.sleep(3000);
		
		act.keyDown(Keys.SHIFT).perform();
		Thread.sleep(1000);
		for (int i=1; i<=6; i++) {
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		}
		System.out.println("Cursor on Add Payment Method By TAB Key");	
		Thread.sleep(2000);
		act.keyUp(Keys.SHIFT).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER for Logout");
	}		
	
	public void FunctionalityOfButtonsFieldsWithTabEnterKeyOfAddBank() throws InterruptedException {
		System.out.println("33. Verify Functionality of Button and fields with Tab and Enter Button of Add Bank of Banks Menu");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		
		//Login Get ID
		act.sendKeys(Keys.TAB).sendKeys("admin@getid.com").build().perform();
		System.out.println("Cursor on Login Id Field By Tab Key");
		System.out.println("Entered Valid Login Id");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys("123456").build().perform();
		System.out.println("Cursor on Password Field By Tab Key");
		System.out.println("Entered Valid Password");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Password Eye Button");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Login Button By Tab Key");
		System.out.println("Press Enter Key");
		System.out.println("Successfully Login Get Id Provider Panel");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Notification Button By Tab Key");		
		Thread.sleep(1000);			
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Top Logout Button By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Website List Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Manage ID Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Key for Open Manage Id Module");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Payment Range Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Remarks Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Profile Module By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Bottom Logout Module By TAB Key");
		Thread.sleep(1000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Payment Methods Menu By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Banks Menu By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Key for Open Banks Menu");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Frame By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor Search Box By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Search Button By TAB Key");
		Thread.sleep(1000);	
		
		//Add Payment Method
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Add Bank Button By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER Key for Open Add Bank Details");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Close Button of Add Bank Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Bank Name Field of Add Bank Details By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys("Yes Bank").perform();
		System.out.println("Enter 'Yes Bank' Text in Bank Name Field");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Select Country Field By TAB Key");
		Thread.sleep(2000);	
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		System.out.println("Select 'India' from Country Dropdown By ARROW_DOWN");
		Thread.sleep(2000);	
		
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Automation Checkbox of Add Bank Details By TAB Key");
		Thread.sleep(2000);
		act.sendKeys(Keys.SPACE).perform();
		System.out.println("Press SPACE_BAR for click on checkbox of Add Bank Details");
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Automation Checkbox of Add Bank Details By TAB Key");
		Thread.sleep(2000);
		act.sendKeys(BankIconFieldChooseFileAddEditBank, "C:\\Users\\aarrsol\\Downloads\\PayOnline.jpeg").perform();
		System.out.println("Import Bank Icon from required location");
		Thread.sleep(2000);	
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Add Label Button of Add Bank Details By TAB Key");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for Add New Label Popup");
		Thread.sleep(2000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Close Button Add new Label of Add Bank Details By TAB Key");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Field Label Text Box in Add new Label of Add Bank Details By TAB Key");
		Thread.sleep(2000);
		act.sendKeys("IFSC Code").perform();
		System.out.println("Enter Text 'IFSC Cod' in Field Label Text Box");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Cancel Button Add new Label of Add Bank Details By TAB Key");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Submit Button Add new Label of Add Bank Details By TAB Key");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for submitting and Add New Label ");
		Thread.sleep(2000);	
		
		act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).build().perform();
		System.out.println("Cursor on Submit Button of Add Bank Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for Save Payment Method Details");
		Thread.sleep(1000);	
		
		for (int i=1; i<=4; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(1000);	
		}
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for Logout");
		Thread.sleep(2000);			
	}	
	
	public void FunctionalityOfButtonsFieldsWithTabEnterKeyOfStatusActionButtonBanks() throws InterruptedException {
		System.out.println("34. Verify Functionality of Button and fields with Tab and Enter Button of Status and Action in Banks Menu");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		
		//Login Get ID
		act.sendKeys(Keys.TAB).sendKeys("admin@getid.com").build().perform();
		System.out.println("Cursor on Login Id Field By Tab Key");
		System.out.println("Entered Valid Login Id");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys("123456").build().perform();
		System.out.println("Cursor on Password Field By Tab Key");
		System.out.println("Entered Valid Password");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Password Eye Button");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Login Button By Tab Key");
		System.out.println("Press Enter Key");
		System.out.println("Successfully Login Get Id Provider Panel");
		Thread.sleep(2000);	
		
		for(int i=1; i<=5; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}
		Thread.sleep(1000);	
		
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Manage Id Module");
		Thread.sleep(2000);
		for(int i=1; i<=6; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}
		System.out.println("Cursor on Bank Menu");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Banks Menu");
		Thread.sleep(2000);
		for(int i=1; i<=6; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}

		System.out.println("Cursor on Status Toggle key of Banks Menu");
		Thread.sleep(2000);		
		
		act.sendKeys(Keys.SPACE).perform();
		System.out.println("Press SPACE_BAR for Change Status of Bank");
		Thread.sleep(2000);
		act.sendKeys(Keys.SPACE).perform();
		System.out.println("Again Press SPACE_BAR for Change Status of Bank");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Curson on Action Dropdown Button");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Action Dropdown options");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Edit Button of Action Dropdown");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press ENTER for open Editing Bank");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Close  Button of Edit Bank");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Bank Name Field of Edit Bank");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Select Country Field of Edit Bank");
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Automation Checkbox of Edit Bank");
		Thread.sleep(2000);
		act.sendKeys(Keys.SPACE).perform();
		System.out.println("Press SPACE_BAR for click on Checkbox");
		Thread.sleep(2000);

		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Bank Icon Field of Edit Bank");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Add Label Button of Edit Bank");
		Thread.sleep(2000);		
		
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Cancel Button of Edit Bank Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.TAB).perform();	
		System.out.println("Cursor on Submit Button of Edit Bank Details By TAB Key");
		Thread.sleep(1000);	
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for Save Bank Details");
		Thread.sleep(1000);	
		

		for(int i=1; i<=17; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(300);
		}
		System.out.println("Cursor on Bank Icon of first Bank");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for Open Bank Icon Image");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Close Button of Bank Icon Image ");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for Close Bank Icon Image");
		Thread.sleep(2000);		
		
		for(int i=1; i<=4; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}
		Thread.sleep(1000);		
		
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for Logout");
		Thread.sleep(1000);			
	}	
	
	public void FunctionOfButtonsFieldsWithTabEnterKeyOfEntriesPagesNextPreviousButtonBanks() throws InterruptedException {
		System.out.println("35. Verify Functionality of Button and fields with Tab and Enter Button of Select Qty Entries and Pages, Next Previous Button in Banks Menu");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();		
		System.out.println("Cursor on Getid Logo By Tab Button");
		
		//Login Get ID
		act.sendKeys(Keys.TAB).sendKeys("admin@getid.com").build().perform();
		System.out.println("Cursor on Login Id Field By Tab Key");
		System.out.println("Entered Valid Login Id");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys("123456").build().perform();
		System.out.println("Cursor on Password Field By Tab Key");
		System.out.println("Entered Valid Password");
		Thread.sleep(2000);		
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Password Eye Button");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("Cursor on Login Button By Tab Key");
		System.out.println("Press Enter Key");
		System.out.println("Successfully Login Get Id Provider Panel");
		Thread.sleep(2000);	
		
		for(int i=1; i<=5; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}
		Thread.sleep(2000);	
		System.out.println("Curson on Manage ID Module");
		
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Manage ID Module");
		Thread.sleep(2000);
		for(int i=1; i<=6; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(500);	
		}
		System.out.println("Cursor on Bank Menu");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Banks Menu");
		Thread.sleep(2000);
		
		for(int i=1; i<=79; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(300);	
		}
		JavascriptExecutor js6 = (JavascriptExecutor)driver;
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Select Qty Entries Dropdown");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		System.out.println("Press DOWN_ARROW for Selection 50 Entries");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		System.out.println("Again Press DOWN_ARROW for Selection 100 Entries");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		System.out.println("Again Press DOWN_ARROW for Selection 200 Entries");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		System.out.println("Press UP_ARROW for Selection 100 Entries");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		System.out.println("Press UP_ARROW for Selection 50 Entries");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		System.out.println("Again Press UP_ARROW for Selection 25 Entries");
		Thread.sleep(2000);
		
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Page Numbe 1");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Page Numbe 2");
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).build().perform();
		System.out.println("Cursor on Next Button");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Next Page");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).build().perform();
		System.out.println("Cursor on Page Numbe 1");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Page Numbe 1");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.TAB).perform();
		System.out.println("Cursor on Page Numbe 2");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Page Numbe 2");
		Thread.sleep(2000);	
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).build().perform();
		System.out.println("Cursor on Previous Button");
		Thread.sleep(2000);
		js6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		System.out.println("Press Enter for open Previous Page");
		Thread.sleep(2000);	
		
		act.keyDown(Keys.SHIFT).perform();
		for(int i=1; i<=83; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(200);	
		}
		Thread.sleep(2000);		
		
		act.sendKeys(Keys.ENTER).perform();	
		System.out.println("Press ENTER Key for Logout");
		Thread.sleep(1000);			
	}
	
}

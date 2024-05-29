package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	public WebDriver driver;

	@FindBy(xpath = "//input[@placeholder='Enter Login ID']")
	private WebElement LoginIdField;
	
	@FindBy(xpath = "//label[@for='operator']")
	private WebElement LoginIdLabel;	

	@FindBy(xpath = "//input[@placeholder='Enter Password']")
	private WebElement PasswordField;
	
	@FindBy(xpath = "//label[@for='login']")
	private WebElement PasswordLabel;

	@FindBy(xpath = "//button[@class='btn btn-primary w-100']")
	private WebElement LoginButton;

	@FindBy(xpath = "(//img[@alt='logo'])[1]")
	private WebElement GetIdLogo;

	@FindBy(xpath = "//div[@class='thm-heading text-center']")
	private WebElement Heading;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement EyeButton;

	@FindBy(xpath = "(//p[@class='text-danger'])[1]")
	private WebElement ValidationMessageLoginId;

	@FindBy(xpath = "(//p[@class='text-danger'])[2]")
	private WebElement ValidationMessagePassword;

	@FindBy(xpath = "(//p[@class='text-danger'])[1]")
	private WebElement InvalidMessageLoginId;

	@FindBy(xpath = "(//p[@class='text-danger'])[2]")
	private WebElement InvalidMessagePassword;

	@FindBy(xpath = "//button[@class='btn cancel-but']")
	private WebElement NotificationCancle;

	@FindBy(xpath = "//button[@class='btn thm-but']")
	private WebElement NotificationAllow;

	@FindBy(xpath = "//button[@class='log_out_top']")
	private WebElement LogoutTop;

	@FindBy(xpath = "(//p[@class='text-danger'])[3]")
	private WebElement MessageInvalidEmailOrPassword;

	public LoginPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void getIdLogoDisplayEnabled() throws InterruptedException {
		System.out.println("1. Verify GetId Logo is Displayed and Enabled on Login Page");
		System.out.println("Get Id Logo is Enabled : " + GetIdLogo.isEnabled());
		Thread.sleep(1000);
		System.out.println("Get Id Logo is Displayed : " + GetIdLogo.isDisplayed());
		Thread.sleep(1000);
	}

	public void headingText() throws InterruptedException {
		System.out.println("2. Verify Heading Text on page");
		String HeadingText = Heading.getText();
		System.out.println("Heading Text : " + HeadingText);
		Thread.sleep(1000);
		if (HeadingText.equals("Welcome Back!")) {
			System.out.println("Heading Text Test Case is Passed");
		} else {
			System.out.println("Heading Text Test Case is Failed");
		}
	}

	public void functionAvailableLoginInField() throws InterruptedException {
		System.out.println("3. Verify Functionality and avaibility of Login Id field");
		String ActLoginIdLabelText = LoginIdLabel.getText();
		System.out.println("Actual Login Id Label Text : " + ActLoginIdLabelText);
		if(ActLoginIdLabelText.equals("Login ID")){
			System.out.println("Actual Login Id Label is Correct");
		}
		else {
			System.out.println("Actual Login Id Label is Wrong");
		}
		System.out.println("Login Id Field is Enabled : " + LoginIdField.isEnabled());
		Thread.sleep(1000);
		System.out.println("Login Id Field is Displayed : " + LoginIdField.isDisplayed());
		Thread.sleep(1000);
		LoginIdField.sendKeys("admin@getid.com");
		Thread.sleep(2000);
		System.out.println("Entered Valid Login ID");
		LoginIdField.clear();
		Thread.sleep(2000);
		System.out.println("Cleared Login ID");		
		driver.navigate().to("https://taj888.com/login");
		Thread.sleep(2000);
		System.out.println("Page Navigate to : https://taj888.com/login");
	}

	public void functionAvailablePasswordField() throws InterruptedException {
		System.out.println("4. Verify Functionality and avaibility of Password field");
		String ActPasswordLabelText = PasswordLabel.getText();
		System.out.println("Actual Login Id Label Text : " + ActPasswordLabelText);
		if(ActPasswordLabelText.equals("Password")){
			System.out.println("Actual Password Label is Correct");
		}
		else {
			System.out.println("Actual Password Label is Wrong");
		}
		System.out.println("Password Field is Enabled : " + PasswordField.isEnabled());
		Thread.sleep(1000);
		System.out.println("Password Field is Displayed : " + PasswordField.isDisplayed());
		Thread.sleep(1000);
		PasswordField.sendKeys("123456");
		Thread.sleep(2000);
		System.out.println("Entered Valid Password");
		PasswordField.clear();
		Thread.sleep(2000);
		System.out.println("Cleared Password");
		driver.navigate().to("https://taj888.com/login");
		Thread.sleep(2000);
		System.out.println("Page Navigate to : https://taj888.com/login");
	}

	public void functionAvailablePasswordEyeButton() throws InterruptedException {
		System.out.println("5. Verify Functionality and avaibility of Pasword Eye Button");
		System.out.println("Password Eye Button is Enabled : " + EyeButton.isEnabled());
		Thread.sleep(1000);
		System.out.println("Password Eye Button is Displayed : " + EyeButton.isDisplayed());
		Thread.sleep(1000);
		PasswordField.sendKeys("123456");
		Thread.sleep(2000);
		System.out.println("Entered Valid Password");
		EyeButton.click();
		Thread.sleep(1000);
		System.out.println("Click on Password Eye Button");
		EyeButton.click();
		Thread.sleep(1000);
		System.out.println("Again Click on Password Eye Button");
		driver.navigate().to("https://taj888.com/login");
		Thread.sleep(2000);
		System.out.println("Page Navigate to : https://taj888.com/login");
	}

	public void functionAvailableLoginButton() throws InterruptedException {
		System.out.println("6. Verify Functionality, avaibility get Text of Login Button");
		String LoginButtonText = LoginButton.getText();
		System.out.println("Login Button Text : " + LoginButtonText);
		if(LoginButtonText.equals("Login")) {
			System.out.println("Login Button Text is Correct");
		}
		else {
			System.out.println("Login Button Text is Wrong");
		}
		System.out.println("Login Button  is Enabled : " + LoginButton.isEnabled());
		Thread.sleep(1000);
		System.out.println("Login Button  is Displayed : " + LoginButton.isDisplayed());
		Thread.sleep(1000);		
		LoginIdField.sendKeys("admin@getid.com");
		Thread.sleep(1000);
		System.out.println("Entered Valid Login ID");
		PasswordField.sendKeys("123456");
		Thread.sleep(1000);
		System.out.println("Entered Valid Password");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Login Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Logout Button");
	}

	public void LoginAndValidMessageLoginIdPassBlankData() throws InterruptedException {
		System.out.println("7. Verify Login and Validation message of Login Id and Password Fields with Blank Data");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Directly Click on Login Button");
		String ValidationMessageLoginIdText = ValidationMessageLoginId.getText();
		System.out.println("Validation Message LoginId Text : " + ValidationMessageLoginIdText);
		if(ValidationMessageLoginIdText.equals("Login ID field is required")) {
				System.out.println("Validation Message Login Id Field Text is Correct");
		}
		else {
			System.out.println("Validation Message Login Id Text is Wrong");
		}
		Thread.sleep(1000);
		String ValidationMessagePasswordText = ValidationMessagePassword.getText();
		System.out.println("Validation Message Password Text : " + ValidationMessagePasswordText);
		if(ValidationMessagePasswordText.equals("Password field is required")) {
			System.out.println("Validation Message Password Field Text is Correct");
		}
		else {
		System.out.println("Validation Message Password Field Text is Wrong");
		}
		Thread.sleep(1000);
	}

	public void LoginValidLoginIdPassword() throws InterruptedException {
		System.out.println("8. Verify login with valid Login Id and valid Password");
		LoginIdField.sendKeys("admin@getid.com");
		Thread.sleep(1000);
		System.out.println("Entered Valid Login ID");
		PasswordField.sendKeys("123456");
		Thread.sleep(1000);
		System.out.println("Entered Valid Password");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Login Button");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Logout Button");
	}

	public void LoginAndValidMessageInvalidLoginIdPassword() throws InterruptedException {
		System.out.println("9. Verify Login and Validation message with invalid Login Id and invalid Password");
		LoginIdField.sendKeys("admin");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Login ID");
		PasswordField.sendKeys("123");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Password");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Login Button");
		String InvalidMessageLoginIdText = InvalidMessageLoginId.getText();
		System.out.println("Invalid Message LoginId Text : " + InvalidMessageLoginIdText);
		if(InvalidMessageLoginIdText.equals("Invalid login ID")) {
			System.out.println("Invalid Login Id Validation Message Text is CORRECT");
		}
		else {
			System.out.println("Invalid Login Id Validation Message Text is WRONG");
		}
		Thread.sleep(1000);
		String InvalidMessagePasswordText = InvalidMessagePassword.getText();
		System.out.println("Invalid Message Password Text : " + InvalidMessagePasswordText);
		if(InvalidMessageLoginIdText.equals("Invalid login ID")) {
			System.out.println("Invalid Password Validation Message Text is CORRECT");
		}
		else {
			System.out.println("Invalid Password Validation Message Text is WRONG");
		}
		Thread.sleep(1000);
		LoginIdField.clear();
		Thread.sleep(1000);
		System.out.println("Cleared Login ID");
		PasswordField.clear();
		Thread.sleep(1000);
		System.out.println("Cleared Password");
		driver.navigate().to("https://taj888.com/login");
		Thread.sleep(2000);
		System.out.println("Page Navigate to : https://taj888.com/login");
	}

	public void LoginAndValidMessageInvalidLoginIdValidPassword() throws InterruptedException {
		System.out.println("10. Verify Login and Validation message with invalid Login Id and valid Password");
		LoginIdField.sendKeys("admin");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Login ID");
		PasswordField.sendKeys("123456");
		Thread.sleep(1000);
		System.out.println("Entered Valid Password");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Login Button");
		String InvalidMessageLoginIdText = InvalidMessageLoginId.getText();
		System.out.println("Invalid Message LoginId Text : " + InvalidMessageLoginIdText);
		if(InvalidMessageLoginIdText.equals("Invalid login ID")) {
			System.out.println("Invalid Login Id Validation Message Text is CORRECT");
		}
		else {
			System.out.println("Invalid Login Id Validation Message Text is WRONG");
		}
		Thread.sleep(1000);
		LoginIdField.clear();
		Thread.sleep(1000);
		System.out.println("Cleared Login ID");
		PasswordField.clear();
		Thread.sleep(1000);
		System.out.println("Cleared Password");
		driver.navigate().to("https://taj888.com/login");
		Thread.sleep(2000);
		System.out.println("Page Navigate to : https://taj888.com/login");
	}

	public void LoginAndValidMessageValidLoginIdInValidPassword() throws InterruptedException {
		System.out.println("11. Verify Login and Validation message with valid Login Id and invalid Password");
		LoginIdField.sendKeys("admin@getid.com");
		Thread.sleep(1000);
		System.out.println("Entered Valid Login ID");
		PasswordField.sendKeys("abc");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Password");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Login Button");
		String InvalidMessagePasswordText = InvalidMessagePassword.getText();
		System.out.println("Invalid Message Password Text : " + InvalidMessagePasswordText);		
		Thread.sleep(1000);
		String MessageInvalidEmailOrPasswordText = MessageInvalidEmailOrPassword.getText();
		System.out.println("Invalid Email Or Password Validation Message Text : " + MessageInvalidEmailOrPasswordText);
		if(MessageInvalidEmailOrPasswordText.equals("Invalid email or password.")) {
			System.out.println("Invalid Email Or Password Validation Message Text is CORRECT");
		}
		else {
			System.out.println("Invalid Password Validation Message Text is WRONG");
		}
		LoginIdField.clear();
		Thread.sleep(1000);
		System.out.println("Cleared Login ID");
		PasswordField.clear();
		Thread.sleep(1000);
		System.out.println("Cleared Password");
		driver.navigate().to("https://taj888.com/login");
		Thread.sleep(2000);
		System.out.println("Page Navigate to : https://taj888.com/login");
	}

	public void LoginAndValidMessageValidLoginIdBlankPassword() throws InterruptedException {
		System.out.println("12. Verify Login and Validation message with valid Login Id and blank Password");
		LoginIdField.sendKeys("admin@getid.com");
		Thread.sleep(1000);
		System.out.println("Entered Valid Login ID");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Login Button");
		String ValidationMessagePasswordText = ValidationMessagePassword.getText();
		System.out.println("Validation Message Password Text : " + ValidationMessagePasswordText);
		if(ValidationMessagePasswordText.equals("Password field is required")) {
			System.out.println("Validation Message Blank Password Text is CORRECT");
		}
		else {
			System.out.println("Validation Message Blank Password Text is WRONG");
		}
		Thread.sleep(1000);
		LoginIdField.clear();
		Thread.sleep(1000);
		System.out.println("Cleared Login ID");
		driver.navigate().to("https://taj888.com/login");
		Thread.sleep(2000);
		System.out.println("Page Navigate to : https://taj888.com/login");
	}

	public void LoginAndValidMessageInvalidLoginIdBlankPassword() throws InterruptedException {
		System.out.println("13. Verify Login and Validation message with invalid Login Id and blank Password");
		LoginIdField.sendKeys("admin");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Login ID");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Login Button");
		String InvalidMessageLoginIdText = InvalidMessageLoginId.getText();
		System.out.println("Validation Message for Invalid LoginId Text : " + InvalidMessageLoginIdText);
		if(InvalidMessageLoginIdText.equals("Invalid login ID")) {
			System.out.println("Validation Message for Invalid LoginId Text is CORRECT");
		}
		else {
			System.out.println("Validation Message for Invalid LoginId Text is WRONG");
		}
		Thread.sleep(1000);
		String ValidationMessagePasswordText = ValidationMessagePassword.getText();
		System.out.println("Validation Message Blank Password Text : " + ValidationMessagePasswordText);
		if(ValidationMessagePasswordText.equals("Password field is required")) {
			System.out.println("Validation Message Blank Password Text is CORRECT");
		}
		else {
			System.out.println("Validation Message Blank Password Text is WRONG");
		}
		Thread.sleep(1000);
		LoginIdField.clear();
		Thread.sleep(1000);
		System.out.println("Cleared Login ID");
		driver.navigate().to("https://taj888.com/login");
		Thread.sleep(2000);
		System.out.println("Page Navigate to : https://taj888.com/login");
	}

	public void LoginAndValidMessageBlankLoginIdValidPassword() throws InterruptedException {
		System.out.println("14. Verify Login and Validation message with blank Login Id and valid Password");
		PasswordField.sendKeys("123456");
		Thread.sleep(1000);
		System.out.println("Entered Valid Password");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Login Button");
		String ValidationMessageLoginIdText = ValidationMessageLoginId.getText();
		System.out.println("Validation Message LoginId Text : " + ValidationMessageLoginIdText);
		if(ValidationMessageLoginIdText.equals("Login ID field is required")) {
			System.out.println("Validation Message Blank Login Id Field Text is CORRECT");
		}
		else {
			System.out.println("Validation Message Blank Login Id Field Text is WRONG");
		}
		Thread.sleep(1000);
		PasswordField.clear();
		Thread.sleep(1000);
		driver.navigate().to("https://taj888.com/login");
		Thread.sleep(2000);
	}

	public void LoginAndValidMessageBlankLoginIdInvalidPassword() throws InterruptedException {
		System.out.println("15. Verify Login and Validation message with blank Login Id and invalid Password");
		PasswordField.sendKeys("abc");
		Thread.sleep(1000);
		System.out.println("Entered Invalid Password");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Click on Login Button");
		String ValidationMessageLoginIdText = ValidationMessageLoginId.getText();
		System.out.println("Validation Message LoginId Text : " + ValidationMessageLoginIdText);
		if(ValidationMessageLoginIdText.equals("Login ID field is required")) {
			System.out.println("Validation Message Blank Login Id Field Text is CORRECT");
		}
		else {
			System.out.println("Validation Message Blank Login Id Field Text is WRONG");
		}
		Thread.sleep(1000);
		String InvalidMessagePasswordText = InvalidMessagePassword.getText();
		System.out.println("Validation Message for Invalid Password Text : " + InvalidMessagePasswordText);
		if(InvalidMessagePasswordText.equals("Invalid Password")) {
			System.out.println("Validation Message for Invalid Password Text is CORRECT");
		}
		else {
			System.out.println("Validation Message for Invalid Password Text is WRONG");
		}
		Thread.sleep(1000);
		PasswordField.clear();
		Thread.sleep(2000);
		driver.navigate().to("https://taj888.com/login");
		Thread.sleep(2000);
	}

	public void PermissinPopNotificationCancleAllow() throws InterruptedException {
		System.out.println("16. Verify permission popup notification message, Cancle and Allow Buttton after login");
		login();
		Thread.sleep(2000);
		System.out.println("Click on Login Button");
		NotificationAllow.click();
		Thread.sleep(2000);
		System.out.println("Click on Notification Allow");
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Logout Button");
	}

	public void VerifyTitleBeforeAndAfterLogin() throws InterruptedException {
		System.out.println("17. Verify Webpage Title Before and After Login");
		String actTitleBeforeLogin = driver.getTitle();
		System.out.println("Actual Title Before Login : " + actTitleBeforeLogin);
		if (actTitleBeforeLogin.equals("GET-ID")) {
			System.out.println("Actual Title Before Login Test Case Passed ");
		} else {
			System.out.println("Actual Title Before Login Test Case Failed ");
		}
		login();
		String actTitleAfterLogin = driver.getTitle();
		System.out.println("Actual Title Before Login : " + actTitleAfterLogin);
		if (actTitleAfterLogin.equals("GET-ID")) {
			System.out.println("Actual Title After Login Test Case Passed ");
		} else {
			System.out.println("Actual Title After Login Test Case Failed ");
		}
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Logout Button");		
	}
	
	public void VerifyUrlBeforeAndAfterLogin() throws InterruptedException {
		System.out.println("18. Verify Webpage Url Before and After Login");
		String actUrlBeforeLogin = driver.getCurrentUrl();
		System.out.println("Actual Title Before Login : " + actUrlBeforeLogin);
		if (actUrlBeforeLogin.equals("https://taj888.com/login")) {
			System.out.println("Actual Title Before Login Test Case Passed ");
		} else {
			System.out.println("Actual Title Before Login Test Case Failed ");
		}
		login();
		String actUrlAfterLogin = driver.getCurrentUrl();
		System.out.println("Actual Title Before Login : " + actUrlAfterLogin);
		if (actUrlAfterLogin.equals("https://taj888.com/home")) {
			System.out.println("Actual Title After Login Test Case Passed ");
		} else {
			System.out.println("Actual Title After Login Test Case Failed ");
		}
		LogoutTop.click();
		Thread.sleep(2000);
		System.out.println("Click on Logout Button");
	}
	
	public void FunctionalityOfButtonsAndFieldsWithTabEnterButton() throws InterruptedException {
		System.out.println("19. Verify Functionality of Button and fields with Tab and Enter Button");
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
		Thread.sleep(2000);	
	}

	// login only for PermissinPopNotificationCancleAllow Test Case No 16
	public void login() throws InterruptedException {
		LoginIdField.sendKeys("admin@getid.com");
		Thread.sleep(1000);
		System.out.println("Entered Valid Login ID");
		PasswordField.sendKeys("123456");
		Thread.sleep(1000);
		System.out.println("Entered Valid Password");
		LoginButton.click();
		Thread.sleep(2000);
		System.out.println("Click On Login Button");
	}

	public void enterCred() throws InterruptedException {
		LoginIdField.sendKeys("admin@getid.com");
		Thread.sleep(1000);
		System.out.println("Entered Valid Login ID");
		PasswordField.sendKeys("123456");
		Thread.sleep(1000);
		System.out.println("Entered Valid Password");
	}

	public void clickOnLoginButton() throws InterruptedException {
		LoginButton.click();
		Thread.sleep(2000);
	}

	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		LogoutTop.click();
	}
}

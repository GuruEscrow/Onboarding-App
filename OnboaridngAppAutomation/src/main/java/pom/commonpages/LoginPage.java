package pom.commonpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//	Declaration
	
	//Enter Mail ID Page
	/*
	 * This variable have email input field element
	 */
	@FindBy(xpath =  "//label[text()='Enter your Email']/following-sibling::div/input")
	private WebElement emailInput;
	
	/*
	 * This variable holds Get OTP button as WebElement
	 */
	@FindBy(className = "//b[text()='Get OTP']/parent::div")
	private WebElement getOTPButton;
	
	//Enter OTP page
	/*
	 * This variable holds Get OTP button as WebElement
	 */
	@FindBy(xpath =  "//label[text()='Enter OTP']/following-sibling::div/input")
	private WebElement otpInput;
	
	/*
	 * This variable holds verify OTP button
	 */
	@FindBy(xpath = "//b[text()='VERIFY OTP']/parent::div")
	private WebElement verifyOTPButton;
	
//	Initialization
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
//	Utilization
	
	//Enter Mail ID Page
	/*
	 * This method is used to send the input to email field
	 */
	public void sendEmail(String loginEmail) {
		emailInput.sendKeys(loginEmail);;
	}
	
	/*
	 * This method will return the email input element as WebElement
	 */
	public WebElement EmailInputAsWebElement() {
		return emailInput;
	}
	
	/*
	 * This method is used to click on the Get OTP button
	 */
	public void clickOnGetOTP() {
		getOTPButton.click();
	}
	
	/*
	 * This method will return getOTP button as WebElement
	 */
	public WebElement getOTPButtonAsWebElement() {
		return getOTPButton;
	}
	
	//Enter OTP Page
	/*
	 * This method is used to send the input to OTP field
	 */
	public void sendOTP(String OTP) {
		otpInput.sendKeys(OTP);
	}
	
	/*
	 * This method is used to get the OTP input field as WebElement
	 */
	public WebElement otpInputAsWebElement() {
		return otpInput;
	}
	
	/*
	 * This method is used to click on the Verify OTP button
	 */
	public void clickOnVerifyOtp() {
		verifyOTPButton.click();
	}
	
	/*
	 * This method is used to get the verify OTP button 
	 */
	public WebElement verifyOTPButtonAsWebElement() {
		return verifyOTPButton;
	}
}

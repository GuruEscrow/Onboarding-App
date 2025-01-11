package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EscrowListPage {

//	Declaration

	/*
	 * This holds the profile elements like as below Logo: to open the login details
	 * and logout button Logged in user Name Logged in user role Logged in user mail
	 * ID
	 */
	@FindBy(xpath = "//div[@style='position: relative; cursor: pointer;']")
	private WebElement profileIcon;

	@FindBy(className = "header_userName__NqrJX")
	private WebElement userName;

	@FindBy(className = "header_role__LnQQQ")
	private WebElement userRole;

	@FindBy(className = "header_mail__pzMke")
	private WebElement userEmail;

	@FindBy(xpath = "//div[text()='Logout']")
	private WebElement logoutButton;

	/*
	 * Side Navigation Element declaration
	 */
	// This holds escrow A/c List
	@FindBy(xpath = "//div[text()='Escrow A/C List']/parent::button")
	private WebElement escrowAccListMenu;

	// This holds userMangement Menu
	@FindBy(xpath = "//div[text()='User Management']/parent::button")
	private WebElement userMangementMenu;

	// This holds KYC list menu button present in the side nav and method will
	// return as webElement
	@FindBy(xpath = "//div[contains(@class,'SideNavContainer_Active__5w+8h')]/parent::button")
	private WebElement sideNavKYCListMenu;

	public WebElement sideNavKYCListMenu() {
		return sideNavKYCListMenu;
	}

	// This holds contract list menu button present in the side nav and method will
	// return as WebElement
	@FindBy(xpath = "//div[contains(@class,'SideNavContainer_contractsList1__a1fzv')]/parent::button")
	private WebElement sideNavContractListMenu;

	public WebElement sideNavContractListMenu() {
		return sideNavContractListMenu;
	}

	// This holds Esing & Estamp menu button present in the side nav and method will
	// return as WebElement
	@FindBy(xpath = "//div[contains(@class,'SideNavContainer_kycList1__iYc79') and text()='E-sign & E-stamp']/parent::button")
	private WebElement sideNavEsignEstampMenu;

	public WebElement sideNavEsignEstampMenu() {
		return sideNavEsignEstampMenu;
	}

	/*
	 * Table and other elements like
	 */
	@FindBy(xpath = "//b[text()='Add Escrow account']/parent::button")
	private WebElement addEscrowAccount;

	/*
	 * New Escrow Account pop up element
	 */
	@FindBy(xpath = "//input[@placeholder='Escrow Name']")
	private WebElement escrowNameInputField;

	@FindBy(xpath = "//b[text()='Cancel']/parent::div")
	private WebElement closeEscrowCreationFrame;

	@FindBy(xpath = "//b[text()='Create']/parent::div")
	private WebElement createEscrowButton;

//	Initialization
	public EscrowListPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

//	Declaration

	/*
	 * The below methods will use to do action on the below mentioned elements Logo:
	 * to open the login details and logout button Logged in user Name Logged in
	 * user role Logged in user mail ID
	 */
	// This method is used to click on the profile icon
	public void clickOnProfile() {
		profileIcon.click();
	}

	// This method is used to get user name
	public String getUserName() {
		return userName.getText();
	}

	// This method is used to get user role
	public String getUserRole() {
		return userRole.getText();
	}

	// This method is used to get user mail ID
	public String getUserEmail() {
		return userEmail.getText();
	}

	// This method is used to click on Logout button
	public void clickOnLogout() {
		logoutButton.click();
	}

	/*
	 * Side Navigation Element Utilization
	 */
	// This method is used to click on the Escrow Acc List
	public void clickOnEscrowAccList() {
		escrowAccListMenu.click();
	}

	// This method is used to get the Escrow Acc List as WebElement
	public WebElement escrowAccListWebElement() {
		return escrowAccListMenu;
	}

	// This method is used to click on the User Management
	public void clickOnUserMangement() {
		userMangementMenu.click();
	}

	// This method is used to get the User Management as WebElement
	public WebElement userMangementWebElement() {
		return userMangementMenu;
	}

	/*
	 * Escrow Creation pop up
	 */
	// This method is used to send the escrow name to Escrow Name input field
	public void sendEscrowName(String escrowName) {
		escrowNameInputField.sendKeys(escrowName);
	}

	// This method is used to get the Escrow Name input field as WebElement
	public WebElement escrowNameFieldElement() {
		return escrowNameInputField;
	}

	// This method is used to click on the create button to create the Escrow
	public void createEscrow() {
		createEscrowButton.click();
	}

	// This method is used to click on the Escrow creation cancel button
	public void cancelEscrowCreation() {
		closeEscrowCreationFrame.click();
	}

}

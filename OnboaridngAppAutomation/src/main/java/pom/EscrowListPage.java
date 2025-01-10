package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EscrowListPage {

//	Declaration
	
	/*
	 * This holds the profile elements like as below
	 * Logo: to open the login details and logout button
	 * Logged in user Name
	 * Logged in user role
	 * Logged in user mail ID
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
	//This holds escrow A/c List
	@FindBy(xpath = "//div[text()='Escrow A/C List']/parent::button")
	private WebElement escrowAccListMenu;
	
	@FindBy(xpath = "//div[text()='User Management']/parent::button")
	private WebElement userMangementMenu;
	
	/*
	 * Table and other elements like
	 * Add Escrow account
	 * Table elements
	 */
	@FindBy(xpath = "//b[text()='Add Escrow account']/parent::button")
	private WebElement addEscrowAccount;
	
	@FindBy(className = "css-1juu494")
	private WebElement escrowListSearchField;
	
	@FindBy(xpath = "//button[@aria-label='Choose date']")
	private WebElement calendarButton;
	
	@FindBy(xpath = "//thead/tr/th")
	private List<WebElement> escrowListTableHeader;
	
	@FindBy(xpath = "//tbody/tr")
	private List<WebElement> escrowListEntriesInRows;
	
	@FindBy(xpath = "//button[@aria-label='Go to previous page']")
	private WebElement goToPreviousPage;
	
	@FindBy(xpath = "//button[@aria-label='Go to next page']")
	private WebElement goToNextPage;
	
	@FindBy(className = "MuiTablePagination-displayedRows")
	private WebElement displayedRowsCount;
	
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
	 * The below methods will use to do action on the below mentioned elements
	 * Logo: to open the login details and logout button
	 * Logged in user Name
	 * Logged in user role
	 * Logged in user mail ID
	 */
	//This method is used to click on the profile icon
	public void clickOnProfile() {
		profileIcon.click();
	}
	
	//This method is used to get user name
	public String getUserName() {
		return userName.getText();
	}
	
	//This method is used to get user role
	public String getUserRole() {
		return userRole.getText();
	}
	
	//This method is used to get user mail ID
	public String getUserEmail() {
		return userEmail.getText();
	}
	
	//This method is used to click on Logout button
	public void clickOnLogout() {
		logoutButton.click();
	}
	
	/*
	 * Side Navigation Element Utilization
	 */
	//This method is used to click on the Escrow Acc List
	public void clickOnEscrowAccList() {
		escrowAccListMenu.click();
	}
	
	//This method is used to get the Escrow Acc List as WebElement
	public WebElement escrowAccListWebElement() {
		return escrowAccListMenu;
	}
	
	//This method is used to click on the User Management
	public void clickOnUserMangement() {
		userMangementMenu.click();
	}
	
	//This method is used to get the User Management as WebElement
	public WebElement userMangementWebElement() {
		return userMangementMenu;
	}
	
	/*
	 * Table and other elements like
	 * Add Escrow account
	 * Table elements
	 */
	//This method is used to return EscrowList search WebElement
	public WebElement escrowListSearchWebElement() {
		return escrowListSearchField;
	}
	
	//This method is used to click on the calendar button
	public void clickOnCalendar() {
		calendarButton.click();
	}
	
	//This method is used to get the Escrow List table header
	public List<WebElement> escrowListTableHeader(){
		return escrowListTableHeader;
	}
	
	//This method is used to get the Escrow List table body
	public List<WebElement> escrowListTableBody(){
		return escrowListEntriesInRows;
	}
	
	//This method is used to get the previous page navigation button
	public WebElement previousPaginationElement() {
		return goToPreviousPage;
	}
	
	//This method is used to get the go to next page navigation button as WebElement
	public WebElement nextPaginationElement() {
		return goToNextPage;
	}
	
	//This method will return the number of rows present as string with number
	public String noRowsInEscrowListTable() {
		return displayedRowsCount.getText();
	}
	
	/*
	 * Escrow Creation pop up
	 */
	//This method is used to send the escrow name to Escrow Name input field
	public void sendEscrowName(String escrowName) {
		escrowNameInputField.sendKeys(escrowName);
	}
	
	//This method is used to get the Escrow Name input field as WebElement
	public WebElement escrowNameFieldElement() {
		return escrowNameInputField;
	}

	//This method is used to click on the create button to create the Escrow
	public void createEscrow() {
		createEscrowButton.click();
	}
	
	//This method is used to click on the Escrow creation cancel button
	public void cancelEscrowCreation() {
		closeEscrowCreationFrame.click();
	}

}

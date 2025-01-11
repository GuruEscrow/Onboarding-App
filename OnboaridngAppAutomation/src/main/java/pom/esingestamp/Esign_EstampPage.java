package pom.esingestamp;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Esign_EstampPage {

	public Esign_EstampPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*
	 * Select Activity menus
	 */
	// This variable holding KYC list button and return as WebElement using method
	@FindBy(xpath = "//div[@class='SelectActivity1_kycList11__T3yUG']/parent::button")
	private WebElement kycListInActivity;

	public WebElement activityKycListElement() {
		return kycListInActivity;
	}

	// This variable holding contracts button and return as WebElement using method
	@FindBy(xpath = "//div[@class='SelectActivity1_kycList11__T3yUG']/parent::button")
	private WebElement contractsActivity;

	public WebElement activityContractElement() {
		return contractsActivity;
	}

	// This variable holding Esign Estamp button and return as WebElement using
	// method
	@FindBy(xpath = "//div[@class='SelectActivity1_kycList11__T3yUG']/parent::button")
	private WebElement eSignEstmapActivity;

	public WebElement activityEsignEstampElement() {
		return eSignEstmapActivity;
	}

	// This variable holding cross button to close the Select Activity and closing
	// the frame using the method
	@FindBy(className = "SelectActivity1_xCircle__mXXGH")
	private WebElement closeSelectActivity;

	public void closeSelectActivity() {
		closeSelectActivity.click();
	}

	/*
	 * Top bar element i.e Header [Escrow Name], New E-sign Request button
	 */
	// This hold the E-sign & E-stamp landing page header and method will return the
	// header as String
	@FindBy(className = "EsignMain_escrowName__3jt8f mt-4 mb-3")
	private WebElement landingPageHeader;

	public String getLadingPageHeader() {
		return landingPageHeader.getText();
	}

	// This holds the New E-sign Request button and method will return as WebElement
	@FindBy(xpath = "//b[text()='New E-sign Request']/parent::button")
	private WebElement newEsignRequest;

	public WebElement newEsignRequestBtnElement() {
		return newEsignRequest;
	}

	/*
	 * Filter bar Elements i.e Status filters
	 */
	// This holds the status filter dropdown button and method is used to click on
	// the dropdown
	@FindBy(className = "css-5qnso7")
	private WebElement statusFilter;

	public void clickOnStatusDD() {
		statusFilter.click();
	}

	// This holds all the available status in the status dropdown and method will
	// return the status available as List<WebElement>
	@FindBy(xpath = "//ul[contains(@class,'css-ubifyk')]/li")
	private List<WebElement> allStatus;

	public List<WebElement> allStatusInDD() {
		return allStatus;
	}

	// This holds the draft satus and method used to click on that
	@FindBy(xpath = "//ul[contains(@class,'css-ubifyk')]/li[text()='Draft']")
	private WebElement draftStatus;

	public void clickOnDraftStatus() {
		draftStatus.click();
	}

	// This holds the Requested satus and method used to click on that
	@FindBy(xpath = "//ul[contains(@class,'css-ubifyk')]/li[text()='Requested']")
	private WebElement requestedStatus;

	public void clickOnResquestedStatus() {
		requestedStatus.click();
	}

	// This holds the Completed satus and method used to click on that
	@FindBy(xpath = "//ul[contains(@class,'css-ubifyk')]/li[text()='Completed']")
	private WebElement completedStatus;

	public void clickOnCompletedStatus() {
		completedStatus.click();
	}

	// This holds the Pending satus and method used to click on that
	@FindBy(xpath = "//ul[contains(@class,'css-ubifyk')]/li[text()='Pending']")
	private WebElement pendingStatus;

	public void clickOnPendingStatus() {
		pendingStatus.click();
	}

	// This holds the Expired satus and method used to click on that
	@FindBy(xpath = "//ul[contains(@class,'css-ubifyk')]/li[text()='Expired']")
	private WebElement expiredStatus;

	public void clickOnExpiredStatus() {
		expiredStatus.click();
	}

}

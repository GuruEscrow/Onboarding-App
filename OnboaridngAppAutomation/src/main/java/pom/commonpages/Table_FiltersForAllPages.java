package pom.commonpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Table_FiltersForAllPages {

	// Initialization of driver to the class
	public Table_FiltersForAllPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/*
	 * Common filter element for all the pages
	 */
	// This method is used to return EscrowList search WebElement
	@FindBy(className = "css-1juu494")
	private WebElement SearchField;

	public WebElement SearchWebElement() {
		return SearchField;
	}

	// This method is used to click on the calendar button
	@FindBy(xpath = "//button[@aria-label='Choose date']")
	private WebElement calendarButton;

	public void clickOnCalendar() {
		calendarButton.click();
	}
	
	//This holds filter apply button and method used to click on that button
	@FindBy(xpath = "//b[text()='Apply']/parent::div")
	private WebElement applyButton;
	
	public void applyFilter() {
		applyButton.click();
	}

	/*
	 * Table Elements
	 */
	// This method is used to get the Escrow List table header
	@FindBy(xpath = "//thead/tr/th")
	private List<WebElement> tableHeader;

	public List<WebElement> getTableHeader() {
		return tableHeader;
	}

	// This method is used to get the Escrow List table body
	@FindBy(xpath = "//tbody/tr")
	private List<WebElement> entriesInRows;

	public List<WebElement> getTableBody() {
		return entriesInRows;
	}

	// This method is used to get the previous page navigation button
	@FindBy(xpath = "//button[@aria-label='Go to previous page']")
	private WebElement goToPreviousPage;

	public WebElement previousPaginationElement() {
		return goToPreviousPage;
	}

	// This method is used to get the go to next page navigation button as
	// WebElement
	@FindBy(xpath = "//button[@aria-label='Go to next page']")
	private WebElement goToNextPage;

	public WebElement nextPaginationElement() {
		return goToNextPage;
	}

	// This method will return the number of rows present as string with number
	@FindBy(className = "MuiTablePagination-displayedRows")
	private WebElement displayedRowsCount;

	public String noRowsInEscrowListTable() {
		return displayedRowsCount.getText();
	}

}

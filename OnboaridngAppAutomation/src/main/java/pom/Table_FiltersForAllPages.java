package pom;

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
	private WebElement escrowListSearchField;

	public WebElement escrowListSearchWebElement() {
		return escrowListSearchField;
	}

	// This method is used to click on the calendar button
	@FindBy(xpath = "//button[@aria-label='Choose date']")
	private WebElement calendarButton;

	public void clickOnCalendar() {
		calendarButton.click();
	}

	/*
	 * Table Elements
	 */
	// This method is used to get the Escrow List table header
	@FindBy(xpath = "//thead/tr/th")
	private List<WebElement> escrowListTableHeader;

	public List<WebElement> escrowListTableHeader() {
		return escrowListTableHeader;
	}

	// This method is used to get the Escrow List table body
	@FindBy(xpath = "//tbody/tr")
	private List<WebElement> escrowListEntriesInRows;

	public List<WebElement> escrowListTableBody() {
		return escrowListEntriesInRows;
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

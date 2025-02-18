package pom.esingestamp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewEsignCreationPage {

	/*
	 * Top bar elements i.e backward button and Header [Escrow name]
	 */
	//Esign & Estamp back navigation button
	@FindBy(xpath = "//div[@class='NewEsign_arrowNarrowLeftParent__ZXlvt']/img")
	private WebElement backWard;
	
	public void clickOnBackWard() {
		backWard.click();
	}
	
	//Esign & Estamp header i.e is [Escrow name]
	@FindBy(className = "NewEsign_escrowName__jZSJb")
	private WebElement escrowName;
	
	public String getEscrowName() {
		return escrowName.getText();
	}
	
	/*
	 * Party Details section element i.e
	 * Name of Agreement
	 * Parties Dropdown
	 * Add Parties button
	 * Continue button
	 */
	@FindBy(xpath = "//label[text()='Name of Agreement']/following-sibling::div/input")
	private WebElement nameOfAgreement;

    public WebElement nameOfAgreement() {
    	return nameOfAgreement;
    }
    
    
}

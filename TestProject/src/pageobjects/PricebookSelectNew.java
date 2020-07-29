package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( connection="Autoqagohw"
     )             
public class PricebookSelectNew {

	@ChoiceListType()
	@FindBy(xpath = "//td[@id='price_book_picklist_col']/select")
	public WebElement price_book_select;
	
	@ButtonType()
	@FindBy(xpath = "(//input[@type='submit' and @value='Save'])[1]")
	public WebElement save;

	@LinkType()
	@FindBy(linkText = "Leads")
	public WebElement leads;

	@ButtonType()
	@FindByLabel(label = "View profile")
	public WebElement viewProfile;

	@TextType()
	@FindBy(xpath = "//div/div/div/div/div/div/div")
	public WebElement _104_a;

	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts;

	@LinkType()
	@FindBy(linkText = "Contacts")
	public WebElement contacts;

	@TextType()
	@FindByLabel(label = "Username")
	public WebElement username;

	@TextType()
	@FindByLabel(label = "Password")
	public WebElement password;

	@ButtonType()
	@FindByLabel(label = "Log In to Sandbox")
	public WebElement logInToSandbox;

	@LinkType()
	@FindBy(linkText = "Cases")
	public WebElement cases;

	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunities;

	@LinkType()
	@FindBy(linkText = "New")
	public WebElement new_;

	@LinkType()
	@FindBy(linkText = "Create RMA Opportunities")
	public WebElement createRMAOpportunities;

	@LinkType()
	@FindBy(linkText = "Meraki Go Returns Manager")
	public WebElement merakiGoReturnsManager;

	@ButtonType()
	@FindByLabel(label = "View profile")
	public WebElement viewProfile1;

	@ButtonType()
	@FindByLabel(label = "New")
	public WebElement new_1;

	@LinkType()
	@FindBy(linkText = "Mr.")
	public WebElement mr;

	@LinkType()
	@FindBy(linkText = "Arts/Recreation")
	public WebElement artsRecreation;

	@LinkType()
	@FindBy(linkText = "100 to 999")
	public WebElement _100To999;

	@TextType()
	@FindByLabel(label = "Verification Code")
	public WebElement verificationCode;

	@ButtonType()
	@FindByLabel(label = "Verify")
	public WebElement verify;
	
			
}

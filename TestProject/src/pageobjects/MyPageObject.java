package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage(connection = "Qagohwsandbox", title = "MyPageObject")
public class MyPageObject {

	@ButtonType()
	@FindByLabel(label = "Log In to Sandbox")
	public WebElement logInToSandbox;
	@TextType()
	@FindByLabel(label = "Username")
	public WebElement username;
	@TextType()
	@FindByLabel(label = "Password")
	public WebElement password;
	@ButtonType()
	@FindByLabel(label = "View profile")
	public WebElement viewProfile;
	@LinkType()
	@AuraBy(componentXPath = "//ui:outputURL[@value= '{!v.fullAlohaUrl}']")
	public WebElement switchToSalesforceClassic;
	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunities;
	@LinkType()
	@FindBy(linkText = "Leads")
	public WebElement leads;
	@ButtonType()
	@FindByLabel(label = "View profile")
	public WebElement viewProfile1;
	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts;
	@ButtonType()
	@FindByLabel(label = "New")
	public WebElement new_1;
			
}

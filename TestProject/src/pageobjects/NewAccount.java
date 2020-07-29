package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="New Account"                                
               , page="NewAccount"
               , object="Account"
               , connection="Autoqagohw"
     )             
public class NewAccount {

	@VisualforceBy(componentXPath = "c:AccountInformation[1]//apex:pageBlockSection//apex:inputText[@id='new_name']")
	@SalesforceField(name = "Name", object = "Account")
	public WebElement name;
	@VisualforceBy(componentXPath = "c:AccountInformation[1]//apex:pageBlockSection//apex:inputText[@id='new_street']")
	@SalesforceField(name = "BillingStreet", object = "Account")
	public WebElement address;
	@VisualforceBy(componentXPath = "c:AccountInformation[1]//apex:pageBlockSection//apex:inputText[@id='new_city']")
	@SalesforceField(name = "BillingCity", object = "Account")
	public WebElement city;
	@VisualforceBy(componentXPath = "c:AccountInformation[1]//apex:pageBlockSection//apex:inputText[@id='new_state']")
	@SalesforceField(name = "BillingState", object = "Account")
	public WebElement state;
	@VisualforceBy(componentXPath = "c:AccountInformation[1]//apex:pageBlockSection//apex:inputText[@id='new_postal_code']")
	@SalesforceField(name = "BillingPostalCode", object = "Account")
	public WebElement postalCode;
	@VisualforceBy(componentXPath = "c:AccountInformation[1]//apex:pageBlockSection//apex:inputText[@id='new_country']")
	@SalesforceField(name = "BillingCountry", object = "Account")
	public WebElement country;
	@ButtonType()
	@VisualforceBy(componentXPath = "c:AccountInformation[1]//apex:pageBlockSection//apex:commandButton[@id='submitBtn']")
	public WebElement search;
	@ButtonType()
	@VisualforceBy(componentXPath = "c:SearchAccounts[1]//apex:pageBlockSection[@id='searchCriteria']//apex:commandButton[@id='searchBtn']")
	public WebElement searchAgain;
	@ButtonType()
	@VisualforceBy(componentXPath = "c:SearchAccounts[1]//apex:pageBlock[not(@id)]//apex:outputPanel[@id='listPanel']//apex:commandButton[@id='noMatch']")
	public WebElement noMatch;
	@ButtonType()
	@VisualforceBy(componentXPath = "c:SearchAccounts[2]//apex:pageBlock[not(@id)]//apex:outputPanel[@id='listPanel']//apex:commandButton[@id='noMatch']")
	public WebElement noMatch1;
	@ButtonType()
	@VisualforceBy(componentXPath = "c:AccountInformation[2]//apex:pageBlockSection//apex:commandButton[@id='submitBtn']")
	public WebElement create;
	@ButtonType()
	@VisualforceBy(componentXPath = "c:SearchAccounts[2]//apex:pageBlockSection[@id='searchCriteria']//apex:commandButton[@id='searchBtn']")
	public WebElement searchAgain1;
	@LinkType()
	@FindBy(linkText = "Choose")
	public WebElement choose;
	@VisualforceBy(componentXPath = "c:AccountInformation[2]//apex:pageBlockSection//apex:inputText[@id='new_name']")
	@SalesforceField(name = "Name", object = "Account")
	public WebElement name1;
	@LinkType()
	@FindBy(linkText = "Meraki Inc")
	public WebElement merakiInc;
	@TextType()
	@VisualforceBy(componentXPath = "c:SearchAccounts[2]//apex:pageBlock[not(@id)]//apex:outputPanel[@id='listPanel']//apex:outputPanel[@id='resultsWithSAV']//div[1]")
	public WebElement resultsWithSAV;
	
}

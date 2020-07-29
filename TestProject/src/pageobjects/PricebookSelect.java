package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Pricebook Select"                                
               , page="PricebookSelect"
               , object="Opportunity"
               , connection="Autoqagohw"
     )             
public class PricebookSelect {

	@ChoiceListType()
	@VisualforceBy(componentXPath = "apex:selectList[@id='price_book_select']")
	public WebElement price_book_select;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!setPricebook}']")
	public WebElement save;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!setPricebook}']")
	public WebElement save1;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!setPricebook}']")
	public WebElement save2;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!setPricebook}']")
	public WebElement save3;
	
}

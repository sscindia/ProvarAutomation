package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Gblite__ Grid"                                
               , summary=""
               , page="Grid"
               , namespacePrefix="GBLite"
               , object=""
               , connection="Bizsys"
     )             
public class gblite__Grid {

	@ButtonType()
	@FindByLabel(label = "NEW")
	public WebElement nEW;
	
}

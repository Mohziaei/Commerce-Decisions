package com.commercedecisions.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.commercedecisions.utilities.Const.*;

public class SearchResultPage extends BasePage{

    @FindBy ( xpath = noEvidenceItemXpath )
    public WebElement NoEvidenceItem;

    @FindBy (css = imageCss)
    public WebElement ImageLocator;


}

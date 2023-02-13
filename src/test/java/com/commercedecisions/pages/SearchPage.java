package com.commercedecisions.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static com.commercedecisions.utilities.Const.*;

public class SearchPage extends BasePage {


@FindBy( id = searchBoxId )
    public WebElement searchBox;

@FindBy( css  = searchButtonCss)
public WebElement SearchButton;

@FindBy(xpath = "//a[@href='/support/solutions/articles/80001015631-supplier-self-registration']")
public WebElement article;


}

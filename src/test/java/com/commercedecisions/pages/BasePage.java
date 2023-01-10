package com.commercedecisions.pages;

import com.commercedecisions.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
}

package com.commercedecisions.step_definitions;

import com.commercedecisions.pages.BasePage;
import com.commercedecisions.pages.SearchPage;
import com.commercedecisions.pages.SearchResultPage;
import com.commercedecisions.utilities.ConfigurationReader;
import com.commercedecisions.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.commercedecisions.utilities.Const.*;


public class SearchStepDefinitions {

    BasePage basePage = new BasePage();

    SearchPage searchPage = new SearchPage();

    SearchResultPage searchResultPage = new SearchResultPage();

    @Given("user is on the commerce decisions support home page")
    public void user_is_on_the_commerce_decisions_support_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }

    @When("user enters {string} and click search button")
    public void user_enters_and_click_search_button(String string) {
        Driver.waitById(searchBoxId);

        searchPage.searchBox.sendKeys("jaggaer");
        searchPage.SearchButton.click();
    }

    @When("user clicks {string} in the title")
    public void user_clicks_in_the_title(String string) {
        Driver.waitByXpath(noEvidenceItemXpath);
        searchResultPage.NoEvidenceItem.click();
    }

    @Then("user should see image with data id {string}")
    public void user_should_see_image_with_data_id(String string) {


        String attribute = searchResultPage.ImageLocator.getAttribute("data-id");
        Assert.assertEquals(image, attribute);
    }





}

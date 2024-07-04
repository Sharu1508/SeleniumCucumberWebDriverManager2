package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoggedInPage.*;


public class LoggedInPage  {
    @Then("^User should be able to view the Product category page$")

    public void User_should_be_able_to_view_the_Product_category_page() throws InterruptedException {

        visibility_productcategory_formalshoes();
        visibility_productcategory_sportsshoes();
        visibility_productcategory_sneakers();
    }

}

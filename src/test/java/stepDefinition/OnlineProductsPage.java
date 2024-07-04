package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static pages.OnlineProductPage.click_formalshoesdropdown;
import static pages.OnlineProductPage.getText_formalshoes_firstvalue;

public class OnlineProductsPage {

    //glue mechanism
    @When("^User clicks on formal Shoes drop down$")
    public void user_clicks_on_formal_shoes_drop_down() throws InterruptedException {
        click_formalshoesdropdown();
    }
    @When("^User should be able to view the Products$")
    public void user_should_be_able_to_view_the_products() throws InterruptedException {
        getText_formalshoes_firstvalue();
        assertEquals("   Classic Cheltenham", getText_formalshoes_firstvalue());
    }



}

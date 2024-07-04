package stepDefinition;

import io.cucumber.java.en.Given;
import static pages.HomePage.*;
public class HomePage {

    //glue mechanism
    @Given("^User navigates to the Login page$")
    public void User_navigate_to_the_Login_page() throws InterruptedException {

        click_hamburger_menu();
        click_SignIn_Link();

    }
    //We are adding the below here because, our online product link is on the home page.
    @Given("^User navigates to the Online product page$")
    public void User_navigates_to_the_online_product_page() throws InterruptedException {
        click_hamburger_menu();
        click_OnlineProduct_Link();

    }

}

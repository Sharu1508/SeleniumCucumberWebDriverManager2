package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.HomePage.click_SignIn_Link;
import static pages.HomePage.click_hamburger_menu;
import static pages.LoginPage.*;

public class LoginPage {

    //glue mechanism
    @When("^User successfully enters the Log in details$")
    public void User_successfully_enters_the_Log_in_details() throws InterruptedException {
        senkeys_username();
        sendkeys_password();
        click_login_btn();
    }

    @When("^User clicks on new Registration button$")
    public void user_clicks_on_new_registration_button() throws InterruptedException {
        click_NewRegister_btn();
    }
}

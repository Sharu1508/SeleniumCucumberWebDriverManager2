package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoginPage.*;
import static pages.RegistrationPage.user_registration;

public class RegistrationPage {

    //glue mechanism
    @Then("^User should be able to view the Registration page$")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        user_registration();
    }


}

package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String userregistration_xpath = "/html/body/center/h1";
    public static void user_registration() throws InterruptedException {
        String actualpagetitle = driver.findElement(By.xpath(userregistration_xpath)).getText();
        assertEquals("User Registration Page", actualpagetitle);
    }
}

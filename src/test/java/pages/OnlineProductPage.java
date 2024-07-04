package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class OnlineProductPage extends BrowserDriver {

    //public static String formalshoes_dropdown_class = "fa fa-angle-double-down formalshoedropdown";
    public static String formalshoes_dropdown_xpath = "//*[@class='fa fa-angle-double-down formalshoedropdown']";
    public static String formalshoes_webtable ="/html/body/div[2]/table";
    public static String formalshoes_webtable_tr ="/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String a="";
    public static void click_formalshoesdropdown() throws InterruptedException {

        driver.findElement(By.xpath(formalshoes_dropdown_xpath)).click();
    }
    public static String getText_formalshoes_firstvalue() throws InterruptedException {

        a= driver.findElement(By.xpath(formalshoes_webtable_tr)).getText();
        return  a;
    }
}

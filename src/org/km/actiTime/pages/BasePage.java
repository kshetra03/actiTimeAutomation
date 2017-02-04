package org.km.actiTime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/**
 * Created by kprusty on 22-01-2017.
 */
public abstract class BasePage {

    protected static WebDriver driver;

    // maximize browser window
    public static void maximize_browser_window() {
        driver.manage().window().maximize();
    }

    // get current url
    public static String get_curr_URL() {
        return driver.getCurrentUrl() ;
    }

    // get page title
    public static String get_curr_page_title() {
        return driver.getTitle() ;
    }

    // refresh browser
    public static void refresh_browser() {
        driver.navigate().refresh();
    }

    // implicitly wait
    public static void wait_implicitly() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
    }

    // explicitly wait for page to load - depends on element to load
    public static void wait_explicitly(By element) {
        WebDriverWait _explicit_wait = new WebDriverWait(driver, 10) ;
        _explicit_wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    // get placeholder or pre-filled value in any text box input element
    public String get_place_holder_value(By element) {
        return driver.findElement(element).getAttribute("placeholder") ;
    }


}

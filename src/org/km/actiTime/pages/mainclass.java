package org.km.actiTime.pages;

import org.km.actiTime.utils.ActiConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Admin on 22-01-2017.
 */
public class mainclass extends BasePage {

    public static void main(String[] args) {

        System.setProperty(ActiConstants._webdriver_ie_bin, ActiConstants._path_IE_driver_server);

        // ignore IE zoom issues
        DesiredCapabilities _ie_caps = DesiredCapabilities.internetExplorer() ;
        _ie_caps.setCapability("ignoreZoomSetting", true);
        driver = new InternetExplorerDriver(_ie_caps) ;
        driver.get(ActiConstants._url);

        System.out.println(driver.findElement(By.id("username")).getAttribute("placeholder"));
        LoginPage loginPage = new LoginPage() ;
        loginPage.perform_login();
        TopNavigationContainer topNavigationContainer = new TopNavigationContainer() ;
        wait_implicitly();

        topNavigationContainer.navigate_to_reports();
        wait_implicitly();
        List<WebElement> top_nav_list = driver.findElements(By.xpath("//table[@id='topnav']/tbody/tr/td[@class='navItem relative']/a")) ;
        for (WebElement we : top_nav_list) {
            String _top_nav_list_a_class = we.getAttribute("class") ;
            //System.out.println(_top_nav_list_a_class);
            //topNavigationContainer.navigate_to_reports();
            //wait_implicitly();
            if (_top_nav_list_a_class.contains("selected")){
                System.out.println(we.getText());
            }
        }

    }
}

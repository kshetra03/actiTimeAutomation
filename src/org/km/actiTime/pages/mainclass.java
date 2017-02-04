package org.km.actiTime.pages;

import org.km.actiTime.utils.ActiConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

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
    }
}

package org.km.actiTime.Tests;

import org.km.actiTime.pages.BasePage;
import org.km.actiTime.utils.ActiConstants;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by kprusty on 22-01-2017.
 */
public class ActiTimeTestRunner extends BasePage{

    @BeforeSuite
    public void init() {
        System.setProperty(ActiConstants._webdriver_ie_bin, ActiConstants._path_IE_driver_server);

        // ignore IE zoom issues
        DesiredCapabilities _ie_caps = DesiredCapabilities.internetExplorer() ;
        _ie_caps.setCapability("ignoreZoomSetting", true);
        driver = new InternetExplorerDriver(_ie_caps) ;
        driver.get(ActiConstants._url);
        maximize_browser_window();
    }


    /*@Test
    public void test_all() {
        TestListenerAdapter tla = new TestListenerAdapter() ;
        TestNG t = new TestNG() ;
        t.setTestClasses(new Class[]{
                LoginTest.class,
                SampleTest.class
        });
        t.addListener(tla);
        t.run();
    }*/

    @AfterSuite
    public void tearDown() {
        driver.quit();
        driver = null ;
    }
}

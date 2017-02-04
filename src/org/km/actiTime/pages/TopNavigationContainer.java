package org.km.actiTime.pages;

import org.openqa.selenium.By;

/**
 * Created by kprusty on 23-01-2017.
 */
public class TopNavigationContainer extends BasePage {

    private By _link_logout = By.id("logoutLink") ;
    private By _link_user_profile_name = By.xpath("//a[@class='userProfileLink username']") ;

    private By _link_time_track = By.xpath("//a[@class = 'content tt']") ;
    private By _link_reports = By.xpath("//a[@class = 'content reports']") ;
    private By _link_users = By.xpath("//a[@class = 'content users']") ;
    private By _link_tasks = By.xpath("//a[@class = 'content tasks']") ;
    private By _link_work_schedule = By.xpath("//a[@class = 'content calendar']") ;

    public void wait_until_the_page_is_loaded() {
        wait_explicitly(_link_logout);
    }

    public String get_user_profile_name() {
        wait_until_the_page_is_loaded();
        return driver.findElement(_link_user_profile_name).getText() ;
    }

    public void perform_logout() {
        // check if logout link is clickable
        wait_explicitly(_link_logout);
        driver.findElement(_link_logout).click();
    }

    public void navigate_to_users() {
        driver.findElement(_link_users).click();
    }

    public void navigate_to_tasks() {
        driver.findElement(_link_tasks).click();
    }

    public void navigate_to_reports() {
        driver.findElement(_link_reports).click();
    }

    public void navigate_to_work_schedule() {
        driver.findElement(_link_work_schedule).click();
    }

    // get the current selection in the topNav


}

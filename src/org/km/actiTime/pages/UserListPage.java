package org.km.actiTime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


/**
 * Created by kprusty on 23-01-2017.
 */
public class UserListPage extends BasePage {

    TopNavigationContainer UserTopNav = new TopNavigationContainer() ;

    // General -- top Userlist operations
    private By _lbl_text_title_user_list = By.xpath("//div[@class = 'textTitle']") ;
    private By _chk_show_users_with_disabled_access = By.id("showDisabledUsersChBox") ;
    private By btn_add_users = By.id("ext-gen6") ;

    // Table Header UserList
    private By _txt_input_search_username = By.id("userNameInput") ;
    private By _link_sort_by_name = By.id("sortByNameLink") ;
    private By _link_sort_by_working_week = By.id("sortByWeekLink") ;
    private By _link_sort_by_overtime = By.id("sortByOvertimeLink") ;

    // Bottom of UserList Table... Footer UserList Table
    private By lst_records_per_page_selector = By.id("recordsPerPageSelector") ;
    private By _link_userlist_table_nav_next = By.xpath("//a[@class = 'next']") ;
    private By _link_userlist_table_nav_prev = By.xpath("//a[@class = 'prev']") ;


    private By _user_list_table_get_rows = By.xpath("//table[@class = 'userListTable canEditUsers hidePTO sortByName']/tbody/tr") ;


    public void select_users_per_page(Integer sel_val) {
        Select user_select = new Select(driver.findElement(lst_records_per_page_selector)) ;
        user_select.selectByValue(sel_val.toString());
    }

    public void click_add_user(){
        driver.findElement(btn_add_users).click();
    }

    public void search_user_in_table(String user_name) {
        driver.findElement(_txt_input_search_username).clear();
        driver.findElement(_txt_input_search_username).sendKeys(user_name);
    }

    public int get_number_of_rows_of_user_list_table(){
        List<WebElement> user_list_table_rows = driver.findElements(_user_list_table_get_rows) ;
        return user_list_table_rows.size() ;
    }

    public void goto_user_list_page() {
        if (UserTopNav.get_curr_top_nav_container_value() != "User")
            UserTopNav.navigate_to_users();
    }

}

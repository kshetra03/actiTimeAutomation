package org.km.actiTime.pages;

import org.openqa.selenium.By;

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




}

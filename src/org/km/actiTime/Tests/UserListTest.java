package org.km.actiTime.Tests;

import org.km.actiTime.pages.BasePage;
import org.km.actiTime.pages.UserListPage;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by kprusty on 24-01-2017.
 */
public class UserListTest extends BasePage {

    UserListPage userListPage = new UserListPage() ;

    // test that for the first page for user list... the footer navigation prev link should be disabled

    // select 10 users per page...if the users are more than 10 the footer nav next should be enabled

    // count the number of users.. if records per page is more than the no of users..
    @Test
    public void test_that_select_user_list_per_page_works() {
        userListPage.goto_user_list_page();
        int sel_val = 10 ;
        userListPage.select_users_per_page(sel_val);
        Assert.assertTrue(sel_val >= userListPage.get_number_of_rows_of_user_list_table());

        sel_val = 25 ;
        userListPage.select_users_per_page(sel_val);
        Assert.assertTrue(sel_val >= userListPage.get_number_of_rows_of_user_list_table());

        sel_val = 50 ;
        userListPage.select_users_per_page(sel_val);
        Assert.assertTrue(sel_val >= userListPage.get_number_of_rows_of_user_list_table());

    }

    // the table footer nav should not be present

    // test search functionality
        //
}

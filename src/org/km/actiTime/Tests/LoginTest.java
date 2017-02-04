package org.km.actiTime.Tests;

import org.km.actiTime.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kprusty on 22-01-2017.
 */
public class LoginTest extends LoginPage{

    LoginPage loginPage = new LoginPage();


    @Test()
    public void test_that_username_has_correct_placeholder() {
        String _expected = "Username" ;
        //System.out.println(loginPage.get_place_holder_username());
        Assert.assertEquals(get_place_holder_value(get_txt_input_form_username()), _expected);
    }


    @Test
    public void test_that_password_has_correct_placeholder() {
        String _expected = "Password" ;
        Assert.assertEquals(get_place_holder_value(get_txt_input_form_password()), _expected);
    }

    @Test(dependsOnMethods = "test_that_username_has_correct_placeholder")
    public void login() {
        loginPage.perform_login();
        wait_implicitly();
    }
}

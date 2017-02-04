package org.km.actiTime.pages;

import org.km.actiTime.utils.ActiConstants;
import org.openqa.selenium.By;

/**
 * Created by kprusty on 22-01-2017.
 */
public class LoginPage extends BasePage{

    private By _txt_input_form_username = By.id("username") ;
    private By _txt_input_form_password = By.name("pwd") ;

    private By _chk_keep_me_logged_in = By.id("keepLoggedInCheckBox") ;

    private By _btn_login = By.id("loginButton") ;

    public By get_txt_input_form_username() {
        return _txt_input_form_username;
    }

    public By get_txt_input_form_password() {
        return _txt_input_form_password;
    }


    public void perform_login() {
        driver.findElement(_txt_input_form_username).sendKeys(ActiConstants._username);
        driver.findElement(_txt_input_form_password).sendKeys(ActiConstants._password);
        driver.findElement(_btn_login).click();
    }

    public void check_keep_me_logged_in() {
        driver.findElement(_chk_keep_me_logged_in).click();
    }

    public boolean get_status_chk_keep_me_logged_in(){
        return driver.findElement(_chk_keep_me_logged_in).isSelected() ;
    }
}

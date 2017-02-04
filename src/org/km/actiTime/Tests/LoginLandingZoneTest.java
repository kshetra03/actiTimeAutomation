package org.km.actiTime.Tests;

import org.km.actiTime.pages.BasePage;
import org.km.actiTime.pages.LoginLandingZonePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by kprusty on 23-01-2017.
 */
public class LoginLandingZoneTest extends BasePage{

    LoginLandingZonePage loginLandingZonePage = new LoginLandingZonePage() ;

    @Test
    public void test_correct_user_profile_name_for_admin(){
        String _expected = "Robert Barber" ;
        Assert.assertEquals(loginLandingZonePage.get_user_profile_name_from_landing_zone(), _expected);
    }

    // to be executed in the end
    @Test(dependsOnMethods = "test_correct_user_profile_name_for_admin")
    public void test_logout_redirects_to_login_page() {
        loginLandingZonePage.perform_logout_from_landing_zone();
        String _expected = "actiTIME - Login";
        String _actual = get_curr_page_title() ;
        Assert.assertEquals(_actual, _expected);
    }
}

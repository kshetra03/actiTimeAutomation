package org.km.actiTime.pages;

import org.openqa.selenium.By;

/**
 * Created by kprusty on 23-01-2017.
 */
public class LoginLandingZonePage extends BasePage {

    TopNavigationContainer landingZoneTopNav = new TopNavigationContainer() ;

    public void perform_logout_from_landing_zone() {
        landingZoneTopNav.perform_logout();
    }

    public String get_user_profile_name_from_landing_zone() {
        return landingZoneTopNav.get_user_profile_name() ;
    }
}

package org.km.actiTime.utils;

import org.km.actiTime.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Kshetra on 17-03-2017.
 */
public class Services extends BasePage{

    public void write_values_to_json(String _url){

        // find all the webelements like text boxes, drop-down selects, links, radio and check boxes etc
        List<WebElement> _list_all_links = driver.findElements(By.tagName("a")) ;
        List<WebElement> _list_all_textboxes = driver.findElements(By.xpath("//input[@type = 'text' or @type = 'password']"));
        List<WebElement> _list_all_dropdowns = driver.findElements(By.tagName("select")) ;
        List<WebElement> _list_all_radio = driver.findElements(By.xpath("//input[@type = 'radio']")) ;

        for (WebElement _textbox : _list_all_textboxes){
            System.out.println("-----text boxes ---------------");
            System.out.println("Enabled: " + _textbox.isEnabled());
            System.out.println("Displayed: " + _textbox.isDisplayed());
            System.out.println("Text Inside: " + _textbox.getAttribute("placeholder"));
        }

        for (WebElement _links : _list_all_links) {
            System.out.println("----------- links --------------");
            
        }


    }

}

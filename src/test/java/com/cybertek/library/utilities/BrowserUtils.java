package com.cybertek.library.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    /*
    Method that will accept int  arg
    Wait for given second duration

    //1sec = 1000 milli seconds
    //1 * 1000 = 1000

        Thread.sleep(1000);
        Thread.sleep(2000);
        Thread.sleep(3000);

        BrowserUtils.sleep(1); --> 1 second
     */

    public static void sleep(int second) {

        second*=1000;

        try {

            Thread.sleep(second);

        } catch (InterruptedException e) {

            System.out.println("something happened in the sleep method");

        }

    }

    public static List<String> getTextWebElements(List <WebElement> webElements){

        List <String> webElementsText = new ArrayList<>();
        for (WebElement each : webElements){
            webElementsText.add(each.getText());
        }

        return webElementsText;
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec ){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}

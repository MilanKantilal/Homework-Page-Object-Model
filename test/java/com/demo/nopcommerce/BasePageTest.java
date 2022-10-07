package com.demo.nopcommerce;

import com.demo.nopcommerce.Base.BasePage;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class BasePageTest {
    WebDriver driver;
    BasePage basePage;
    Properties prop;

    public void OpenBrowser(){

        basePage=new BasePage();

        prop =basePage.initialiseProperties();

        String webEngine=prop.getProperty("browser");

        driver=basePage .initialiseDriver(webEngine);

        driver.get(prop.getProperty("url"));

    }

}

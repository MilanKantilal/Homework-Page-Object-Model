package com.demo.nopcommerce;

import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Page.RegisterUser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class RegisterUserTest {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    RegisterUser registerUser;



    @BeforeMethod
    public void OpenBrowser()  {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerUser = new RegisterUser(driver);

    }
    @Test
    public void doRegisterUser(){
        registerUser.ClickRegisterLink();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        registerUser.doRegister(prop.getProperty("Gender1"),prop.getProperty("FirstName1"), prop.getProperty("LastName1"),prop.getProperty("DateOfBirthDay"),prop.getProperty("DateOfBirthMonth"),prop.getProperty("DateOfBirthYear"),prop.getProperty("Email"),prop.getProperty("Company1"),prop.getProperty("Password1"), prop.getProperty("ConfirmPassword2"));
    }

//    //@AfterMethod
//    //public void tearDown(){
//        driver.quit();
//    }
}

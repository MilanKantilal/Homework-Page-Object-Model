package com.demo.nopcommerce.Page;

import com.demo.nopcommerce.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RegisterUser {

    WebDriver driver;
    Utils utils;

    By RegisterLink=By.className("ico-register");
    By Gender=By.xpath("//*[@id=\"gender-male\"]");
    By FirstName=By.xpath("//*[@id=\"FirstName\"]");
    By LastName=By.id("LastName");

    By DateOfBirthDay=By.name("DateOfBirthDay");
    By DateOfBirthMonth=By.name("DateOfBirthMonth");
    By DateOfBirthYear=By.name("DateOfBirthYear");
    By EmailID=By.id("Email");

    By Company=By.id("Company");
    By Password=By.id("Password");
    By ConfirmPassword=By.id("ConfirmPassword");
    By Registerbutton=By.xpath("//*[@id=\"register-button\"]");


    public RegisterUser(WebDriver driver){
        this.driver=driver;
        utils=new Utils(driver);
    }

    public void ClickRegisterLink(){utils.doClick(RegisterLink);}

    public void doRegister(String Gender1,String FirstName1,String LastName1,String DofBD,String DofBM,String DofBY,String Email,String Company1,String Password1,String ConfirmPassword2){

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        utils.doClick(Gender);
        utils.doSendkey(FirstName,FirstName1);
        utils.doSendkey(LastName,LastName1);

        utils.doSendkey(DateOfBirthDay,DofBD);
        utils.doSendkey(DateOfBirthMonth,DofBM);
        utils.doSendkey(DateOfBirthYear,DofBY);

        utils.doSendkey(EmailID,Email);
        utils.doSendkey(Company,Company1);
        utils.doSendkey(Password,Password1);
        utils.doSendkey(ConfirmPassword,ConfirmPassword2);
        utils.doClick(Registerbutton);

    }

    }




package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    
    @FindBy(name = "USER_LOGIN")
    public WebElement LoginInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    public void login(String usernameStr,String passwordStr){

        LoginInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();

    }

    public void loginAsHelpDesk(){
        String username = ConfigurationReader.get("helpdesk15_username");
        String password = ConfigurationReader.get("helpdesk15_password");
        LoginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsMarketing(){
        String username = ConfigurationReader.get("marketing15_username");
        String password = ConfigurationReader.get("marketing15_password");
        LoginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsHR(){
        String username = ConfigurationReader.get("hr15_username");
        String password = ConfigurationReader.get("hr15_password");
        LoginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

}

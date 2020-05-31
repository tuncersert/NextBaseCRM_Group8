package com.cybertek.tests.gitPracticeOnly;

import com.cybertek.pages.LoginPage;
import com.cybertek.pages.MessageTab;
import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ugur2RecordVideoTest extends TestBase {

    @Test
    public void recordVid() {
        extentLogger=report.createTest("Test ");
        extentLogger.info("We login as marketting");
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsMarketing();
        extentLogger.info("we click Messages tab");
        MessageTab messageTab=new MessageTab();
        messageTab.messageTab.click();
        extentLogger.info("We click the Record Video Button");
        messageTab.RecordVideoButton.click();
        extentLogger.info("We click the allow button");
        messageTab.RecordVideoAllowButton.click();
        extentLogger.info("we will save the error message");
        String ActualMessage=messageTab.RecordVideoErrorMessageText.getText();
        String ExpectedMessage="Cannot access your camera and microphone";
        extentLogger.info("verify the messages");
        Assert.assertEquals(ActualMessage,ExpectedMessage,"error message");
        extentLogger.pass("there is an error in the system");
        extentLogger.info("logout");
        messageTab.ClickUsernameBeforeLogout.click();
        messageTab.Logout.click();
//        driver.findElement(By.cssSelector("#user-name")).click();
//        driver.findElement(By.xpath("//span[text()='Log out']")).click();
        //driver.quit();


    }
}

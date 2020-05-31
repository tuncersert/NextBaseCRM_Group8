package com.cybertek.tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.pages.MessageTab;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopicMessageBox extends TestBase {

    @Test
    public void TopicMessageBoxIsDisplayed() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();

        MessageTab messageTab = new MessageTab();
        messageTab.topic.click();
        Thread.sleep(2000);
        Assert.assertTrue(messageTab.topicBox.isDisplayed(), "verify that topic box is displayed");


    }
}
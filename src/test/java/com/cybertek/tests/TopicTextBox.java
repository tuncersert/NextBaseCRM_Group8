package com.cybertek.tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.pages.MessageTab;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopicTextBox extends TestBase {

    @Test
    public void topicMessageBoxIsDisplayed() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        MessageTab messageTab = new MessageTab();
        messageTab.topic.click();
        Assert.assertTrue(messageTab.topicBox.isDisplayed(), "verify topic message box is displayed");
    }

}
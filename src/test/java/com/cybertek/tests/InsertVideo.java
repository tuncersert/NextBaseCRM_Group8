package com.cybertek.tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InsertVideo extends TestBase {

    @Test
    public void insertVideoTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();

        MessageTab messageTab = new MessageTab();
        messageTab.sendVideo("https://www.youtube.com/watch?v=Zv8-hrGiGno&t=6s");
        BrowserUtils.waitFor(5);

        //WebElement VideoNotFoundMessage = Driver.get().findElement(By.xpath("//span[@class='bxhtmled-video-error']"));
        //Assert.assertEquals(VideoNotFoundMessage.getText(),"[FVID404] The video was not found;","Verify appeared message");

        messageTab.submitVideo.click();
        WebElement videoUpload = Driver.get().findElement(By.className("bxhtmled-surrogate-dd"));
        BrowserUtils.waitForVisibility(videoUpload,15);
        Assert.assertTrue(videoUpload.isDisplayed(),"Check if the element is displayed");

    }


}

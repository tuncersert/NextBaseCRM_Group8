package com.cybertek.pages;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageTab extends BasePage {
    public MessageTab() {
        PageFactory.initElements(Driver.get(),this);
        messageTab.click();
    }

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageTab;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesBtn;

    @FindBy(css = "span[class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkBtn;

    @FindBy(css = "span[class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement insertVideoBtn;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceBox;

    @FindBy(id = "undefined")
    public WebElement submitVideo;


    public void clickUploadFiles(){
        uploadFilesBtn.click();
    }

    public void clicklink(){
        linkBtn.click();
    }

    public void sendVideo(String videoURL){
        insertVideoBtn.click();
        videoSourceBox.sendKeys(videoURL);
    }


}



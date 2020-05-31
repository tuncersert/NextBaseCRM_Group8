package com.cybertek.pages;


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

    // Record Vidoe links by Ugur
    @FindBy(xpath = "( //div[@id='post-buttons-bottom']/span[text()='Record Video'])[1]")
    public WebElement RecordVideoButton;

    @FindBy(css = ".popup-window-button.popup-window-button-blue")
    public WebElement RecordVideoAllowButton;

    @FindBy(css = "#popup-window-content-bx-popup-videomessage-popup")
    public WebElement RecordVideoErrorMessageText;

    @FindBy(css = "#user-name")
    public WebElement ClickUsernameBeforeLogout;

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement Logout;


}



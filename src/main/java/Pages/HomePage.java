package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class HomePage extends PageBase{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(id ="universal-nav-logo")
    WebElement universal_logo;

    @FindBy(id = "toggle-lang-button")
    public WebElement language_button;
    @FindBy(id = "toggle-button-nav")
    public WebElement menu_button;
    @FindBy(xpath = "//*[@id=\"universal-nav\"]/div[2]/a/span[2]")
    public WebElement signin_button;
    @FindBy(className = "login-btn-icon")
    public WebElement get_start_login ;
    @FindBy(xpath = "//*[@id=\"universal-nav\"]/div[2]/ul[2]/li[1]/a")
    public WebElement donation_page;
    @FindBy(xpath = "//*[@id=\"universal-nav\"]/div[2]/ul[2]/li[2]/a")
    public WebElement curriculum_page;
    @FindBy(xpath = "//*[@id=\"universal-nav\"]/div[2]/ul[2]/li[3]/a")
    public WebElement forum_page;
    @FindBy(xpath = "/html/body/div/div[1]/div/div/header/nav/div[2]/ul[2]/li[4]")
    public WebElement settingPage;



    public void open_learn_page(){ universal_logo.click();}
    public void     open_signin_page(){signin_button.click();}
    public void  open_signin_page2(){get_start_login.click();}
    public void open_donation_page(){
        menu_button.click();
        donation_page.click();
    }
    public void open_curriculum_page(){
        menu_button.click();
        curriculum_page.click();
    }
    public void open_forum_page(){
        menu_button.click();
        forum_page.click();
    }

    public void open_settings_page(){
        menu_button.click();
        settingPage.click();
    }


//    @FindBy(linkText = "ACCOUNT")
//    WebElement accountList;
//    @FindBy(css = "a[title=\"My Account\"]")
//    WebElement myAccount;
//    public void Open_mobilePage()
//    {
//        mobile.click();
//    }
//    public void Open_login_CreateAccPage()
//    {
//        accountList.click();
//        myAccount.click();
//    }
}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SettingsPage  extends PageBase {
    public SettingsPage(WebDriver driver){super(driver);}

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div/main/section[3]/section[1]/div/div/table/tbody/tr[6]/td/a")
    WebElement getCertificateBtn;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div[1]/div")
   public WebElement certificationAlert;
    @FindBy(id = "username-settings")
    WebElement username;

    @FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div/main/form/div[2]/div/div")
    public WebElement checkUsername;
    @FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div/main/form/div[3]/div/button")
    public WebElement saveUsernameBtn;
    @FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div/main/div[6]/div/fieldset[1]/div[2]/button[1]")
    WebElement nightModeON;
    @FindBy(xpath = "/html/body/div/div[1]/div/div/div[2]/div/main/div[6]/div/fieldset[1]/div[2]/button[2]")
    WebElement nightModeOFF;


   @FindBy(id = "username-settings")
    WebElement name;
   @FindBy(id = "username-settings")
    WebElement location;
   @FindBy(id = "username-settings")
    WebElement picture;
   @FindBy(id = "username-settings")
    WebElement about;


   public  void changeUserName(String user){
       username.sendKeys(user);
   }

    public void saveUserName(){
       saveUsernameBtn.click();
    }
    public void getCertification(){
        getCertificateBtn.click();
    }


}

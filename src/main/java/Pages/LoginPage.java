package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(name = "username")
    WebElement getSignin_email;
    @FindBy(xpath = "/html/body/div/main/div/div/div/main/section/div/div/div/div[4]/form[1]/button")
    WebElement getSignin_google;
    @FindBy(xpath = "/html/body/div/main/div/div/div/main/section/div/div/div/div[4]/form[2]/button")
    WebElement getSignin_github;
   @FindBy(xpath = "/html/body/div/main/div/div/div/main/section/div/div/div/div[4]/form[3]/button")
    WebElement getSignin_apple;
   @FindBy(name ="action" )
    WebElement submit_button;
   @FindBy(xpath = "/html/body/div/main/div/div/div/main/section/div/div/div/div[2]/p/a")
    WebElement signup;


   public void signinWithGoogle(){ getSignin_google.click();}
   public void signinWithGitHub(){getSignin_github.click();}
   public void signinWithApple(){getSignin_apple.click();}
   public void signinWithEmail(String email) throws InterruptedException {
       getSignin_email.sendKeys(email);
       getSignin_email.submit();
       Thread.sleep(20000);
       submit_button.click();
   }
   public void signupPage(){signup.click();}

}

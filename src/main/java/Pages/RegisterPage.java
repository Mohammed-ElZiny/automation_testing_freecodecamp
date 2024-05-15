package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class RegisterPage extends PageBase {

    public RegisterPage(WebDriver driver){super(driver);}



    @FindBy(id = "email")
    WebElement signup_email;
    @FindBy(xpath = "/html/body/div/main/div/div/div/main/section/div/div/div/div[4]/form[1]/button")
    WebElement getSignup_google;
    @FindBy(xpath = "/html/body/div/main/div/div/div/main/section/div/div/div/div[4]/form[2]/button")
    WebElement getSignup_github;
    @FindBy(xpath = "/html/body/div/main/div/div/div/main/section/div/div/div/div[4]/form[3]/button")
    WebElement getSignup_apple;
    @FindBy(xpath ="/html/body/div/main/div/div/div/main/section/div/div/div/div/div/form/div[3]/button" )
    WebElement submit_button;
    @FindBy(xpath = "/html/body/div/main/div/div/div/main/section/div/div/div/div[2]/p/a")
    WebElement loginPage;

    @FindBy(id = "code")
    WebElement verify_code;

    @FindBy(xpath = "/html/body/div/main/div/div/div/main/section/div/div/div/div/div/div/form/button")
    WebElement resend_button;


    public void signupWithGoogle(){ getSignup_google.click();}
    public void signupWithGitHub(){getSignup_github.click();}
    public void signupWithApple(){getSignup_apple.click();}
    public void signupWithEmail(String email) throws InterruptedException {
        signup_email.sendKeys(email);
        signup_email.submit();
        Thread.sleep(20000);

    }
    public void loginPage(){loginPage.click();}



}

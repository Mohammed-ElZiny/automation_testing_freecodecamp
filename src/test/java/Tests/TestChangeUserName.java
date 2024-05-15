package Tests;

import Pages.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestChangeUserName extends TestBase{
    HomePage homePage;
    SettingsPage settingsPage;
    LoginPage loginPage;

    @BeforeMethod
    public void TestLoginAccount() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.open_signin_page();
        loginPage=new LoginPage(driver);
        loginPage.signinWithEmail("mohammed4ziny@gmail.com");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


    }

    @Test
    public void changeUserNameTest(){
        homePage = new HomePage(driver);
        homePage.open_settings_page();
        settingsPage = new SettingsPage(driver);
        settingsPage.changeUserName("Ahmed2025546");

        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(settingsPage.checkUsername));
        Assert.assertEquals(settingsPage.checkUsername.getText(), "Username is available");

        wait.until(ExpectedConditions.elementToBeClickable(settingsPage.saveUsernameBtn));
        settingsPage.saveUserName();
        Assert.assertEquals(settingsPage.certificationAlert.getText(), "We have updated your username to Ahmed2025546");
    }
}
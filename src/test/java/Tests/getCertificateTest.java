package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SettingsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class getCertificateTest extends TestBase{

    HomePage homePage;
    SettingsPage settingsPage;

    LoginPage loginPage;

    public void TestLoginAccount() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.open_signin_page();
        loginPage=new LoginPage(driver);
        loginPage.signinWithEmail("mohammed4ziny@gmail.com");


    }

    @Test
    public void getCertificationTest(){

        homePage.open_settings_page();
        settingsPage = new SettingsPage(driver);
        settingsPage.getCertification();
        Assert.assertEquals(settingsPage.certificationAlert.getText()   ,"It looks like you have not completed the necessary steps. Please complete the required projects to claim the Responsive Web Design Certification.");

    }



}

package Tests;

import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestLogin extends TestBase{
    HomePage homePage;
    LoginPage loginPage;

    @Test
    public void TestLoginAccount() throws InterruptedException {
        homePage=new HomePage(driver);
        homePage.open_signin_page();
        loginPage=new LoginPage(driver);
        loginPage.signinWithEmail("mohammed4ziny@gmail.com");
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


    } }


